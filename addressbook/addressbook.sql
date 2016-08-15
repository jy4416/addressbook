# Host: localhost  (Version: 5.0.18-nt)
# Date: 2016-08-12 10:00:56
# Generator: MySQL-Front 5.3  (Build 4.198)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "fgroup"
#

CREATE TABLE `fgroup` (
  `gid` int(11) NOT NULL auto_increment,
  `gname` varchar(255) default NULL,
  `gdetail` varchar(255) default NULL,
  PRIMARY KEY  (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "fgroup"
#

INSERT INTO `fgroup` VALUES (1,'同事','这是同事组'),(2,'朋友','这是朋友组'),(3,'同学','这是同学组'),(6,'aab','ddddd');

#
# Structure for table "friend"
#

CREATE TABLE `friend` (
  `fid` int(11) NOT NULL auto_increment,
  `fname` varchar(255) NOT NULL default '',
  `sex` tinyint(1) default NULL,
  `birthday` date default NULL,
  `email` varchar(255) default NULL,
  `mobile` varchar(20) default NULL,
  `fdetail` text,
  `faddress` varchar(255) default NULL,
  PRIMARY KEY  (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "friend"
#

INSERT INTO `friend` VALUES (1,'张三',1,'1991-07-06',NULL,'12345678901',NULL,NULL),(2,'李四',1,'1992-06-06',NULL,'12345678901',NULL,NULL),(3,'赵五',0,'2012-06-06',NULL,'12345678901',NULL,NULL),(4,'大海',0,'2018-06-06',NULL,'12345678901',NULL,NULL);

#
# Structure for table "groupfriend"
#

CREATE TABLE `groupfriend` (
  `fgid` int(11) NOT NULL auto_increment,
  `fid` int(11) NOT NULL default '0',
  `gid` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`fgid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "groupfriend"
#

