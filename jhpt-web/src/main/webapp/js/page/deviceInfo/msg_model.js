var colModel = [[
    {
        field: 'plateNo',
        title: '车牌号'
    },
    {
        field: 'driverPersonId',
        title: '驾驶员ID',
        width: 50
    },
    {
        field: 'msgId',
        title: '消息ID',
        width: 50
    },
    {
        field: 'eventTime',
        title: '采集时间',
        width: 50
    },
    {
        field: 'uploadTime',
        title: '上传时间',
        width: 50
    },
    {
        field: 'latitude',
        title: '纬度',
        width: 20
    },
    {
        field: 'longitude',
        title: '经度',
        width: 20
    },
    {
        field: 'kmStr',
        title: '里程',
        width: 40
    },
    {
        field: 'speed',
        title: '车速',
        width: 40,
        formatter: function (value, row, index) {
            return value + 'km/h';
        }
    },
    {
        field: 'accelerationStr',
        title: '特征值',
        width: 40
    },
    {
        field: 'msgType',
        title: '告警类型',
        width: 40,
        formatter: function (value, row, index) {
            return getMsgType(value);
        }
    }
]];

function getMsgType(value) {
    if (value == 1) {
        return '左车道偏离';
    } else if (value == 2) {
        return '右车道偏离';
    } else if (value == 3) {
        return '车距监测';
    } else if (value == 4) {
        return '限速警示';
    } else if (value == 5) {
        return '城市前碰撞';
    } else if (value == 6) {
        return '车辆前部碰撞';
    } else if (value == 7) {
        return '汽车启动';
    } else if (value == 8) {
        return '汽车熄火';
    } else if (value == 9) {
        return '定位信息';
    } else if (value == 13) {
        return '急加速';
    } else if (value == 14) {
        return '急减速';
    } else if (value == 15) {
        return 'VD未启动';
    } else if (value == 16) {
        return '设备已激活';
    } else if (value == 17) {
        return '行人前部碰撞';
    } else if (value == 18) {
        return '车辆碰撞跟踪';
    } else if (value == 19) {
        return '设备配置成功';
    } else if (value == 20) {
        return '设备配置失败';
    } else if (value == 21) {
        return '超速跟踪';
    } else if (value == 22) {
        return '超速警示';
    } else if (value == 23) {
        return '行人碰撞跟踪';
    } else {
        return '';
    }
}