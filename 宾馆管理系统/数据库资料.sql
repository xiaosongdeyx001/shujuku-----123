/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.27 : Database - hotel_management
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hotel_management` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `hotel_management`;

/*Table structure for table `check_in` */

DROP TABLE IF EXISTS `check_in`;

CREATE TABLE `check_in` (
  `ROOM_NAME` varchar(20) NOT NULL,
  `ID_CARD` varchar(20) NOT NULL,
  `IS_PAY` varchar(10) DEFAULT NULL,
  `STATE` varchar(20) DEFAULT NULL,
  `IN_TIME` datetime NOT NULL,
  `OUT_TIME` datetime DEFAULT NULL,
  `PRO1` varchar(20) DEFAULT NULL,
  `PRO2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ROOM_NAME`,`ID_CARD`,`IN_TIME`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `check_in` */

insert  into `check_in`(`ROOM_NAME`,`ID_CARD`,`IS_PAY`,`STATE`,`IN_TIME`,`OUT_TIME`,`PRO1`,`PRO2`) values ('XS101','123456123456123450','已付款','已经退房','2016-01-02 19:30:01','2016-01-04 00:00:00',NULL,NULL),('XS101','123456123456123451','已付款','已经退房','2016-01-02 18:52:29','2016-01-03 00:00:00',NULL,NULL),('XS101','123456123456123454','已付款','已经退房','2016-01-02 19:07:20','2016-01-03 00:00:00',NULL,NULL),('XS101','123456123456123454','已付款','已经退房','2016-01-02 19:16:40','2016-01-04 00:00:00',NULL,NULL),('XS101','123456123456123456','已付款','已经退房','2016-01-02 18:52:01','2016-01-03 00:00:00',NULL,NULL),('XS101','123456123456123456','未付款','正在入住','2016-01-06 13:06:33','2016-01-09 00:00:00',NULL,NULL),('XS102','123456123456123452','已付款','已经退房','2016-01-02 19:18:42','2016-01-04 00:00:00',NULL,NULL),('XS103','123456123456123455','已付款','已经退房','2016-01-02 19:21:20','2016-01-04 00:00:00',NULL,NULL),('XS204','123456123456123450','已付款','已经退房','2016-01-01 18:07:21','2016-01-13 00:00:00',NULL,NULL),('XS204','123456123456123450','未付款','正在入住','2016-01-06 13:09:04','2016-01-07 00:00:00',NULL,NULL);

/*Table structure for table `room_management` */

DROP TABLE IF EXISTS `room_management`;

CREATE TABLE `room_management` (
  `ROOM_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROOM_NAME` varchar(20) NOT NULL,
  `PRICE` decimal(10,0) DEFAULT NULL,
  `KIND` varchar(20) DEFAULT NULL,
  `STATE` varchar(20) DEFAULT NULL,
  `REMARK` varchar(20) DEFAULT NULL,
  `PRO2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ROOM_ID`,`ROOM_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=gbk;

/*Data for the table `room_management` */

insert  into `room_management`(`ROOM_ID`,`ROOM_NAME`,`PRICE`,`KIND`,`STATE`,`REMARK`,`PRO2`) values (15,'XS101','150','单人间','入住','无窗，靠近走廊',NULL),(16,'XS102','320','大床间','未入住','靠近走廊:隔音好',NULL),(17,'XS103','320','双人间','未入住','隔音好',NULL),(18,'XS202','380','标准间','未入住','隔音好',NULL),(19,'XS203','220','单人间','维修','在维修中。。。',NULL),(20,'XS204','220','单人间','入住','窗户朝西',NULL),(21,'XS205','220','单人间','未入住','窗户朝西',NULL),(22,'XS206','220','标准间单人住','未入住','窗户朝西',NULL),(23,'XS104','320','标准间','未入住','窗户朝西',NULL),(24,'XS105','320','标准间单人住','未入住','窗户朝东',NULL),(25,'XS106','320','三人间','未入住','窗户朝东',NULL),(26,'XS107','220','三人间','未入住','窗户朝东',NULL),(27,'XS108','320','三人间','未入住','窗户靠西',NULL);

/*Table structure for table `roomer_management` */

DROP TABLE IF EXISTS `roomer_management`;

CREATE TABLE `roomer_management` (
  `ID_CARD` varchar(20) NOT NULL,
  `NAME` varchar(20) DEFAULT NULL,
  `PHONE` varchar(20) DEFAULT NULL,
  `ADDRESS` varchar(20) DEFAULT NULL,
  `STATE` varchar(20) DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  `PRO2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_CARD`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `roomer_management` */

insert  into `roomer_management`(`ID_CARD`,`NAME`,`PHONE`,`ADDRESS`,`STATE`,`REMARK`,`PRO2`) values ('123456123456123450','厉杰','12345612345','杭州','入住','',NULL),('123456123456123451','吴伟帅','12345612345','安吉','未入住','',NULL),('123456123456123452','卢杰','12345612345','温州','未入住','',NULL),('123456123456123453','黄章晖','12345612345','温州','未入住','',NULL),('123456123456123454','钱观养','12345612345','绍兴','未入住','',NULL),('123456123456123455','袁予沛','12345612345','绍兴','未入住','',NULL),('123456123456123456','路人1','12345612345','宁波','入住','',NULL),('123456123456123457','路人2','12345612345','金华','未入住','',NULL),('123456123456123458','路人3','12345612345','丽水','未入住','',NULL),('123456123456123459','路人4','12345612345','宁波','未入住','',NULL),('330327119791209120','陈建南','12345612345','温州','未入住','',NULL);

/*Table structure for table `userinfo` */

DROP TABLE IF EXISTS `userinfo`;

CREATE TABLE `userinfo` (
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `LEVEL` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `PRO2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `userinfo` */

insert  into `userinfo`(`userName`,`password`,`LEVEL`,`status`,`PRO2`) values ('testadmin','testadmin',NULL,'1',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
