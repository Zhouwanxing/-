/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : studentdb

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2017-10-30 18:50:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(255) DEFAULT NULL,
  `apwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'zwx', '123456');
INSERT INTO `account` VALUES ('2', 'qwe', '456789');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  `spwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '大白', '男', '12', '123', '玩', '123456');
INSERT INTO `student` VALUES ('2', '小聪', '女', '18', '商务英语', '吃饭,睡觉,', '456789');
INSERT INTO `student` VALUES ('3', 'qwe', '女', '13', 'qwe', 'qw', '123456');
