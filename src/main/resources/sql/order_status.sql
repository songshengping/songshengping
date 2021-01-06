/*
 Navicat MySQL Data Transfer

 Source Server         : mysql8
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : 140.143.18.246:23337
 Source Schema         : songshengping

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 06/01/2021 23:41:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_status
-- ----------------------------
DROP TABLE IF EXISTS `order_status`;
CREATE TABLE `order_status`  (
  `order_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单ID 对应订单表的主键id',
  `order_status` int(11) NOT NULL COMMENT '订单状态',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '订单创建时间 对应[10:待付款]状态',
  `pay_time` timestamp(0) NULL DEFAULT NULL COMMENT '支付成功时间 对应[20:已付款，待发货]状态',
  `deliver_time` timestamp(0) NULL DEFAULT NULL COMMENT '发货时间 对应[30：已发货，待收货]状态',
  `success_time` timestamp(0) NULL DEFAULT NULL COMMENT '交易成功时间 对应[40：交易成功]状态',
  `close_time` timestamp(0) NULL DEFAULT NULL COMMENT '交易关闭时间 对应[50：交易关闭]状态',
  `comment_time` timestamp(0) NULL DEFAULT NULL COMMENT '留言时间 用户在交易成功后的留言时间',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '订单状态表 订单的每个状态更改都需要进行记录\r\n10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）  40：交易成功（此时可以评价）50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭）\r\n退货/退货，此分支流程不做，所以不加入' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
