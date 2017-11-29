$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '设备配置',
        loadMsg: '数据加载中...',
        fitColumns: true,
        singleSelect: false,
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
    page_list('page/config_list', params, success, error);
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
            }
        }
    });
}
function doEdits() {
    var rows = $('#list').datagrid('getSelections');
    if (isNullOrEmpty(rows) || rows.length == 0) {
        $.messager.alert('温馨提示', '请选择待激活设备信息!');
        return;
    }
    openWindow($('#a'));
    var ds = [];
    for (var i = 0; i < rows.length ;i++) {
        ds.push(rows[i].deviceId);
    }
    $('#af').form('load', {
        deviceId: ds,
        gpsMsgSendInterval: 5
    });
    $.getJSON('../kv/hint?module=3&defaultValue=1', function(json) {
        $('#acarType').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
    $('#aoverrideVideo').combobox({
        data : [{"selected":true,"text":"是","value":1},{"text":"否","value":2}],
        valueField: 'value',
        textField: 'text'
    });
    $.getJSON('../kv/hint?module=5&defaultValue=1', function(json) {
        $('#avideoLengthBeforeInterrupt').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
    $.getJSON('../kv/hint?module=6&defaultValue=10', function(json) {
        $('#avideoLengthAfterInterrupt').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
}

function doEdit() {
    var rows = $('#list').datagrid('getSelections');
    if (isNullOrEmpty(rows) || rows.length == 0) {
        $.messager.alert('温馨提示', '请选择待激活设备信息!');
        return;
    } else if (rows.length != 1) {
        $.messager.alert('温馨提示', '多个设备,请选择批量配置!');
        return;
    }
    var row = $('#list').datagrid('getSelected');
    openWindow($('#e'));
    $('#ef').form('load', {
        deviceId: row.deviceId,
        name: row.deviceInfoName,
        plateNo: row.plateNo,
        phoneOfDevice: row.phoneOfDevice,
        weixinAccount: row.weixinAccount,
        outofdateTime: row.outofdateTime,
        gpsMsgSendInterval: 5
    });
    $.getJSON('../kv/hint?module=3&defaultValue=1', function(json) {
        $('#ecarType').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
        $('#carType').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
    $('#overrideVideo').combobox({
        data : [{"selected":true,"text":"是","value":1},{"text":"否","value":2}],
        valueField: 'value',
        textField: 'text'
    });
    $.getJSON('../kv/hint?module=5&defaultValue=1', function(json) {
        $('#videoLengthBeforeInterrupt').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
    $.getJSON('../kv/hint?module=6&defaultValue=10', function(json) {
        $('#videoLengthAfterInterrupt').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
}

