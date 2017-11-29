$(function () {
    $('#list').datagrid({
        loader: listLoader,
        title: '已付费用户信息列表',
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
    page_list('page/record_list', params, success, error);
}

function doSearch() {
    $('#list').datagrid('reload');
}