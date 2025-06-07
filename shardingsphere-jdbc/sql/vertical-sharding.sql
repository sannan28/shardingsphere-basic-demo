# 垂直分库 对应application-4.yml
CREATE DATABASE `sdj-vertical-sharding-1`;

USE `sdj-vertical-sharding-1`;

CREATE TABLE `user` (
	`user_id` BIGINT ( 20 ) PRIMARY KEY,
	`username` VARCHAR ( 100 ) NOT NULL,
`ustatus` VARCHAR ( 50 ) NOT NULL
);

CREATE DATABASE `sdj-vertical-sharding-2`;

USE `sdj-vertical-sharding-2`;

CREATE TABLE course (
	`cid` BIGINT ( 20 ) PRIMARY KEY,
	`cname` VARCHAR ( 50 ) NOT NULL,
	`user_id` BIGINT ( 20 ) NOT NULL,
`cstatus` VARCHAR ( 10 ) NOT NULL
);



