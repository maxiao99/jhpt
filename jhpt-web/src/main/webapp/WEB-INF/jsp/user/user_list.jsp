<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>账户列表</title>
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <b>类型：</b>
            <select class="easyui-combobox" id="type" data-options="panelHeight:'auto'" style="width:150px;">
                <option value="0">二级账户列表</option>
                <option value="1">三级账户列表</option>
            </select>
            <b>关键字：</b>
            <input class="easyui-textbox" type="text" id="keyword" name="keyword" data-options="prompt:'用户名/姓名'" size="30" />
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
            <auth:auth test="user/add_user">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="doAdd()">新增</a>
            </auth:auth>
            <auth:auth test="user/edit_user">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdit()">编辑</a>
            </auth:auth>
        </div>
        <div id="a" class="easyui-window" title="新增账户" data-options="closed:true," style="width:300px;height:300px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="f" class="easyui-form">
                        <table cellpadding="5">
                            <tr>
                                <td>用户名:</td>
                                <td><input class="easyui-textbox" type="text" name="userName" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>真实姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="realName" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>密码:</td>
                                <td><input class="easyui-textbox" type="password" id="password" name="password" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>确认密码:</td>
                                <td><input class="easyui-textbox" type="password" name="rePassword" data-options="required:true,validType:'same[password]'"/></td>
                            </tr>
                            <tr>
                                <td>权限ID:</td>
                                <td><input class="easyui-textbox" type="text" name="authId" data-options="required:true"/></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#f'), 'add_user', $('#a'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#a'));clearForm($('#f'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
        <div id="e" class="easyui-window" title="编辑账户" data-options="closed:true," style="width:300px;height:300px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="ef" class="easyui-form">
                        <table cellpadding="5">
                            <input type="hidden" name="id"/>
                            <input type="hidden" name="userRoleId"/>
                            <tr>
                                <td>用户名:</td>
                                <td><input class="easyui-textbox" type="text" name="userName" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>真实姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="realName" data-options="required:true"/></td>
                            </tr>
                            <tr>
                                <td>权限ID:</td>
                                <td><input class="easyui-textbox" type="text" name="authId" data-options="required:true"/></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#ef'), 'edit_user', $('#e'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#e'));clearForm($('#ef'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/user/user_model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/user/user_action.js"></script>