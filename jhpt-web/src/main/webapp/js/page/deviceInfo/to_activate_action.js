$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '待激活设备列表',
        loadMsg: '数据加载中...',
        fitColumns: true,
        singleSelect: true,
        pagination: true,
        columns: colModel,
        toolbar: '#toolbar'
    });
});

function listLoader(param, success, error) {
    var params = {
        keyword: $("#keyword").val(),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/to_activate', params, success, error);
}

function doSearch() {
    $('#list').datagrid('reload');
}

function submitForm(f, url, w) {
    if (!f.form("validate")) {
        return;
    }
    f.form('submit', {
        url: url,
        success: function(result) {
            if (successJsonToObject(result)) {
                f.form('clear');
                closeWindow(w);
                $('#list').datagrid('reload');
                $.messager.alert('激活短信已发送');
            }
        }
    });
}

function doEdit() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#e'));
        $('#ef').form('load', {
            deviceId: row.deviceId,
            name: row.deviceInfoName,
            plateNo: row.plateNo,
            phoneOfDevice: row.phoneOfDevice,
            weixinAccount: row.weixinAccount,
            outofdateTime: row.outofdateTime,
            status: '是'
        });
        $.getJSON('../kv/hint?module=3&defaultValue=' + row.carType, function(json) {
            $('#ecarType').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text'
            });
        });
        $.getJSON('../kv/hint?module=4&defaultValue=' + row.activateType, function(json) {
            $('#eActivateType').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text'
            });
        });
    } else {
        $.messager.alert('温馨提示', '请选择待激活设备信息!');
    }
}

function doTest() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#a'));
        $('#af').form('load', {
            deviceId: row.deviceId,
            testTime: row.outofdateTime
        });
    } else {
        $.messager.alert('温馨提示', '请选择调试设备信息!');
    }
}

