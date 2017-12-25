$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '可充电储能装置电压数据列表',
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
    special_page_list('page/dianya_list', params, success, error);
}

function onLoadSuccess(data) {
    var merges = data.merges;
    for (var i = 0; i < merges.length; i++) {
        $(this).datagrid('mergeCells', {
            index: merges[i].index,
            field: 'id',
            rowspan: merges[i].rowspan
        });
        $(this).datagrid('mergeCells', {
            index: merges[i].index,
            field: 'plateNo',
            rowspan: merges[i].rowspan
        });
        $(this).datagrid('mergeCells', {
            index: merges[i].index,
            field: 'eventTime',
            rowspan: merges[i].rowspan
        });
    }
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