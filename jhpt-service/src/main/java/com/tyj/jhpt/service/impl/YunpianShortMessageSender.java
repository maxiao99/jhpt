/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service.impl;

import com.github.fartherp.framework.common.util.HttpClientUtils;
import com.github.fartherp.framework.common.util.JsonUtil;
import com.tyj.jhpt.service.IShortMsgSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/2
 */
@Service("yunpianShortMessageSender")
public class YunpianShortMessageSender implements IShortMsgSender {
    /**
     * 服务http地址
     */
    private String BASE_URI = "http://yunpian.com";
    /**
     * 服务版本号
     */
    private String VERSION = "v1";
    /**
     * 查账户信息的http地址
     */
    private String URI_GET_USER_INFO = BASE_URI + "/" + VERSION + "/user/get.json";
    /**
     * 通用发送接口的http地址
     */
    private String URI_SEND_SMS = BASE_URI + "/" + VERSION + "/sms/send.json";
    /**
     * 模板发送接口的http地址
     */
    private String URI_TPL_SEND_SMS = BASE_URI + "/" + VERSION + "/sms/tpl_send.json";

    private String apikey = "7ddf4459c14fa024bb6fbfe9288c5ed5";

    public String getUserInfo(String apikey) {
        return HttpClientUtils.executeGet(URI_GET_USER_INFO + "?apikey=" + apikey);
    }

    public String sendSms(String apikey, String text, String mobile) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("apikey", apikey);
        params.put("text", text);
        params.put("mobile", mobile);
        return HttpClientUtils.execute(params, URI_SEND_SMS);
    }

    public String tplSendSms(String apikey, long tpl_id, String tpl_value, String mobile) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("apikey", apikey);
        params.put("tpl_id", String.valueOf(tpl_id));
        params.put("tpl_value", tpl_value);
        params.put("mobile", mobile);
        return HttpClientUtils.execute(params, URI_SEND_SMS);
    }

    public int send(String devicePhoneNo, String msg) {
        try {
            String response = sendSms(apikey, msg, devicePhoneNo);
            YunpianBo o = JsonUtil.fromJson(response, YunpianBo.class);
            return o.getCode();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    class YunpianBo {
        private int code;
        private String msg;
        private String detail;
        private YunpianResult result;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public YunpianResult getResult() {
            return result;
        }

        public void setResult(YunpianResult result) {
            this.result = result;
        }
    }

    class YunpianResult {
        private int count;
        private double fee;
        private long sid;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        public long getSid() {
            return sid;
        }

        public void setSid(long sid) {
            this.sid = sid;
        }
    }
}
