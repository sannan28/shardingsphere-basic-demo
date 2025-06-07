# 水平分库分表 对应配置文件 application-3.yml

create database `sj-database-sharding-1`;

USE `sj-database-sharding-1`;

CREATE TABLE course_1 (
	`cid` BIGINT ( 20 ) PRIMARY KEY,
	`cname` VARCHAR ( 50 ) NOT NULL,
	`user_id` BIGINT ( 20 ) NOT NULL,
	`cstatus` VARCHAR ( 10 ) NOT NULL
);

CREATE TABLE course_2 (
	`cid` BIGINT ( 20 ) PRIMARY KEY,
	`cname` VARCHAR ( 50 ) NOT NULL,
	`user_id` BIGINT ( 20 ) NOT NULL,
	`cstatus` VARCHAR ( 10 ) NOT NULL
);

create database `sj-database-sharding-2`;

USE `sj-database-sharding-2`;

CREATE TABLE course_1 (
	`cid` BIGINT ( 20 ) PRIMARY KEY,
	`cname` VARCHAR ( 50 ) NOT NULL,
	`user_id` BIGINT ( 20 ) NOT NULL,
	`cstatus` VARCHAR ( 10 ) NOT NULL
);

CREATE TABLE course_2 (
	`cid` BIGINT ( 20 ) PRIMARY KEY,
	`cname` VARCHAR ( 50 ) NOT NULL,
	`user_id` BIGINT ( 20 ) NOT NULL,
	`cstatus` VARCHAR ( 10 ) NOT NULL
);


