var colModel = [[
    {
        field: 'ck',
        checkbox: true
    },
    {
        field: 'deviceId',
        title: '设备ID'
    },
    {
        field: 'deviceInfoName',
        title: '姓名',
        width: 50
    },
    {
        field: 'drivingLicense',
        title: '驾照类型',
        width: 30,
        formatter: function (value, row, index) {
            if (value == '1') {
                return 'A照';
            } else if (value == '2') {
                return 'B照';
            } else if (value == '3') {
                return 'C照';
            } else {
                return '';
            }
        }
    },
    {
        field: 'plateNo',
        title: '车牌号',
        width: 30
    },
    {
        field: 'phoneOfDevice',
        title: '设备SIM卡号',
        width: 50
    },
    {
        field: 'accountantConfirmTime',
        title: '付费时间',
        width: 40
    },
    {
        field: 'outofdateTime',
        title: '过期时间',
        width: 40
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