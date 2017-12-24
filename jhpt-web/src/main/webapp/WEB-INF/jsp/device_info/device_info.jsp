<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>录入用户列表</title>
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <b>类型：</b>
            <select class="easyui-combobox" id="type" data-options="panelHeight:'auto'" style="width:200px;">
                <option value="0">已录入用户信息列表</option>
                <option value="1">新录入用户信息列表</option>
            </select>
            <b>关键字：</b>
            <input class="easyui-textbox" type="text" id="keyword" name="keyword" data-options="prompt:'姓名/车牌/微信号'" size="30" />
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
            <auth:auth test="device/add_device">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="doAdd()">新增</a>
            </auth:auth>
            <auth:auth test="device/edit_device">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdit()">编辑</a>
            </auth:auth>
        </div>
        <div id="a" class="easyui-window" title="新增用户" data-options="closed:true," style="width:500px;height:560px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="f" class="easyui-form">
                        <table cellpadding="5">
                            <tr>
                                <td>姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>年龄:</td>
                                <td><input class="easyui-textbox" type="text" name="age" data-options="required:true,validType:'age'"/></td>
                            </tr>
                            <tr>
                                <td>驾照类型:</td>
                                <td><input class="easyui-combobox" id="aDrivingLicense" name="drivingLicense" data-options="required:true,panelHeight:'auto'"></td>
                            </tr>
                            <tr>
                                <td>身份证号:</td>
                                <td><input class="easyui-textbox" type="text" name="identityNo" data-options="required:true,validType:'idcard'"/></td>
                            </tr>
                            <tr>
                                <td>手机号:</td>
                                <td><input class="easyui-textbox" type="text" name="telephone" data-options="required:true,validType:'mobile'"/></td>
                            </tr>
                            <tr>
                                <td>车牌号:</td>
                                <td><input class="easyui-textbox" type="text" name="plateNo" data-options="required:true,validType:'carNo'"/></td>
                            </tr>
                            <tr>
                                <td>车型:</td>
                                <td><input class="easyui-combobox" id="aCarType" name="carType" data-options="required:true,panelHeight:'auto'"></td>
                            </tr>
                            <tr>
                                <td>SIM卡ICCID号:</td>
                                <td><input class="easyui-textbox" type="text" name="iccid" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>终端序列号:</td>
                                <td><input class="easyui-textbox" type="text" name="terminalSeq" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>VIN:</td>
                                <td><input class="easyui-textbox" type="text" name="carVin" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>车载终端编号:</td>
                                <td><input class="easyui-textbox" type="text" name="terminalNo" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>驱动电机型号:</td>
                                <td><input class="easyui-textbox" type="text" name="dianjiNo"/></td>
                            </tr>
                            <tr>
                                <td>发动机编号:</td>
                                <td><input class="easyui-textbox" type="text" name="fadongjiNo"/></td>
                            </tr>
                            <tr>
                                <td>微信账号:</td>
                                <td><input class="easyui-textbox" type="text" name="weixinAccount" /></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#f'), 'add_device_info', $('#a'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#a'));clearForm($('#f'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
        <div id="e" class="easyui-window" title="编辑用户" data-options="closed:true," style="width:500px;height:560px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="ef" class="easyui-form">
                        <table cellpadding="5">
                            <input type="hidden" name="id"/>
                            <tr>
                                <td>姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>年龄:</td>
                                <td><input class="easyui-textbox" type="text" name="age" data-options="required:true,validType:'age'"/></td>
                            </tr>
                            <tr>
                                <td>驾照类型:</td>
                                <td><input class="easyui-combobox" id="eDrivingLicense" name="drivingLicense" data-options="required:true,panelHeight:'auto'"></td>
                            </tr>
                            <tr>
                                <td>身份证号:</td>
                                <td><input class="easyui-textbox" type="text" name="identityNo" data-options="required:true,validType:'idcard'"/></td>
                            </tr>
                            <tr>
                                <td>手机号:</td>
                                <td><input class="easyui-textbox" type="text" name="telephone" data-options="required:true,validType:'mobile'"/></td>
                            </tr>
                            <tr>
                                <td>车牌号:</td>
                                <td><input class="easyui-textbox" type="text" name="plateNo" data-options="required:true,validType:'carNo'"/></td>
                            </tr>
                            <tr>
                                <td>车型:</td>
                                <td><input class="easyui-combobox" id="eCarType" name="carType" data-options="required:true,panelHeight:'auto'"></td>
                            </tr>
                            <tr>
                                <td>SIM卡ICCID号:</td>
                                <td><input class="easyui-textbox" type="text" name="iccid" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>终端序列号:</td>
                                <td><input class="easyui-textbox" type="text" name="terminalSeq" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>VIN:</td>
                                <td><input class="easyui-textbox" type="text" name="carVin" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>车载终端编号:</td>
                                <td><input class="easyui-textbox" type="text" name="terminalNo" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>驱动电机型号:</td>
                                <td><input class="easyui-textbox" type="text" name="dianjiNo"/></td>
                            </tr>
                            <tr>
                                <td>发动机编号:</td>
                                <td><input class="easyui-textbox" type="text" name="fadongjiNo"/></td>
                            </tr>
                            <tr>
                                <td>微信账号:</td>
                                <td><input class="easyui-textbox" type="text" name="weixinAccount" /></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#ef'), 'edit_device_info', $('#e'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#e'));clearForm($('#ef'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/action.js"></script>