/*
 * Copyright (C) 2016 CK, Inc. All Rights Reserved.
 */

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
        field: 'roleName',
        title: '确认付费会计',
        width: 50
    },
    {
        field: 'outofdateTime',
        title: '过期时间',
        width: 40
    },
    {
        field: 'activateType',
        title: '激活时限',
        width: 30,
        formatter: function (value, row, index) {
            if (value == '1') {
                return '一个月';
            } else if (value == '2') {
                return '三个月';
            } else if (value == '3') {
                return '半年';
            } else if (value == '4') {
                return '一年';
            } else if (value == '5') {
                return '三年';
            } else if (value == '6') {
                return '五年';
            } else if (value == '7') {
                return '0个月';
            } else {
                return '';
            }
        }
    },
    {
        field: 'type',
        title: '激活状态',
        width: 40,
        formatter: function (value, row, index) {
            return '<span style="color:#007373;font-weight: 600;">否</span>';
        }
    }
]];