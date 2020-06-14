-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2020 at 09:08 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mis`
--

-- --------------------------------------------------------

--
-- Table structure for table `dname`
--

CREATE TABLE `dname` (
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dname`
--

INSERT INTO `dname` (`name`) VALUES
('big bazar'),
('mumbai');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('wefwfe', 'daok'),
('cc', 'ccc'),
('cc1', 'ccc'),
('cc2', 'ccc'),
('Test', 'Test'),
('chinmay', 'chinu');

-- --------------------------------------------------------

--
-- Table structure for table `order_table`
--

CREATE TABLE `order_table` (
  `id` int(11) NOT NULL,
  `product_name` varchar(30) NOT NULL,
  `dealer_name` varchar(30) NOT NULL,
  `quantity` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order_table`
--

INSERT INTO `order_table` (`id`, `product_name`, `dealer_name`, `quantity`, `date`) VALUES
(1, 'soyaoil', 'dmart', 2, '2020-04-20'),
(2, 'roil', 'reliance', 1, '2020-04-21'),
(3, 'soyaoil', 'dmart', 3, '2020-04-21');

-- --------------------------------------------------------

--
-- Table structure for table `pname`
--

CREATE TABLE `pname` (
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pname`
--

INSERT INTO `pname` (`name`) VALUES
('oil2 1000ml'),
('soyaoil'),
('oil 1 500ml'),
('goil');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `product_name` varchar(30) NOT NULL,
  `dealer_name` varchar(30) NOT NULL,
  `product_price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total_cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `product_name`, `dealer_name`, `product_price`, `quantity`, `total_cost`) VALUES
(1, 'oil1 1000ml', 'dmart', 198, 2, 396),
(2, 'goil', 'big bazar', 300, 2, 600),
(3, 'soyaoil', 'dmart', 200, 4, 800),
(4, 'oil1 500ml', 'amol PVT', 200, 1, 200),
(5, 'oil2 1000ml', 'reliance', 200, 1, 200),
(6, 'oil2 500ml', 'dmart', 200, 1, 200);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `mobile` int(10) NOT NULL,
  `email` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `mobile`, `email`) VALUES
(1, 'vjvw', 13123, 'fdewet'),
(2, 'vjvw', 13123, 'fdewet'),
(3, 'iehfihe', 313, 'wdfw'),
(4, 'cc', 111, 'dfdf'),
(5, 'chinmay', 9970, 'chinu1400@gmail.com'),
(6, 'chinmay', 997000, 'chinu1400@gmail.com'),
(7, 'Test', 1234, 'chinu1400@gmail.com'),
(8, 'chinu', 99, 'chinu1400@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `order_table`
--
ALTER TABLE `order_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
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
-- AUTO_INCREMENT for table `order_table`
--
ALTER TABLE `order_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
