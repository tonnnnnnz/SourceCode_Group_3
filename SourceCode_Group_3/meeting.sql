-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2021 at 02:18 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `meeting`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Fname` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Lname` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `username`, `password`, `Fname`, `Lname`) VALUES
(1, 'user1', '123', 'phuwaphan', 'yan'),
(2, 'user2', '123', 'sumet', 'bua');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `title` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `fname` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `lname` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `date` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `stime` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `etime` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `meeting` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `detail` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `title`, `fname`, `lname`, `date`, `stime`, `etime`, `meeting`, `detail`) VALUES
(30, 'games', 'Phuwaphan', 'Yankomut', '2021-02-20', '07:00', '', 'Snailwhite1:อาคาร 1 ชั้น 1 (12)', 'Play'),
(31, 'Meet', 'Sumet', 'Buarod', '2021-02-19', '08:00', '', 'RJmeet1:อาคารหน้า ชั้น 1 (4)', 'Meeting'),
(32, 'test', 'Phuwaphan', 'Yankomut', '2021-02-26', '08:00', '09:31', 'Snailwhite6:อาคาร 2 ชั้น 1 (6)', 'Test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
