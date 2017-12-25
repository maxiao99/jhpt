$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '驱动电机数据列表',
        loadMsg: '数据加载中...',
        fitColumns: true,
        singleSelect: true,
        pagination: true,
        columns: colModel,
        toolbar: '#toolbar',
        onLoadSuccess: onLoadSuccess,
    });
});

function listLoader(param, success, error) {
    var data = parent.getParams();
    var params = {
        plateNo: data['plateNo'],
        startDate: data['startDate'],
        endDate: data['endDate'],
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/qudong_dianji_list', params, success, error);
}

function onLoadSuccess(data) {
    $(this).datagrid('mergeCells', {
        index: 0,
        field: 'id',
        rowspan: 2
    });
    $(this).datagrid('mergeCells', {
        index: 0,
        field: 'plateNo',
        rowspan: 2
    });
    $(this).datagrid('mergeCells', {
        index: 0,
        field: 'eventTime',
        rowspan: 2
    });
}

function doSearch() {
    $('#list').datagrid('reload');
}

function doDownload() {
    var queryForm = parent.$('#queryForm');
    if (!queryForm.form("validate")) {
        return;
    }

    var data = parent.getParams();
    queryForm.form('submit', {
        url: "download_msg",
        onSubmit: function(param) {
            param.plateNo = data['plateNo'];
            param.startDate = data['startDate'];
            param.endDate = data['endDate'];
        }
    });
}