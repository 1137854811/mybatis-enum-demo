/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : 172.17.0.2:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 18/11/2022 18:13:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `name`, `password`, `gender`) VALUES (1, '1', '2', 101);
INSERT INTO `user` (`id`, `name`, `password`, `gender`) VALUES (2, '2', '2', 100);
INSERT INTO `user` (`id`, `name`, `password`, `gender`) VALUES (4, '2', '2', 100);
INSERT INTO `user` (`id`, `name`, `password`, `gender`) VALUES (5, '3', '3', 100);
INSERT INTO `user` (`id`, `name`, `password`, `gender`) VALUES (6, '3', '3', 100);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
