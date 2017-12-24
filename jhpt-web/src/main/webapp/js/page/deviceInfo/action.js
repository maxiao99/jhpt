$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: $('#type').combobox('getText'),
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
        type: $('#type').combobox('getValue'),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/list', params, success, error);
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

function doAdd() {
    openWindow($('#a'));
    $.getJSON('../kv/hint?module=2&defaultValue=1', function(json) {
        $('#aDrivingLicense').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
    $.getJSON('../kv/hint?module=3&defaultValue=1', function(json) {
        $('#aCarType').combobox({
            data : json.dataList,
            valueField: 'value',
            textField: 'text'
        });
    });
}

function doEdit() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#e'));
        $('#ef').form('load', {
            id: row.id,
            name: row.name,
            age: row.age,
            drivingLicense: row.drivingLicense,
            identityNo: row.identityNo,
            telephone: row.telephone,
            plateNo: row.plateNo,
            carType: row.carType,
            iccid: row.iccid,
            terminalSeq: row.terminalSeq,
            carVin: row.carVin,
            terminalNo: row.terminalNo,
            dianjiNo: row.dianjiNo,
            fadongjiNo: row.fadongjiNo,
            weixinAccount: row.weixinAccount
        });
        $.getJSON('../kv/hint?module=2&defaultValue=' + row.drivingLicense, function(json) {
            $('#eDrivingLicense').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text'
            });
        });
        $.getJSON('../kv/hint?module=3&defaultValue=' + row.carType, function(json) {
            $('#eCarType').combobox({
                data : json.dataList,
                valueField: 'value',
                textField: 'text'
            });
        });
    } else {
        $.messager.alert('温馨提示', '请选择用户信息!');
    }
}