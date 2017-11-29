$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '设备列表',
        loadMsg: '数据加载中...',
        fitColumns: true,
        singleSelect: true,
        pagination: true,
        columns: colModel,
        toolbar: '#toolbar'
    });
    $('#record_list').datagrid({
        loader: hisListLoader,
        title: '设备激活历史列表',
        loadMsg: '数据加载中...',
        fitColumns: true,
        singleSelect: true,
        pagination: true,
        columns: colModelHis
    });
});

function listLoader(param, success, error) {
    var params = {
        keyword: $("#keyword").val(),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/all_list', params, success, error);
}

function hisListLoader(param, success, error) {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        var params = {
            deviceId: row.deviceId,
            limit: param.rows,
            currentPage: param.page
        };
        page_list('page/his_list', params, success, error);
    }
}

function doSearch() {
    $('#list').datagrid('reload');
}

function doEdit() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#e'));
        $("#deviceId").html('设备ID:' + row.deviceId);
        $("#name").html('用户姓名:' + row.deviceInfoName);
        $("#plateNo").html('车牌号:' + row.plateNo);
        $("#phoneOfDevice").html('设备SIM卡号:' + row.phoneOfDevice);
        $('#record_list').datagrid('reload');
    } else {
        $.messager.alert('温馨提示', '请选择设备信息!');
    }
}
