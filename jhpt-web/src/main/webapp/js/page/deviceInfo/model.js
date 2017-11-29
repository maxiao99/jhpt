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
        field: 'name',
        title: '姓名',
        width: 50
    },
    {
        field: 'age',
        title: '年龄',
        width: 20
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
        field: 'carType',
        title: '车型',
        width: 30,
        formatter: function (value, row, index) {
            if (value == '1') {
                return '私家车';
            } else if (value == '2') {
                return '集团车';
            } else {
                return '';
            }
        }
    },
    {
        field: 'identityNo',
        title: '身份证号',
        width: 50
    },
    {
        field: 'phoneOfDevice',
        title: '设备SIM卡号',
        width: 50
    },
    {
        field: 'plateNo',
        title: '车牌号',
        width: 50
    },
    {
        field: 'weixinAccount',
        title: '微信账号',
        width: 50
    },
    {
        field: 'outofdateTime',
        title: '过期时间',
        width: 40
    },
    {
        field: 'type',
        title: '激活状态',
        width: 30,
        formatter: function (value, row, index) {
            if (value == '1') {
                return '否';
            } else {
                return '是';
            }
        }
    }
]];