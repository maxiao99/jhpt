<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>告警记录列表</title>
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <form id="queryForm">
                <b>车牌号：</b>
                <input class="easyui-textbox" type="text" id="plateNo" size="20"/>
                <b>开始时间：</b>
                <input class="easyui-my97" type="text" id="startDate" data-options="skin:'whyGreen',maxDate:'#F{$dp.$D(\'endDate\')||\'%y-%M-{%d-1}\'}',dateFmt:'yyyy-MM-dd HH:mm'">
                <b>结束时间：</b>
                <input class="easyui-my97" type="text" id="endDate" data-options="skin:'whyGreen',minDate:'#F{$dp.$D(\'startDate\')}',maxDate:'%y-%M-{%d}',dateFmt:'yyyy-MM-dd HH:mm'">
                <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
                <auth:auth test="msg/download">
                <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doDownload()">下载</a>
                </auth:auth>
            </form>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/msg_model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/msg_action.js"></script>