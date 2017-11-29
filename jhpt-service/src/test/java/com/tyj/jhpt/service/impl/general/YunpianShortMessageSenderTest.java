package com.tyj.jhpt.service.impl.general;

import com.tyj.jhpt.service.IShortMsgSender;
import com.tyj.jhpt.service.impl.YunpianShortMessageSender;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YunpianShortMessageSenderTest {

    @InjectMocks
    IShortMsgSender service;
    // 手机号
    String mobile = "18611714795";
    // apikey
    String apikey = "c443ab1b901a57d40ab5132539a0c356";

    @BeforeClass(alwaysRun = true)
    public void initMocks() {
        service = new YunpianShortMessageSender();
        MockitoAnnotations.initMocks(this);
    }

//    @Test
    public void testGetUserInfo() throws Exception {
        /**************** 查账户信息调用示例 *****************/
        String s = service.getUserInfo(apikey);
        System.out.println(s);
    }

//    @Test
    public void testSendSms() throws Exception {
        /**************** 使用通用接口发短信 *****************/
        //设置您要发送的内容
        String text = "您的验证码是1234【元厚教育】";
        //发短信调用示例
        String result = service.sendSms(apikey, null, mobile);
        System.out.println(result);
    }

//    @Test
    public void testTplSendSms() throws Exception {
        /**************** 使用模板接口发短信 *****************/
        //设置模板ID，如使用1号模板:您的验证码是#code#【#company#】
        long tpl_id=1;
        //设置对应的模板变量值
        String tpl_value="#code#=1234&#company#=云片网";
        //模板发送的调用示例
        String result = service.tplSendSms(apikey, tpl_id, tpl_value, mobile);
        System.out.println(result);
    }

    @Test
    public void testSend() throws Exception {

    }
}