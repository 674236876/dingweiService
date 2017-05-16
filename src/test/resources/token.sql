use quick4j

CREATE TABLE `token_info`(
`id` bigint(20) unsigned not null AUTO_INCREMENT COMMENT 'tokenId',
`ptid` varchar(64) DEFAULT NULL COMMENT '终端id',
`token` varchar(64) DEFAULT NULL COMMENT '随机生成的uuid',
`validityTime` datetime DEFAULT NULL COMMENT '生效时间',
`unvalidityTime` datetime DEFAULT NULL COMMENT '失效时间',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'token信息表'