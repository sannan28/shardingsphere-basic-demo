# 垂直分表 application-5.yml

CREATE DATABASE `sdj-vertical-partitioning`;
USE `sdj-vertical-partitioning`;
-- 基础用户表
CREATE TABLE user_base (
	`id` BIGINT PRIMARY KEY,
	`username` VARCHAR ( 50 ) NOT NULL,
	`PASSWORD` VARCHAR ( 50 ) NOT NULL
);

-- 用户详情表
CREATE TABLE user_profile (
	`id` BIGINT PRIMARY KEY,
	`email` VARCHAR ( 100 ),
	`phone` VARCHAR ( 20 ),
`address` VARCHAR ( 200 )
);
