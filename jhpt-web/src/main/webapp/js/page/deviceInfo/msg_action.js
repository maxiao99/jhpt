$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '告警信息列表',
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
        plateNo: $("#plateNo").val(),
        startDate: $("#startDate").val(),
        endDate: $("#endDate").val(),
        limit: param.rows,
        currentPage: param.page
    };
    page_list('page/msg_list', params, success, error);
}

function doSearch() {
    $('#list').datagrid('reload');
}

function doDownload() {
    var queryForm = $('#queryForm');
    if (!queryForm.form("validate")) {
        return;
    }
    var plateNo = $('#plateNo').val();
    var startDate = $('#startDate').val();
    var endDate = $('#endDate').val();
    queryForm.form('submit', {
        url: "download_msg",
        onSubmit: function(param) {
            param.plateNo = plateNo;
            param.startDate = startDate;
            param.endDate = endDate;
        }
    });
}