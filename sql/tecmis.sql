-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2019 at 05:40 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tecmis`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `admLogin`(IN username varchar(20), IN pwd varchar(30))
BEGIN
select * from user where user_id=username and user_pwd=pwd and user_id like 'adm%' LIMIT 1;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `lecLogin`(IN username varchar(20), IN pwd varchar(30))
BEGIN
 select * from user where user_id=username and user_pwd=pwd and user_id like 'lec%' LIMIT 1;
 END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `stuLogin`(IN username varchar(30), IN pwd varchar(30))
BEGIN
select * from user where user_id=username and user_pwd=pwd and user_id like 'tg%' LIMIT 1;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `toLogin`(IN username varchar(30), IN pwd varchar(30))
BEGIN
select * from user where user_id=username and user_pwd=pwd and user_id like 'tec%' LIMIT 1;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `ad_id` char(5) NOT NULL,
  `ad_name` varchar(20) NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `ad_p_no` int(11) DEFAULT NULL,
  `image` longblob NOT NULL,
  PRIMARY KEY (`ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ad_id`, `ad_name`, `gender`, `ad_p_no`, `image`) VALUES
('adm01', 'Mr.D.W.Samarjeewa', 'M', 774178148, 0x5b42403764353366363832);

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE IF NOT EXISTS `attendance` (
  `stu_id` char(6) NOT NULL,
  `sub_id` char(7) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int(1) DEFAULT NULL,
  `status` enum('0','1') DEFAULT NULL,
  PRIMARY KEY (`stu_id`,`day`,`type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`stu_id`, `sub_id`, `day`, `type`, `hours`, `status`) VALUES
('tg001', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-04-09', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-04-14', 'T', 2, '0'),
('tg001', 'ICT2123', '2019-04-15', 'P', 3, '0'),
('tg001', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-04-30', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-05-20', 'T', 2, '0'),
('tg001', 'ICT2123', '2019-05-21', 'P', 3, '0'),
('tg001', 'ICT2123', '2019-05-27', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-05-28', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg001', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg001', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-04-09', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-04-30', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-05-06', 'T', 2, '0'),
('tg002', 'ICT2123', '2019-05-07', 'P', 3, '0'),
('tg002', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-05-20', 'T', 2, '0'),
('tg002', 'ICT2123', '2019-05-21', 'P', 3, '0'),
('tg002', 'ICT2123', '2019-05-27', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-05-28', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-06-10', 'T', 2, '0'),
('tg002', 'ICT2123', '2019-06-11', 'P', 3, '0'),
('tg002', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-06-24', 'T', 2, '0'),
('tg002', 'ICT2123', '2019-06-25', 'P', 3, '0'),
('tg002', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg002', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg002', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-04-08', 'T', 2, '0'),
('tg003', 'ICT2123', '2019-04-09', 'P', 3, '0'),
('tg003', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-04-29', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-05-27', 'T', 2, '0'),
('tg003', 'ICT2123', '2019-05-28', 'P', 3, '0'),
('tg003', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-06-03', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-06-10', 'T', 2, '0'),
('tg003', 'ICT2123', '2019-06-11', 'P', 3, '0'),
('tg003', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg003', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg003', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-04-09', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-04-30', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-05-27', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-05-28', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-06-24', 'T', 2, '0'),
('tg004', 'ICT2123', '2019-06-25', 'P', 3, '0'),
('tg004', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg004', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg004', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-04-03', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-04-14', 'T', 2, '0'),
('tg005', 'ICT2123', '2019-04-15', 'P', 3, '0'),
('tg005', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-04-24', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-05-27', 'T', 2, '0'),
('tg005', 'ICT2123', '2019-05-28', 'P', 3, '0'),
('tg005', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg005', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg005', 'ICT2123', '2019-09-23', 'P', 2, '1'),
('tg005', 'ICT2123', '2019-09-24', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-04-09', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-04-29', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-05-27', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-05-28', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg006', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg006', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-04-08', 'T', 2, '0'),
('tg007', 'ICT2123', '2019-04-09', 'P', 3, '0'),
('tg007', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-04-30', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-05-13', 'T', 2, '0'),
('tg007', 'ICT2123', '2019-05-14', 'P', 3, '0'),
('tg007', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-05-27', 'T', 2, '0'),
('tg007', 'ICT2123', '2019-05-28', 'P', 3, '0'),
('tg007', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg007', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg007', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-04-02', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-04-09', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-04-29', 'T', 2, '0'),
('tg008', 'ICT2123', '2019-04-30', 'P', 3, '0'),
('tg008', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-05-27', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-05-28', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-06-10', 'T', 2, '0'),
('tg008', 'ICT2123', '2019-06-11', 'P', 3, '0'),
('tg008', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg008', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-07-01', 'T', 2, '0'),
('tg008', 'ICT2123', '2019-07-02', 'P', 3, '0'),
('tg008', 'ICT2123', '2019-07-03', 'P', 3, '1'),
('tg008', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-04-04', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-04-05', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-04-16', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-04-22', 'T', 2, '0'),
('tg009', 'ICT2123', '2019-04-23', 'P', 3, '0'),
('tg009', 'ICT2123', '2019-04-24', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-05-02', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-05-27', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-05-28', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-06-17', 'T', 2, '0'),
('tg009', 'ICT2123', '2019-06-18', 'P', 3, '0'),
('tg009', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg009', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg009', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-04-01', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-04-02', 'P', 3, '0'),
('tg010', 'ICT2123', '2019-04-08', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-04-09', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-04-14', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-04-15', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-04-22', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-04-23', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-04-29', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-04-29', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-05-06', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-05-07', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-05-13', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-05-14', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-05-20', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-05-21', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-05-27', 'T', 2, '0'),
('tg010', 'ICT2123', '2019-05-28', 'P', 3, '0'),
('tg010', 'ICT2123', '2019-06-03', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-06-04', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-06-10', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-06-11', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-06-17', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-06-18', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-06-24', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-06-25', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-07-01', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-07-02', 'P', 3, '1'),
('tg010', 'ICT2123', '2019-07-08', 'T', 2, '1'),
('tg010', 'ICT2123', '2019-07-09', 'P', 3, '1'),
('tg222', 'ict3333', '2019-09-22', 'T', 3, '0');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `dept_id` char(6) NOT NULL,
  `dept_name` varchar(40) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dept_id`, `dept_name`) VALUES
('depENT', 'Engineering'),
('depICT', 'Information Communication Technology');

-- --------------------------------------------------------

--
-- Table structure for table `ict_ca`
--

CREATE TABLE IF NOT EXISTS `ict_ca` (
  `sub_id` char(7) NOT NULL,
  `stu_id` char(6) NOT NULL,
  `q1` decimal(5,2) DEFAULT NULL,
  `q2` decimal(5,2) DEFAULT NULL,
  `q3` decimal(5,2) DEFAULT NULL,
  `q4` decimal(5,2) DEFAULT NULL,
  `ass1` decimal(5,2) DEFAULT NULL,
  `ass2` decimal(5,2) DEFAULT NULL,
  `ass3` decimal(5,2) DEFAULT NULL,
  `mid` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`sub_id`,`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ict_ca`
--

INSERT INTO `ict_ca` (`sub_id`, `stu_id`, `q1`, `q2`, `q3`, `q4`, `ass1`, `ass2`, `ass3`, `mid`) VALUES
('ICT2113', 'tg001', '78.00', '62.00', '54.00', NULL, NULL, NULL, NULL, '65.00'),
('ICT2113', 'tg002', '46.00', '25.00', '96.00', NULL, NULL, NULL, NULL, '84.00'),
('ICT2113', 'tg003', '45.00', '23.00', '89.00', NULL, NULL, NULL, NULL, '68.00'),
('ICT2113', 'tg004', '74.00', '57.00', '56.00', NULL, NULL, NULL, NULL, '85.00'),
('ICT2113', 'tg005', '100.00', '75.00', '84.00', NULL, NULL, NULL, NULL, '0.00'),
('ICT2113', 'tg006', '74.00', '85.00', '96.00', NULL, NULL, NULL, NULL, '32.00'),
('ICT2123', 'tg001', '50.00', '89.00', '45.00', NULL, '65.00', '53.00', '75.00', NULL),
('ICT2123', 'tg002', '76.00', '63.00', '78.00', NULL, '96.00', '59.50', '63.00', NULL),
('ICT2123', 'tg003', '46.00', '89.00', '63.00', NULL, '75.00', '63.00', '73.00', NULL),
('ICT2123', 'tg004', '10.00', '50.00', '45.00', NULL, '65.00', '55.00', '63.00', NULL),
('ICT2123', 'tg005', '89.00', '92.00', '75.00', NULL, '89.00', '62.00', '68.00', NULL),
('ICT2123', 'tg006', '63.00', '76.00', '52.00', NULL, '43.00', '80.00', '63.00', NULL),
('ict2123', 'tg200', '89.00', '89.00', '89.00', '89.00', '89.00', '89.00', '89.00', '89.00'),
('ICT2133', 'tg001', '25.00', '0.00', '78.00', NULL, NULL, NULL, NULL, '96.00'),
('ICT2133', 'tg002', '56.00', '42.00', '36.00', NULL, NULL, NULL, NULL, '78.00'),
('ICT2133', 'tg003', '99.00', '65.00', '32.00', NULL, NULL, NULL, NULL, '17.00'),
('ICT2133', 'tg004', '88.00', '97.00', '76.00', NULL, NULL, NULL, NULL, '48.00'),
('ICT2133', 'tg005', '25.00', '74.00', '64.00', NULL, NULL, NULL, NULL, '38.00'),
('ICT2133', 'tg006', '75.00', '65.00', '24.00', NULL, NULL, NULL, NULL, '79.00'),
('ICT2142', 'tg001', '79.00', '89.00', '56.00', '23.00', '79.00', '86.00', NULL, '45.00'),
('ICT2142', 'tg002', '0.00', '89.00', '78.00', '96.00', '73.00', '45.00', NULL, '12.00'),
('ICT2142', 'tg003', '45.00', '36.00', '72.00', '45.00', '69.00', '30.00', NULL, '89.00'),
('ICT2142', 'tg004', '63.00', '75.00', '68.00', '49.00', '63.00', '75.00', NULL, '49.00'),
('ICT2142', 'tg005', '96.00', '79.00', '63.00', '85.00', '91.00', '20.00', NULL, '36.00'),
('ICT2142', 'tg006', '73.00', '84.00', '67.00', '78.00', '37.00', '68.00', NULL, '55.00'),
('ICT2153', 'tg001', '63.00', '89.00', '45.00', NULL, '63.00', '70.00', '65.50', NULL),
('ICT2153', 'tg002', '89.00', '75.00', '63.00', NULL, '40.00', '63.00', '70.00', NULL),
('ICT2153', 'tg003', '68.00', '87.00', '46.00', NULL, '58.00', '78.00', '47.00', NULL),
('ICT2153', 'tg004', '69.00', '34.00', '15.00', NULL, '78.00', '62.00', '38.00', NULL),
('ICT2153', 'tg005', '57.00', '48.00', '65.00', NULL, '58.00', '66.00', '74.00', NULL),
('ICT2153', 'tg006', '47.00', '52.00', '36.00', NULL, '55.00', '99.00', '65.00', NULL),
('tcd212', 'tg200', '89.00', '89.00', '89.00', '89.00', '89.00', '89.00', '89.00', '89.00'),
('TCS2112', 'tg001', '63.00', '89.00', '75.00', NULL, '46.00', '56.00', '81.00', NULL),
('TCS2112', 'tg002', '89.00', '78.00', '69.50', NULL, '90.00', '65.00', '76.00', NULL),
('TCS2112', 'tg003', '89.00', '63.00', '41.00', NULL, '63.00', '45.00', '36.00', NULL),
('TCS2112', 'tg004', '79.00', '63.00', '52.00', NULL, '46.00', '93.00', '79.00', NULL),
('TCS2112', 'tg005', '63.00', '45.00', '78.00', NULL, '96.00', '46.00', '70.00', NULL),
('TCS2112', 'tg006', '96.00', '45.00', '73.00', NULL, '45.00', '70.00', '90.00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ict_final_exam`
--

CREATE TABLE IF NOT EXISTS `ict_final_exam` (
  `sub_id` char(7) NOT NULL,
  `stu_id` char(6) NOT NULL,
  `practical` decimal(5,2) DEFAULT NULL,
  `theory` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`sub_id`,`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ict_final_exam`
--

INSERT INTO `ict_final_exam` (`sub_id`, `stu_id`, `practical`, `theory`) VALUES
('ICT2113', 'tg001', '54.00', '65.00'),
('ICT2113', 'tg002', '46.00', '24.00'),
('ICT2113', 'tg003', '45.00', '23.00'),
('ICT2113', 'tg004', '74.00', '55.00'),
('ICT2113', 'tg005', '100.00', '0.00'),
('ICT2113', 'tg006', '75.00', '92.00'),
('ICT2123', 'tg001', '80.00', '89.00'),
('ICT2123', 'tg002', '75.00', '65.00'),
('ICT2123', 'tg003', '50.00', '56.00'),
('ICT2123', 'tg004', '65.50', '70.00'),
('ICT2123', 'tg005', '45.90', '60.00'),
('ICT2123', 'tg006', '70.00', '81.00'),
('ICT2133', 'tg001', '78.00', '96.00'),
('ICT2133', 'tg002', '56.00', '78.00'),
('ICT2133', 'tg003', '99.00', '17.00'),
('ICT2133', 'tg004', '76.00', '48.00'),
('ICT2133', 'tg005', '25.00', '38.00'),
('ICT2133', 'tg006', '75.00', '65.00'),
('ICT2142', 'tg001', NULL, '80.00'),
('ICT2142', 'tg002', NULL, '65.50'),
('ICT2142', 'tg003', NULL, '79.00'),
('ICT2142', 'tg004', NULL, '98.00'),
('ICT2142', 'tg005', NULL, '63.00'),
('ICT2142', 'tg006', NULL, '55.00'),
('ICT2153', 'tg001', '63.00', '0.00'),
('ICT2153', 'tg002', '88.00', '70.00'),
('ICT2153', 'tg003', '68.00', '47.00'),
('ICT2153', 'tg004', '62.00', '38.00'),
('ICT2153', 'tg005', '66.00', '74.00'),
('ICT2153', 'tg006', '47.00', '65.00'),
('tcd212', 'tg200', '89.00', '89.00'),
('TCS2112', 'tg001', '63.00', '75.50'),
('TCS2112', 'tg002', '73.00', '56.00'),
('TCS2112', 'tg003', '50.00', '70.00'),
('TCS2112', 'tg004', '96.00', '49.00'),
('TCS2112', 'tg005', '79.00', '53.00'),
('TCS2112', 'tg006', '96.00', '75.00');

-- --------------------------------------------------------

--
-- Table structure for table `ict_level_i`
--

CREATE TABLE IF NOT EXISTS `ict_level_i` (
  `time` varchar(15) NOT NULL,
  `mon` char(11) DEFAULT NULL,
  `tue` char(11) DEFAULT NULL,
  `wed` char(11) DEFAULT NULL,
  `thu` char(11) DEFAULT NULL,
  `fri` char(11) DEFAULT NULL,
  PRIMARY KEY (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ict_level_i`
--

INSERT INTO `ict_level_i` (`time`, `mon`, `tue`, `wed`, `thu`, `fri`) VALUES
('08.00-09.00', 'ICT1123(P)', 'ICT1143(T)', 'ENG1114(T)', 'ICT1133(T)', ''),
('09.00-10.00', 'ICT1123(P)', 'ICT1113(T)', 'ENG1114(T)', 'ICT1133(T)', ''),
('10.00-11.00', 'ICT1123(P)', 'ICT1133(T)', '', '', 'TMS1113(T)'),
('11.00-12.00', 'L', 'U', 'N', 'C', 'H'),
('12.00-13.00', 'ICT1113(T)', 'ICT1143(T)', '', 'ICT1133(P)', 'ICT1133(P)'),
('13.00-14.00', 'ICT1143(P)', 'ICT1143(T)', '', 'ICT1133(P)', 'ICT1123(T)'),
('14.00-15.00', 'ICT1143(P)', 'ICT1123(T)', '', 'TMS1113(T)', 'ICT1123(T)'),
('15.00-06.00', 'ICT1143(P)', '', '', 'TMS1113(T)', '');

-- --------------------------------------------------------

--
-- Table structure for table `ict_level_ii`
--

CREATE TABLE IF NOT EXISTS `ict_level_ii` (
  `time` varchar(15) NOT NULL,
  `mon` char(11) DEFAULT NULL,
  `tue` char(11) DEFAULT NULL,
  `wed` char(11) DEFAULT NULL,
  `thu` char(11) DEFAULT NULL,
  `fri` char(11) DEFAULT NULL,
  PRIMARY KEY (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ict_level_ii`
--

INSERT INTO `ict_level_ii` (`time`, `mon`, `tue`, `wed`, `thu`, `fri`) VALUES
('08.00-09.00', 'ICT2113(T)', 'ICT2133(T)', '', '', ''),
('09.00-10.00', 'ICT2113(T)', 'ICT2133(T)', 'ICT2133(P)', 'ICT2123(P)', 'ICT2153(P)'),
('10.00-11.00', 'ICT2153(T)', 'ICT2123(T)', 'ICT2133(P)', 'ICT2123(P)', 'ICT2153(P)'),
('11.00-12.00', 'ICT2153(T)', 'ICT2123(T)', 'ICT2133(P)', 'ICT2123(P)', 'ICT2153(P)'),
('12.00-13.00', 'L', 'U', 'N', 'C', 'H'),
('13.00-14.00', 'TCS2122(T)', 'ICT2133(P)', '', 'ICT2143(T)', 'ICT2143(P)'),
('14.00-15.00', 'TCS2122(T)', 'ICT2133(P)', '', 'ICT2143(T)', 'ICT2143(P)'),
('15.00-16.00', '', 'ICT2133(P)', '', '', 'ICT2143(P)');

-- --------------------------------------------------------

--
-- Table structure for table `ict_level_iii`
--

CREATE TABLE IF NOT EXISTS `ict_level_iii` (
  `time` varchar(15) NOT NULL,
  `mon` char(11) NOT NULL,
  `tue` char(11) NOT NULL,
  `wed` char(11) NOT NULL,
  `thu` char(11) NOT NULL,
  `fri` char(11) NOT NULL,
  PRIMARY KEY (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ict_level_iii`
--

INSERT INTO `ict_level_iii` (`time`, `mon`, `tue`, `wed`, `thu`, `fri`) VALUES
('08.00-09.00', 'ICT312', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE IF NOT EXISTS `lecturer` (
  `lec_id` char(5) NOT NULL,
  `lec_dept_id` char(6) NOT NULL,
  `lec_name` varchar(20) NOT NULL,
  `lec_address` varchar(40) NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `lec_p_no` int(11) DEFAULT NULL,
  `image` longblob NOT NULL,
  PRIMARY KEY (`lec_id`),
  KEY `lec_dept_id` (`lec_dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lec_id`, `lec_dept_id`, `lec_name`, `lec_address`, `gender`, `lec_p_no`, `image`) VALUES
('lec01', 'depENT', 'Dr.D.W.Rupasinghe', '201,Shanthi Villa,Silkhouse Street,Kandy', 'M', 772307637, 0x5b42403434636635386333),
('lec02', 'depICT', 'Miss.M.S.W.Liyanage', '475,Union Place,Colombo 02', 'F', 717678678, ''),
('lec03', 'depICT', 'Dr.B.S.Herath', '207/1,Dharmapala Mawatha,Colombo 07', 'F', 752691649, ''),
('lec04', 'depICT', 'Mr.J.O.P.Mendis', '188/f,Vauxhall Street,Mathale', 'M', 722697855, '');

-- --------------------------------------------------------

--
-- Table structure for table `medical`
--

CREATE TABLE IF NOT EXISTS `medical` (
  `stu_id` char(6) NOT NULL,
  `sub_id` char(7) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int(1) DEFAULT NULL,
  PRIMARY KEY (`stu_id`,`day`,`type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical`
--

INSERT INTO `medical` (`stu_id`, `sub_id`, `day`, `type`, `hours`) VALUES
('tg001', 'ict2323', '2019-04-05', 'T', 2),
('tg001', 'ICT2123', '2019-04-15', 'T', 2),
('tg001', 'ICT2123', '2019-05-20', 'T', 2),
('tg001', 'ICT2123', '2019-05-21', 'P', 3),
('tg002', 'ICT2123', '2019-05-06', 'T', 2),
('tg002', 'ICT2123', '2019-05-07', 'P', 3),
('tg002', 'ICT2123', '2019-05-20', 'T', 2),
('tg002', 'ICT2123', '2019-05-21', 'P', 3),
('tg002', 'ICT2123', '2019-06-10', 'T', 2),
('tg002', 'ICT2123', '2019-06-11', 'P', 3),
('tg002', 'ICT2123', '2019-06-25', 'P', 3),
('tg003', 'ICT2123', '2019-04-08', 'T', 2),
('tg003', 'ICT2123', '2019-04-09', 'P', 3),
('tg003', 'ICT2123', '2019-05-27', 'T', 2),
('tg003', 'ICT2123', '2019-05-28', 'P', 3),
('tg003', 'ICT2123', '2019-06-11', 'P', 3),
('tg004', 'ICT2123', '2019-06-25', 'P', 3),
('tg005', 'ICT2123', '2019-04-14', 'T', 2),
('tg005', 'ICT2123', '2019-04-15', 'P', 3),
('tg005', 'ICT2123', '2019-05-28', 'P', 3),
('tg006', 'ICT2123', '2019-04-29', 'T', 2),
('tg006', 'ICT2123', '2019-06-17', 'T', 2),
('tg007', 'ICT2123', '2019-04-08', 'T', 2),
('tg007', 'ICT2123', '2019-04-09', 'P', 3),
('tg007', 'ICT2123', '2019-05-13', 'T', 2),
('tg007', 'ICT2123', '2019-05-14', 'P', 3),
('tg007', 'ICT2123', '2019-05-28', 'P', 3),
('tg008', 'ICT2123', '2019-04-29', 'T', 2),
('tg008', 'ICT2123', '2019-04-30', 'P', 3),
('tg008', 'ICT2123', '2019-06-10', 'T', 2),
('tg008', 'ICT2123', '2019-06-11', 'P', 3),
('tg008', 'ICT2123', '2019-07-01', 'T', 2),
('tg008', 'ICT2123', '2019-07-02', 'P', 3),
('tg009', 'ICT2123', '2019-04-22', 'T', 2),
('tg009', 'ICT2123', '2019-04-23', 'P', 3),
('tg009', 'ICT2123', '2019-06-18', 'P', 3),
('tg010', 'ICT2123', '2019-04-01', 'T', 2),
('tg010', 'ICT2123', '2019-04-02', 'P', 3),
('tg010', 'ICT2123', '2019-05-27', 'T', 2),
('tg010', 'ICT2123', '2019-05-28', 'P', 3);

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

CREATE TABLE IF NOT EXISTS `notice` (
  `no` int(5) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `title` varchar(150) NOT NULL,
  `notice` varchar(1000) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`no`, `date`, `title`, `notice`) VALUES
(1, '2019-05-05', 'Notice for All the Students', 'Applications are invited from eligible candidates for the semester I, examination of Level I, II and III,\nBachelor of Engineering Technology, Bachelor of Information and communication Technology and \nBachelor of Bio-systems Technology. Students are requested to register for the examination in TECMIS on or \nbefore 18th September 2019. Repeat Students have to register for the ‘Level I and II Semester I’ repeat course \nunits as well.\n\nAssistant Registrar\nFaculty of Technology\n04/09/2019'),
(2, '2019-10-11', 'ENTERING THE FACULTY PREMISES', 'Dear Students,\r\nAll the academic activities of Faculty of Technology will resume on Tuesday the 15th\r\nof October 2019. The hostels will be opened 14th October for students to check in.\r\nAny late arrivals to hostels must be informed to wardens and sub wardens and\r\npermission must be taken before entering the university premises.\r\nNote: All the students must use the main gate to enter the faculty premises on\r\n14th October. '),
(3, '2019-10-19', 'ICT2123 – Object Oriented Development\n        Assessment 02 Evaluation\n', 'Date : 23\nrd Wednesday October 2019\nTime : 01.00 p.m. – 04.30 p.m.\nDuration : 20 minutes per group\nVenue : ICT Lab 11\nArea : Mini Project\nType : Group Presentation + Viva\n\nNote: No additional Evaluation is conducted for repeat students, all repeat students are \nrequired to face for this evaluation at the same time.'),
(20, '2019-10-23', '1234556', 'asdfgghkhlk');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `stu_id` char(6) NOT NULL,
  `stu_dept_id` char(6) NOT NULL,
  `menter_id` char(5) NOT NULL,
  `stu_name` varchar(25) NOT NULL,
  `stu_address` varchar(40) NOT NULL,
  `gender` enum('M','F') NOT NULL,
  `stu_b_day` date NOT NULL,
  `stu_p_no` int(11) DEFAULT NULL,
  `image` longblob NOT NULL,
  PRIMARY KEY (`stu_id`),
  KEY `stu_dept_id` (`stu_dept_id`),
  KEY `menter_id` (`menter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`stu_id`, `stu_dept_id`, `menter_id`, `stu_name`, `stu_address`, `gender`, `stu_b_day`, `stu_p_no`, `image`) VALUES
('tg001', 'depICT', 'lec01', 'D.C.Perera', 'galle road,Matara', 'F', '1997-08-30', 712123127, 0x5b42403432643935313833),
('tg002', 'depICT', 'lec01', 'I.M.Madhuranga', '56,Palawaththa Road,Polonnaruwa', 'M', '1998-01-03', 758967841, 0x5b42403338346331306161),
('tg003', 'depICT', 'lec02', 'E.P.Karunasena', '89/2,Obeysekarapura,Mathale', 'M', '1997-05-16', 716983789, 0x5b42403163396366633766),
('tg004', 'depICT', 'lec02', 'G.C.S.P.Senarathna', '71/c,Nawam Road,Bibile', 'F', '1997-12-22', 773243379, ''),
('tg005', 'depICT', 'lec03', 'K.P.Silva', '32/2/5,Ranaviru Mawatha,Hatton', 'F', '1997-06-10', 756791347, ''),
('tg006', 'depICT', 'lec03', 'S.Amarasinghe', '66,First Lane,Karandeniya', 'M', '1997-03-20', 789783255, ''),
('tg007', 'depICT', 'lec03', 'H.O.Vidanapathirana', '98/f/2,I.D.H Road,Gothatuwa', 'F', '1997-07-05', 775692783, ''),
('tg008', 'depICT', 'lec04', 'P.D.Thenuwara', '10/5/2,Gajaba Road,Galle', 'F', '1997-02-28', 713497210, ''),
('tg009', 'depICT', 'lec04', 'R.M.Jayawardane', 'Ambelegoda,Padeniya,Kurunegala', 'F', '1998-01-12', 722483796, ''),
('tg010', 'depICT', 'lec04', 'L.T.O.Atapaththu', '25/a,Janatha mawatha,Rathnapura', 'M', '1997-09-25', 788796123, '');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `sub_dept_id` char(6) NOT NULL,
  `sub_id` char(7) NOT NULL,
  `sub_name` varchar(50) NOT NULL,
  `lec_id` char(6) NOT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `sub_dept_id` (`sub_dept_id`),
  KEY `lec_id` (`lec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sub_dept_id`, `sub_id`, `sub_name`, `lec_id`) VALUES
('depICT', 'ICT2113', 'Data Structures and Algorithms', 'lec01'),
('depICT', 'ICT2123', 'Object Oriented Development1', 'lec04'),
('depICT', 'ICT2133', 'Fundamentals of Programming', 'lec03'),
('depICT', 'ICT2143', 'Web Technologies', 'lec02'),
('depICT', 'ICT2153', 'Internet Application', 'lec04'),
('depICT', 'TCS2112', 'Business Economics', 'lec01');

-- --------------------------------------------------------

--
-- Table structure for table `tecnical_officer`
--

CREATE TABLE IF NOT EXISTS `tecnical_officer` (
  `tec_id` char(5) NOT NULL,
  `tec_dept_id` char(6) NOT NULL,
  `tec_name` varchar(20) DEFAULT NULL,
  `gender` enum('F','M') NOT NULL,
  `tec_p_no` int(11) DEFAULT NULL,
  `image` longblob NOT NULL,
  PRIMARY KEY (`tec_id`),
  KEY `tec_dept_id` (`tec_dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tecnical_officer`
--

INSERT INTO `tecnical_officer` (`tec_id`, `tec_dept_id`, `tec_name`, `gender`, `tec_p_no`, `image`) VALUES
('tec01', 'depICT', 'Mr.A.C.Paranavithana', 'M', 76711525, 0x5b42403133343261336632),
('tec02', 'depICT', 'Mr.I.S.Hewapanna', 'M', 702823879, 0x5b42403266643830636663),
('tec10', 'depICT', 'M.M.Minha2', 'F', 71212127, 0x6e756c6c);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` char(5) NOT NULL,
  `user_pwd` varchar(15) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_pwd`) VALUES
('adm01', 'Devinda01'),
('lec01', 'Malinda01'),
('lec02', 'sandali02'),
('lec03', 'biyanka03'),
('lec04', 'Ogandi04'),
('tec01', 'chamindu01'),
('tec02', 'Isuru02'),
('tec10', '123'),
('tg001', 'dewmini01'),
('tg002', 'mihiran02'),
('tg003', 'Pawan03'),
('tg004', 'Sakuni04'),
('tg005', 'kasuni05'),
('tg006', 'sohal06'),
('tg007', 'Helani07'),
('tg008', 'dakshina08'),
('tg009', 'Rashmika09'),
('tg010', 'tehan10'),
('tg080', '123'),
('tg289', '123');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD CONSTRAINT `lecturer_ibfk_1` FOREIGN KEY (`lec_dept_id`) REFERENCES `department` (`dept_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`stu_dept_id`) REFERENCES `department` (`dept_id`),
  ADD CONSTRAINT `student_ibfk_2` FOREIGN KEY (`menter_id`) REFERENCES `lecturer` (`lec_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`sub_dept_id`) REFERENCES `department` (`dept_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `subject_ibfk_2` FOREIGN KEY (`lec_id`) REFERENCES `lecturer` (`lec_id`);

--
-- Constraints for table `tecnical_officer`
--
ALTER TABLE `tecnical_officer`
  ADD CONSTRAINT `tecnical_officer_ibfk_1` FOREIGN KEY (`tec_dept_id`) REFERENCES `department` (`dept_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
