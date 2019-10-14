SET NAMES utf8;

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
ALTER TABLE `user` ADD UNIQUE (`username`);
ALTER TABLE `user` ADD UNIQUE (`email`);
ALTER TABLE `user` ADD UNIQUE (`phone`);

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cname` varchar(50) DEFAULT NULL comment 'cname',
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(50) DEFAULT NULL comment 'file name',
  `file_size` int DEFAULT NULL comment 'file size',
  `file_type` varchar(50) DEFAULT NULL comment 'file type',
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `llz`;
CREATE TABLE `llz` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `llzname` varchar(100) DEFAULT NULL comment 'llzname',
  `llzpassword` varchar(100) DEFAULT NULL comment 'llzpassword',
  `llzemail` varchar(100) DEFAULT NULL comment 'llzemail',
  `llzphone` varchar(100) DEFAULT NULL comment 'llzphone',
  PRIMARY KEY (`id`)
);