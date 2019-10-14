﻿SET NAMES utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL comment '用户名',
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `register_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `enabled` tinyint(1) DEFAULT 1,
  `role` varchar(50) DEFAULT NULL comment '角色',
  `avatar_url` varchar(200) DEFAULT '' comment '头像',
  PRIMARY KEY (`id`)
);
CREATE TABLE `letter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL comment '标题',
  `content` varchar(500) DEFAULT NULL comment '内容11',
  PRIMARY KEY (`id`)
);
ALTER TABLE `user` ADD UNIQUE (`username`);
ALTER TABLE `user` ADD UNIQUE (`email`);
ALTER TABLE `user` ADD UNIQUE (`phone`);


DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `filename` varchar(100) DEFAULT NULL comment 'file name',
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `llz`;
CREATE TABLE `llz` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `llzname` varchar(100) DEFAULT NULL comment 'llz name',
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS `zzs`;
CREATE TABLE `zzs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `llzname` varchar(100) DEFAULT NULL comment 'zzs name',
  PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS `qly`;
CREATE TABLE `qly` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL comment 'zzs name',
  'age' int ,
  'profession' char(50) NOT NULL,
  PRIMARY KEY (`id`)
);