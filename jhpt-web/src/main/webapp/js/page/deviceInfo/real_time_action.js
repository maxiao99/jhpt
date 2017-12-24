$(function () {
    $('#type').combobox({
        data : [
            {
                text: "整车数据",
                value: "all_car",
                selected: "selected"
            },{
                text: "驱动电机数据",
                value: "qudong_dianji"
            },{
                text: "燃料电池数据",
                value: "ranliao_dianchi"
            },{
                text: "发动机数据",
                value: "fadongji"
            },{
                text: "极值数据",
                value: "supers"
            },{
                text: "报警数据",
                value: "alarm"
            },{
                text: "可充电储能装置电压数据",
                value: "dianya"
            },{
                text: "可充电储能装置温度数据",
                value: "wendu"
            }
        ],
        valueField: 'value',
        textField: 'text',
        panelHeight:'auto',
        onChange: function (newValue) {
            $('#oneIframe').attr("src", newValue);
        }
    });

    $('#oneIframe').attr("src", $('#type').combobox('getValue'));
});

function doSearch() {
    var type = $('#type').combobox('getValue');
    var text = $('#type').combobox('getText');
    if ('init_km' == type) {
//        self.frames[0].getMap();
//        return;
    } else if(('init_speed' == type || 'init_time' == type) && arrays.length != 1) {
        $.messager.alert("提示", text + "-只能有一个时间段！", "info");
        return;
    }
    self.frames[0].doSearch();
}

function doDownload() {
    self.frames[0].doDownload();
}

function getParams() {
    var plateNo = $('#plateNo').val();
    var startDate = $('#startDate').val();
    var endDate = $('#endDate').val();
    var data = {
        plateNo: plateNo,
        startDate: startDate,
        endDate: endDate
    };
    return data;
}
