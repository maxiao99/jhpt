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
        field: 'createTime',
        title: '录入时间',
        width: 40
    },
    {
        field: 'roleName',
        title: '录入者',
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
        formatter: function (value, row) {
            return row.text;
        },
        editor: {
            type: 'combobox',
            options: {
                loader: activateTypeLoader,
                valueField: 'value',
                textField: 'text',
                required: true,
                panelHeight:'auto'
            }
        }
    }
]];

function activateTypeLoader(param, success, error) {
    $.getJSON('../kv/hint?module=4', param, function (json) {
        success(json.dataList);
    });
}