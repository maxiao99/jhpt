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
}

function doEdit() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#e'));
        $('#ef').form('load', {
            id: row.id,
            userName: row.userName,
            realName: row.realName,
            authId: row.authId
        });
    } else {
        $.messager.alert('温馨提示', '请选择账户信息!');
    }
}