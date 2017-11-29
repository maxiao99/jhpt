$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '待确认付费用户信息列表',
        fitColumns: true,
        singleSelect: true,
        pagination: true,
        columns: colModel,
        toolbar: '#toolbar',
        onClickCell: onClickCell,
        onEndEdit: onEndEdit
    });
});

function listLoader(param, success, error) {
    var params = {
        keyword: $("#keyword").val(),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/customer_list', params, success, error);
}

var editIndex = undefined;
function endEditing() {
    if (editIndex == undefined) {
        return true;
    }
    if ($('#list').datagrid('validateRow', editIndex)) {
        $('#list').datagrid('endEdit', editIndex);
        editIndex = undefined;
        return true;
    } else {
        return false;
    }
}

function onClickCell(index, field) {
    if (editIndex != index) {
        if (endEditing()) {
            $('#list').datagrid('selectRow', index).datagrid('beginEdit', index);
            var ed = $('#list').datagrid('getEditor', {
                index: index,
                field: field
            });
            if (ed) {
                ($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
            }
            editIndex = index;
        } else {
            setTimeout(function () {
                $('#list').datagrid('selectRow', editIndex);
            }, 0);
        }
    }
}

function onEndEdit(index, row) {
    var ed = $(this).datagrid('getEditor', {
        index: index,
        field: 'activateType'
    });
    row.text = $(ed.target).combobox('getText');
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

function doEdit() {
    var row = $('#list').datagrid('getSelected');
    if (row) {
        openWindow($('#e'));
        $('#ef').form('load', {
            deviceId: row.deviceId,
            name: row.deviceInfoName,
            plateNo: row.plateNo,
            phoneOfDevice: row.phoneOfDevice,
            createTime: row.createTime,
            roleName: row.roleName,
            outofdateTime: row.outofdateTime
        });
        $.getJSON('../kv/hint?module=2&defaultValue=' + row.drivingLicense, function(json) {
            $('#eDrivingLicense').combobox({
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
        $.messager.alert('温馨提示', '请选择用户付费信息!');
    }
}

