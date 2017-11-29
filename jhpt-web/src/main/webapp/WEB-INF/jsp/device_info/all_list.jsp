<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>设备列表</title>
        <link rel="stylesheet" type="text/css" href="<%=basePath%>css/frame/all_list.css">
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <b>关键字：</b>
            <input class="easyui-textbox" type="text" id="keyword" name="keyword" data-options="prompt:'姓名/车牌/微信号'" size="30" />
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
            <auth:auth test="all/activate_record">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdit()">激活记录</a>
            </auth:auth>
        </div>
        <div id="e" class="easyui-window" title="设备激活历史" data-options="closed:true," style="width:800px;height:420px;padding:1px;">
            <div>
                <span id="deviceId" class="device_info"></span>
                <span id="name" class="device_info"></span>
                <span id="plateNo" class="device_info"></span>
                <span id="phoneOfDevice" class="device_info"></span>
            </div>
            <table id="record_list"></table>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/his_model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/all_model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/all_action.js"></script>
