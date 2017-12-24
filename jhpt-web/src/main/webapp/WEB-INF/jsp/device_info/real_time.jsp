<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>车辆实时数据</title>
    </head>
    <body>
        <div id="newSearch">
            <form id="queryForm">
                <b>类型:</b>
                <input class="easyui-combobox" id="type" name="type" data-options="required:true" style="width:200px;"/>
                <b>车牌号:</b>
                <input class="easyui-textbox" id="plateNo" name="plateNo" data-options="required:true" style="width:100px;"/>
                <b>开始时间：</b>
                <input class="easyui-my97" type="text" id="startDate" data-options="skin:'whyGreen',maxDate:'#F{$dp.$D(\'endDate\')||\'%y-%M-{%d-1}\'}',dateFmt:'yyyy-MM-dd HH:mm'">
                <b>结束时间：</b>
                <input class="easyui-my97" type="text" id="endDate" data-options="skin:'whyGreen',minDate:'#F{$dp.$D(\'startDate\')}',maxDate:'%y-%M-{%d}',dateFmt:'yyyy-MM-dd HH:mm'">
                <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doDownload()">下载</a>
            </form>
            <iframe scrolling="auto" frameborder="0" id="oneIframe"  src="" style="width:100%;height:100%;"></iframe>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/real_time_action.js"></script>