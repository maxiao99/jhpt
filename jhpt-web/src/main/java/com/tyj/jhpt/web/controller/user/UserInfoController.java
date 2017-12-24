/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

package com.tyj.jhpt.web.controller.user;

import com.github.fartherp.framework.common.util.DateUtil;
import com.github.fartherp.framework.common.util.HttpClientUtils;
import com.github.fartherp.framework.common.util.JsonUtil;
import com.github.fartherp.framework.core.util.JsonResp;
import com.github.fartherp.framework.core.web.filter.auth.AuthWrapper;
import com.github.fartherp.framework.core.web.filter.auth.GeneralAuthWrapper;
import com.github.fartherp.framework.core.web.http.session.SessionProvider;
import com.tyj.jhpt.bo.User;
import com.tyj.jhpt.server.SystemConfig;
import com.tyj.jhpt.service.UserService;
import com.tyj.jhpt.vo.UserPageVo;
import com.tyj.jhpt.web.controller.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/1
 */
@Controller
@RequestMapping(value = "user")
public class UserInfoController extends AbstractController {
    @Resource(name = "userService")
    UserService userService;

    @Resource(name = "sessionProvider")
    SessionProvider sessionProvider;

    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam Map<String, Object> param) {
        ModelAndView mv;
        User user = userService.findUserByMap(param);
        if (null == user) {
            mv = new ModelAndView("redirect:/");
            mv.addObject("message", "用户名或密码错误");
            return mv;
        }
        String url = SystemConfig.getStr("auth.url");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", user.getAuthId());
        params.put("systemId", 4);
        String json = HttpClientUtils.execute(params, url);
        GeneralAuthWrapper generalAuthWrapper = JsonUtil.fromJson(json, GeneralAuthWrapper.class);
        if (generalAuthWrapper.getStatus() != 0) {
            mv = new ModelAndView("redirect:/");
            mv.addObject("message", generalAuthWrapper.getStatusInfo());
            return mv;
        }
        sessionProvider.setAttribute(AuthWrapper.SESSION_USER_MESSAGE, user);
        sessionProvider.setAttribute(AuthWrapper.SESSION_AUTH_WRAPPER_MESSAGE, generalAuthWrapper.getData());
        List l = generalAuthWrapper.getData().getMenuList();
        if (l != null && !l.isEmpty()) {
            mv = new ModelAndView("common/frame");
            mv.addObject("message", JsonResp.asList().addAll(l).toJson());
            mv.addObject("userNameShow", user.getUserName());
            return mv;
        }
        mv = new ModelAndView("redirect:/");
        mv.addObject("message", "没有菜单,请找管理员");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/page/list")
    public String list(UserPageVo vo) {
        List<User> l = userService.findPageUser(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }

    @ResponseBody
    @RequestMapping(value = "/add_user")
    public String addUser(User user) {
        User u = userService.findByUserName(user.getUserName());
        if (u != null) {
            return JsonResp.asData().error("用户名已存在,请重新添加").toJson();
        }
        User userInfos = (User) sessionProvider.getAttribute(AuthWrapper.SESSION_USER_MESSAGE);
        user.setCreatorId(userInfos.getId());
        user.setCreateTime(new Date());
        userService.saveEntitySelective(user);
        return JsonResp.asData().success().toJson();
    }

    @ResponseBody
    @RequestMapping(value = "/edit_user")
    public String editUser(User user) {
        User u = userService.findByUserName(user.getUserName());
        if (u != null && !u.getId().equals(user.getId())) {
            return JsonResp.asData().error("用户名已存在,请重新编辑").toJson();
        }
        userService.updateEntitySelective(user);
        return JsonResp.asData().success().toJson();
    }

    @RequestMapping(value = "/loginOut")
    public ModelAndView loginOut() {
        sessionProvider.logout();
        return new ModelAndView("redirect:/");
    }
}
