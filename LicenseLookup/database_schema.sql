-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 12, 2013 at 11:27 AM
-- Server version: 5.5.31
-- PHP Version: 5.3.10-1ubuntu3.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT=0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `amateur_radio`
--

-- --------------------------------------------------------

--
-- Table structure for table `callsign_lookup`
--
-- Creation: Jun 26, 2013 at 12:18 PM
--

DROP TABLE IF EXISTS `callsign_lookup`;
CREATE TABLE IF NOT EXISTS `callsign_lookup` (
  `callsign_lookup_id` int(10) NOT NULL AUTO_INCREMENT,
  `callsign` varchar(50) DEFAULT NULL,
  `lookup_date` datetime DEFAULT NULL,
  PRIMARY KEY (`callsign_lookup_id`),
  KEY `lookup_date` (`lookup_date`),
  KEY `callsign` (`callsign`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=309 ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
