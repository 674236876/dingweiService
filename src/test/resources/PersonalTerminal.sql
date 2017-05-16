user `quick4j`

CREATE TABLE `personalTerminal`(
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '终端id',
  `groupId` bigint(20) DEFAULT NULL COMMENT '组id',
  `ptName` varchar(32) DEFAULT NULL COMMENT '终端名称',
  `imsi` varchar(32) DEFAULT NULL COMMENT 'imsi',
  `phoneNumber` varchar(11) DEFAULT NULL COMMENT '电话号码',
  `imageId` bigint(20) DEFAULT null COMMENT '图像id',
  `description` varchar(64) DEFAULT NULL COMMENT '描述',
  `registTime` datetime DEFAULT NULL COMMENT '注册时间',
  `activeTime` datetime DEFAULT NULL COMMENT '激活时间',
  `gpsTime` datetime DEFAULT NULL COMMENT 'gps时间',
  `lastNotifyTime` datetime DEFAULT NULL COMMENT '最后一次在线时间',
  `orglat` varchar(32) DEFAULT NULL COMMENT '纬度',
  `orglon` varchar(32) DEFAULT NULL COMMENT '经度',
  `speed` int(11) DEFAULT NULL COMMENT '速度',
  `altitude` int(11) DEFAULT NULL COMMENT '海拔',
  `directory` int(11) default NULL COMMENT '目录',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `online` int(2) DEFAULT  NULL COMMENT '在线',
  `protocal` int(11) DEFAULT NULL COMMENT '协议'
  PRIMARY KEY (`id`)
) DEFAULT charset=utf8 ROW_FORMAT=DYNAMIC COMMENT='终端表';