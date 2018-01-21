CREATE DATABASE `tyj_jhpt` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE `tyj_jhpt`;


DROP TABLE IF EXISTS `tb_alarm`;

CREATE TABLE `tb_alarm` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `max_alarm_level` INT(4) NOT NULL DEFAULT '0' COMMENT '最高报警等级',
  `general_alarm` DOUBLE NOT NULL COMMENT '通用报警标志',
  `bytes1` BLOB COMMENT '可充电储能装置故障代码列表',
  `bytes2` BLOB COMMENT '驱动电机故障代码列表',
  `bytes3` BLOB COMMENT '发动机故障列表',
  `bytes4` BLOB COMMENT '其他故障代码列表',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='报警数据';

DROP TABLE IF EXISTS `tb_all_car`;

CREATE TABLE `tb_all_car` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `car_status` INT(4) NOT NULL DEFAULT '0' COMMENT '车辆状态',
  `change_status` INT(4) NOT NULL DEFAULT '0' COMMENT '充电状态',
  `run_mode` INT(4) NOT NULL DEFAULT '0' COMMENT '运行模式',
  `speed` INT(11) NOT NULL COMMENT '车速',
  `total_km` INT(11) NOT NULL COMMENT '累计里程',
  `total_voltage` INT(11) NOT NULL COMMENT '总电压',
  `total_electricity` INT(11) NOT NULL COMMENT '总电流',
  `soc` INT(4) NOT NULL DEFAULT '0' COMMENT 'SOC',
  `dc_status` INT(4) NOT NULL DEFAULT '0' COMMENT 'DC-DC状态',
  `dangwei` INT(4) NOT NULL DEFAULT '0' COMMENT '挡位',
  `insulation_resistance` INT(11) NOT NULL DEFAULT '0' COMMENT '绝缘电阻',
  `up_footplate_km` INT(4) NOT NULL DEFAULT '0' COMMENT '加速踏板行程值',
  `footplate_status` INT(4) NOT NULL DEFAULT '0' COMMENT '制动踏板状态',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='整车数据';

DROP TABLE IF EXISTS `tb_car_location`;

CREATE TABLE `tb_car_location` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `location_status` INT(4) NOT NULL DEFAULT '0' COMMENT '定位状态',
  `longitude` DOUBLE NOT NULL COMMENT '经度',
  `latitude` DOUBLE NOT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='车辆位置数据';

DROP TABLE IF EXISTS `tb_car_login_logout`;

CREATE TABLE `tb_car_login_logout` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `login_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '登入时间',
  `logout_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '登出时间',
  `trace_no` INT(20) NOT NULL COMMENT '登入流水号',
  `iccid` VARCHAR(20) NOT NULL COMMENT 'ICCID',
  `system_num` INT(11) NOT NULL COMMENT '可充电储能子系统数',
  `system_code_length` INT(11) NOT NULL COMMENT '可充电储能系统编码长度',
  `system_code` VARCHAR(255) NOT NULL COMMENT '可充电储能系统编码',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='车辆登入/登出';

DROP TABLE IF EXISTS `tb_device_gps_info`;

CREATE TABLE `tb_device_gps_info` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `msg_id` INT(11) NOT NULL COMMENT '告警消息ID',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `driver_person_id` INT(11) NOT NULL DEFAULT '0' COMMENT '驾驶员ID',
  `location_status` INT(4) NOT NULL DEFAULT '0' COMMENT '定位状态',
  `longitude` DOUBLE NOT NULL COMMENT '经度',
  `latitude` DOUBLE NOT NULL COMMENT '纬度',
  `speed` INT(11) NOT NULL COMMENT '车速',
  `upload_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '上传时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='车辆告警信息';

DROP TABLE IF EXISTS `tb_device_info`;

CREATE TABLE `tb_device_info` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `iccid` VARCHAR(20) NOT NULL COMMENT 'SIM卡ICCID号',
  `terminal_seq` VARCHAR(20) NOT NULL COMMENT '终端序列号',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `terminal_no` VARCHAR(20) NOT NULL COMMENT '车载终端编号',
  `dianji_no` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '驱动电机型号',
  `fadongji_no` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '发动机编号',
  `name` VARCHAR(50) NOT NULL COMMENT '车主姓名',
  `age` INT(4) NOT NULL COMMENT '年龄',
  `driving_license` INT(20) NOT NULL COMMENT '驾照类型(1:A,2:B,3:C)',
  `identity_no` VARCHAR(18) NOT NULL COMMENT '身份证号',
  `telephone` VARCHAR(20) NOT NULL COMMENT '手机号',
  `plate_no` VARCHAR(7) NOT NULL COMMENT '车牌号',
  `car_type` INT(4) NOT NULL COMMENT '车型(1:私家车,2:集团车)',
  `weixin_account` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '微信账号',
  `create_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '录入时间',
  `recorder_id` INT(11) NOT NULL DEFAULT '0' COMMENT '录入人ID',
  `outofdate_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '设备过期时间',
  `activate_times` INT(11) NOT NULL DEFAULT '0' COMMENT '活动时间',
  `if_active` INT(4) NOT NULL DEFAULT '1' COMMENT '激活状态(1:第一次激活,2:再次激活)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `identity_no` (`identity_no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='设备用户信息录入表';

DROP TABLE IF EXISTS `tb_dianya`;

CREATE TABLE `tb_dianya` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='可充电储能装置电压数据';

DROP TABLE IF EXISTS `tb_dianya_detail`;

CREATE TABLE `tb_dianya_detail` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'tb_dianya的ID',
  `system_no` INT(4) NOT NULL DEFAULT '0' COMMENT '可充电储能子系统号',
  `dianya` INT(11) NOT NULL COMMENT '可充电储能装置电压',
  `dianliu` INT(11) NOT NULL COMMENT '可充电储能装置电流',
  `simple_total` INT(11) NOT NULL COMMENT '单体电池总数',
  `seq` INT(11) NOT NULL COMMENT '本帧起始电池序号',
  `own_simple_total` INT(4) NOT NULL DEFAULT '0' COMMENT '本帧单体电池总数',
  `simple_totals` BLOB COMMENT '单体电池电压',
  `dianya_id` BIGINT(20) NOT NULL COMMENT 'tb_dianya的ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='可充电储能装置电压数据详情';

DROP TABLE IF EXISTS `tb_driver_person`;

CREATE TABLE `tb_driver_person` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `driver_id` INT(20) NOT NULL COMMENT '驾驶员ID',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `driver_name` VARCHAR(50) NOT NULL COMMENT '驾驶员姓名',
  `driver_identity_no` VARCHAR(20) NOT NULL COMMENT '驾驶员身份证',
  `work_qualification` VARCHAR(40) NOT NULL COMMENT '从业资格证',
  `issue_organization_name` VARCHAR(50) NOT NULL COMMENT '发证机构名称',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='驾驶员身份信息采集';

DROP TABLE IF EXISTS `tb_fadongji`;

CREATE TABLE `tb_fadongji` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `status` INT(4) NOT NULL DEFAULT '0' COMMENT '发动机状态',
  `speed` INT(11) NOT NULL COMMENT '曲轴转速',
  `xiaohaolv` INT(11) NOT NULL COMMENT '燃料消耗率',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='发动机数据';

DROP TABLE IF EXISTS `tb_qudong_dianji`;

CREATE TABLE `tb_qudong_dianji` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='驱动电机数据';

DROP TABLE IF EXISTS `tb_qudong_dianji_detail`;

CREATE TABLE `tb_qudong_dianji_detail` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增IDtb_qudong_dianji的ID',
  `seq` INT(4) NOT NULL DEFAULT '0' COMMENT '驱动电机序号',
  `status` INT(4) NOT NULL DEFAULT '0' COMMENT '驱动电机状态',
  `control_temperature` INT(4) NOT NULL DEFAULT '0' COMMENT '驱动电机控制器温度',
  `speed` INT(11) NOT NULL COMMENT '驱动电机转速',
  `zhuanju` INT(11) NOT NULL COMMENT '驱动电机转矩',
  `temperature` INT(4) NOT NULL DEFAULT '0' COMMENT '驱动电机温度',
  `dianya` INT(11) NOT NULL COMMENT '电机控制器输入电压',
  `dianliu` INT(11) NOT NULL COMMENT '电机控制器直流母线母线电流',
  `qudong_dianji_id` BIGINT(20) NOT NULL COMMENT 'tb_qudong_dianji的ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='驱动电机数据详情';

DROP TABLE IF EXISTS `tb_ranliao_dianchi`;

CREATE TABLE `tb_ranliao_dianchi` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `dianya` INT(11) NOT NULL COMMENT '燃料电池电压',
  `dianliu` INT(11) NOT NULL COMMENT '燃料电池电流',
  `xiaohaolv` INT(11) NOT NULL COMMENT '燃料消耗率',
  `tanzhen_total` INT(11) NOT NULL COMMENT '燃料电池温度探针总数',
  `temperature` BLOB COMMENT '探针温度值',
  `max_temperature` INT(11) NOT NULL COMMENT '氢系统中最高温度',
  `max_tanzhen_no` INT(4) NOT NULL DEFAULT '0' COMMENT '氢系统中最高温度探针代号',
  `max_concentration` INT(11) NOT NULL COMMENT '氢气最高浓度',
  `max_concentration_no` INT(4) NOT NULL COMMENT '氢气最高浓度传感器代号',
  `max_pressure` INT(11) NOT NULL COMMENT '氢气最高压力',
  `max_pressure_no` INT(4) NOT NULL COMMENT '氢气最高压力传感器代号',
  `dc_status` INT(4) NOT NULL COMMENT '高压DC/DC状态',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='燃料电池数据';

DROP TABLE IF EXISTS `tb_supers`;

CREATE TABLE `tb_supers` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `max_system_no` INT(4) NOT NULL DEFAULT '0' COMMENT '最高电压电池系统号',
  `max_simple_no` INT(4) NOT NULL DEFAULT '0' COMMENT '最高电压电池单体代号',
  `max` INT(11) NOT NULL COMMENT '电池单体电压最高值',
  `mix_system_no` INT(4) NOT NULL DEFAULT '0' COMMENT '最低电压电池系统号',
  `mix_simple_no` INT(4) NOT NULL DEFAULT '0' COMMENT '最低电压电池单体代号',
  `min` INT(11) NOT NULL COMMENT '电池单体电压最低值',
  `max_temperature_system_no` INT(4) NOT NULL DEFAULT '0' COMMENT '最高温度子系统号',
  `max_seq` INT(4) NOT NULL DEFAULT '0' COMMENT '最高温度探针序号',
  `max_temperature` INT(4) NOT NULL DEFAULT '0' COMMENT '最高温度值',
  `min_temperature_system_no` INT(4) NOT NULL DEFAULT '0' COMMENT '最低温度子系统号',
  `min_seq` INT(4) NOT NULL DEFAULT '0' COMMENT '最低温度探针序号',
  `min_temperature` INT(4) NOT NULL DEFAULT '0' COMMENT '最低温度值',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='极值数据';

DROP TABLE IF EXISTS `tb_terminal_status_upload`;

CREATE TABLE `tb_terminal_status_upload` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '车载终端状态的ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='车载终端状态信息上报';

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_name` VARCHAR(20) NOT NULL COMMENT '用户名',
  `real_name` VARCHAR(20) NOT NULL COMMENT '真实姓名',
  `password` VARCHAR(32) NOT NULL COMMENT '密码',
  `salt` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '加密盐',
  `status` INT(4) NOT NULL DEFAULT '1' COMMENT '状态:1:可用,2不可用',
  `creator_id` BIGINT(11) NOT NULL COMMENT '创建人ID',
  `create_time` DATETIME NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `auth_id` INT(11) NOT NULL COMMENT '权限系统ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户表';

INSERT INTO `tb_user` (`id`, `user_name`, `real_name`, `password`, `creator_id`, `auth_id`) VALUES ('1', 'admin', 'admin', 'admin', '0', '6');

DROP TABLE IF EXISTS `tb_wendu`;

CREATE TABLE `tb_wendu` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='可充电储能装置温度数据';

DROP TABLE IF EXISTS `tb_wendu_detail`;

CREATE TABLE `tb_wendu_detail` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'tb_wendu的ID',
  `system_no` INT(4) NOT NULL DEFAULT '0' COMMENT '可充电储能子系统号',
  `count` INT(11) NOT NULL COMMENT '可充电储能温度探针个数',
  `values` BLOB COMMENT '可充电储能子系统各温度探针监测到的温度值',
  `wendu_id` BIGINT(20) NOT NULL COMMENT 'tb_wendu的ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='可充电储能装置温度数据详情';

DROP TABLE IF EXISTS `td_composite_dictionary`;

CREATE TABLE `td_composite_dictionary` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `dic_id` INT(11) NOT NULL COMMENT '字典ID',
  `dic_name` VARCHAR(100) NOT NULL COMMENT '字典名称',
  `dic_type` INT(11) NOT NULL COMMENT '类型',
  `status` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '字典状态:1:启用,0:禁用',
  `dic_desc` VARCHAR(1000) NOT NULL DEFAULT '' COMMENT '字典描述',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8 COMMENT='字典表';
INSERT INTO `td_composite_dictionary` (`id`, `dic_id`, `dic_name`, `dic_type`, `status`, `dic_desc`) VALUES('1','1','A照','1','1','驾照类型'),('2','2','B照','1','1','驾照类型'),('3','3','C照','1','1','驾照类型'),('4','1','私家车','2','1','车型'),('5','2','集团车','2','1','车型'),('6','1','一个月','3','1','1'),('7','2','三个月','3','1','3'),('8','3','半年','3','1','6'),('9','4','一年','3','1','1'),('10','5','三年','3','1','3'),('11','6','五年','3','1','5'),('12','7','0个月','3','1','0'),('13','1','1','4','1','事前间隔'),('14','2','2','4','1','事前间隔'),('15','3','3','4','1','事前间隔'),('16','4','4','4','1','事前间隔'),('17','5','5','4','1','事前间隔'),('18','10','10','5','1','事后间隔'),('19','15','15','5','1','事后间隔'),('20','20','20','5','1','事后间隔'),('21','25','25','5','1','事后间隔'),('22','30','30','5','1','事后间隔'),('23','35','35','5','1','事后间隔'),('24','40','40','5','1','事后间隔'),('25','45','45','5','1','事后间隔'),('26','50','50','5','1','事后间隔'),('27','55','55','5','1','事后间隔'),('28','60','60','5','1','事后间隔'),('29','1','左车道偏离','6','1','告警类型'),('30','2','右车道偏离','6','1','告警类型'),('31','3','车距监测','6','1','告警类型'),('32','4','限速警示','6','1','告警类型'),('33','5','城市前碰撞','6','1','告警类型'),('34','6','车辆前部碰撞','6','1','告警类型'),('35','7','汽车启动','6','1','告警类型'),('36','8','汽车熄火','6','1','告警类型'),('37','9','定位信息','6','1','告警类型'),('38','13','急加速','6','1','告警类型'),('39','14','急减速','6','1','告警类型'),('40','15','VD未启动','6','1','告警类型'),('41','16','设备已激活','6','1','告警类型'),('42','17','行人前部碰撞','6','1','告警类型'),('43','18','车辆碰撞跟踪','6','1','告警类型'),('44','19','设备配置成功','6','1','告警类型'),('45','20','设备配置失败','6','1','告警类型'),('46','21','超速跟踪','6','1','告警类型'),('47','22','超速警示','6','1','告警类型'),('48','23','行人碰撞跟踪','6','1','告警类型'),('49','2','车载终端关机','7','1','设备控制'),('50','3','车载终端复位','7','1','设备控制'),('51','4','车载终端恢复出厂设置','7','1','设备控制'),('52','5','断开数据通信链路','7','1','设备控制'),('53','1','1级报警','8','1','车载终端报警/预警'),('54','2','2级报警','8','1','车载终端报警/预警'),('55','3','3级报警','8','1','车载终端报警/预警'),('56','4','4级预警','8','1','车载终端报警/预警'),('57','5','5级预警','8','1','车载终端报警/预警');

DROP TABLE IF EXISTS `tb_car_alarm`;

CREATE TABLE `tb_car_alarm` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `alarm_type` INT(20) NOT NULL COMMENT '车辆告警信息类型',
  `alarm_body` INT(20) NOT NULL COMMENT '车辆告警信息体',
  `device_gps_info_id` BIGINT(20) NOT NULL COMMENT 'tb_device_gps_info的ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='车辆告警信息';

DROP TABLE IF EXISTS `tb_car_terminal_status`;

CREATE TABLE `tb_car_terminal_status` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `alarm_type` INT(20) NOT NULL COMMENT '信息类型标志, 01:电源状态, 02:通电状态 03:通信传输状态',
  `alarm_body` INT(20) NOT NULL COMMENT '信息体, 电源状态: 0-电源故障, 1-电源正常, 通电状态: 0-断电, 1-通电, 通信传输状态: 0-通信传输异常, 1-通信传输正常',
  `terminal_status_upload_id` BIGINT(20) NOT NULL COMMENT 'tb_terminal_status_upload的ID',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='车载终端状态';

DROP TABLE IF EXISTS `tb_param_query_back`;

CREATE TABLE `tb_param_query_back` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '参数查询反馈的ID',
  `car_vin` VARCHAR(20) NOT NULL COMMENT '车辆vin',
  `event_time` DATETIME NOT NULL COMMENT '数据采集时间',
  `param_num` INT(11) NOT NULL COMMENT '参数总数',
  `local_store_cycle` INT(11) DEFAULT NULL COMMENT '车载终端本地存储时间周期',
  `normal_upload_cycle` INT(11) DEFAULT NULL COMMENT '正常时，信息上报时间周期',
  `alarm_upload_cycle` INT(11) DEFAULT NULL COMMENT '出现报警时，信息上报时间周期',
  `manage_domain_length` INT(11) DEFAULT NULL COMMENT '远程服务与管理平台域名长度',
  `manage_domain` BLOB COMMENT '远程服务与管理平台域名',
  `manage_port` INT(11) DEFAULT NULL COMMENT '远程服务与管理平台端口',
  `hardware_version` VARCHAR(50) DEFAULT NULL COMMENT '硬件版本',
  `firmware_version` VARCHAR(50) DEFAULT NULL COMMENT '固件版本',
  `terminal_heart_send_cycle` INT(11) DEFAULT NULL COMMENT '车载终端心跳发送周期',
  `terminal_resp_over_time` INT(11) DEFAULT NULL COMMENT '终端应答超时时间',
  `platform_resp_over_time` INT(11) DEFAULT NULL COMMENT '平台应答超时时间',
  `three_next_login_time` INT(11) DEFAULT NULL COMMENT '连续三次登入失败后，到下一次登入的间隔时间',
  `gov_platform_domain_length` INT(11) DEFAULT NULL COMMENT '政府平台域名长度',
  `gov_platform_domain` BLOB COMMENT '政府平台域名',
  `gov_platform_port` INT(11) DEFAULT NULL COMMENT '政府平台端口',
  `monitor` INT(11) DEFAULT NULL COMMENT '是否处于抽样监测',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='参数查询反馈';