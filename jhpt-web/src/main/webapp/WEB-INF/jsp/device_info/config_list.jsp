<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>设备配置列表</title>
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <b>关键字：</b>
            <input class="easyui-textbox" type="text" id="keyword" name="keyword" data-options="prompt:'姓名/车牌/微信号'" size="30" />
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
            <auth:auth test="config/one_config">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdit()">配置</a>
            </auth:auth>
            <auth:auth test="config/more_config">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdits()">批量配置</a>
            </auth:auth>
        </div>
        <div id="a" class="easyui-window" title="核对信息" data-options="closed:true," style="width:700px;height:320px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="af" class="easyui-form">
                        <table cellpadding="5">
                            <tr>
                                <td>批量配置设备:</td>
                                <td><input class="easyui-textbox" type="text" name="deviceId" data-options="readonly:true" size="70"/></td>
                            </tr>
                            <tr>
                                <td>是否覆盖:</td>
                                <td><input class="easyui-combobox" id="aoverrideVideo" name="overrideVideo" data-options="panelHeight:'auto'"/></td>
                            </tr>
                            <tr>
                                <td>大车小车:</td>
                                <td><input class="easyui-combobox" id="acarType" name="carType" data-options="panelHeight:'auto'"/></td>
                            </tr>
                            <tr>
                                <td>事前:</td>
                                <td><input class="easyui-combobox" id="avideoLengthBeforeInterrupt" name="videoLengthBeforeInterrupt" size="5" data-options="panelHeight:'auto'"/>秒</td>
                            </tr>
                            <tr>
                                <td>事后:</td>
                                <td><input class="easyui-combobox" id="avideoLengthAfterInterrupt" name="videoLengthAfterInterrupt" size="5" data-options="panelHeight:'auto'"/>秒</td>
                            </tr>
                            <tr>
                                <td>上传定位间隔:</td>
                                <td><input class="easyui-textbox" type="text" name="gpsMsgSendInterval" size="5" data-options="panelHeight:'auto'"/>分钟 （输入5到30之间的某个数）</td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#af'), 'config', $('#a'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#a'));clearForm($('#af'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
        <div id="e" class="easyui-window" title="核对信息" data-options="closed:true," style="width:500px;height:450px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="ef" class="easyui-form">
                        <table cellpadding="5">
                            <input type="hidden" name="deviceId"/>
                            <tr>
                                <td>姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>车牌号:</td>
                                <td><input class="easyui-textbox" type="text" name="plateNo" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>车型:</td>
                                <td><input class="easyui-combobox" id="ecarType" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>设备SIM卡号:</td>
                                <td><input class="easyui-textbox" type="text" name="phoneOfDevice" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>过期时间:</td>
                                <td><input class="easyui-textbox" type="text" name="outofdateTime" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>是否覆盖:</td>
                                <td><input class="easyui-combobox" id="overrideVideo" name="overrideVideo" data-options="panelHeight:'auto'"/></td>
                            </tr>
                            <tr>
                                <td>大车小车:</td>
                                <td><input class="easyui-combobox" id="carType" name="carType" data-options="panelHeight:'auto'"/></td>
                            </tr>
                            <tr>
                                <td>事前:</td>
                                <td><input class="easyui-combobox" id="videoLengthBeforeInterrupt" name="videoLengthBeforeInterrupt" size="5" data-options="panelHeight:'auto'"/>秒</td>
                            </tr>
                            <tr>
                                <td>事后:</td>
                                <td><input class="easyui-combobox" id="videoLengthAfterInterrupt" name="videoLengthAfterInterrupt" size="5" data-options="panelHeight:'auto'"/>秒</td>
                            </tr>
                            <tr>
                                <td>上传定位间隔:</td>
                                <td><input class="easyui-textbox" type="text" name="gpsMsgSendInterval" size="5" data-options="panelHeight:'auto'"/>分钟 （输入5到30之间的某个数）</td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#ef'), 'config', $('#e'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#e'));clearForm($('#ef'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/config_model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/config_action.js"></script>
