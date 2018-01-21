/*
 * Copyright (c) 2017. CK. All rights reserved.
 */

package com.tyj.jhpt.service;

/**
 * Created by IntelliJ IDEA.
 * Author: CK
 * Date: 2016/5/2
 */
public interface IShortMsgSender {
    /**
     * 短信发送接口，所有的短信由该接口发送出去。<br>
     * 使用不同的短信厂家，只需实现该接口，并注入相关业务类即可。
     *
     * @param devicePhoneNo
     *            要发送的号码
     * @param msg
     *            发送内容
     * @return
     */
    public int send(String devicePhoneNo, String msg);

    /**
     * 发短信
     *
     * @param apikey
     *            apikey
     * @param text
     *            　短信内容　
     * @param mobile
     *            　接受的手机号
     * @return json格式字符串
     */
    String sendSms(String apikey, String text, String mobile);

    /**
     * 取账户信息
     *
     * @return json格式字符串
     */
    String getUserInfo(String apikey);

    /**
     * 通过模板发送短信
     *
     * @param apikey
     *            apikey
     * @param tpl_id
     *            　模板id
     * @param tpl_value
     *            　模板变量值　
     * @param mobile
     *            　接受的手机号
     * @return json格式字符串
     */
    String tplSendSms(String apikey, long tpl_id, String tpl_value, String mobile);
}
