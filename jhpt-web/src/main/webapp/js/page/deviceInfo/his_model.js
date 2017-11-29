var colModelHis = [[
    {
        field: 'accountantConfirmTime',
        title: '付费时间',
        width: 60
    },
    {
        field: 'roleName',
        title: '确认付费会计',
        width: 40
    },
    {
        field: 'activateType',
        title: '激活类型',
        width: 40,
        formatter: function (value, row, index) {
            if (value == 1) {
                return '一个月';
            } else if (value == 2) {
                return '三个月';
            } else if (value == 3) {
                return '半年';
            } else if (value == 4) {
                return '一年';
            } else if (value == 5) {
                return '三年';
            } else if (value == 6) {
                return '五年';
            } else if (value == 7) {
                return '0个月';
            }
            return '';
        }
    },
    {
        field: 'outofdateTime',
        title: '过期时间',
        width: 60
    },
    {
        field: 'type',
        title: '激活状态',
        width: 40,
        formatter: function (value, row, index) {
            if (value == 1) {
                return '待激活';
            } else if (value == 2) {
                return '已激活';
            } else if (value == 3) {
                return '已过期';
            }
            return '待付费';
        }
    }
]];