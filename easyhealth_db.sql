-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 19, 2023 at 12:01 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `easyhealth_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `amici`
--

CREATE TABLE `amici` (
  `idamici` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `cognome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `compleanno` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `amici`
--

INSERT INTO `amici` (`idamici`, `nome`, `cognome`, `email`, `compleanno`, `telefono`) VALUES
(1, 'Taiabur', 'Rahman', 'taiaburbd@gmail.com', '10/12/1200', '98989898'),
(2, 'Macron', 'Falish', 'maf@gmail.com', '10/12/1900', '783737737'),
(3, 'M1', 'M2', 'm1@m2.com', '12/12/2020', '787878454'),
(4, 'Rafq', 'Chafiq', 'm2@m2.com', '12/12/2020', '787878454'),
(5, 'Jui', 'Kui', 'jui@m2.com', '12/12/2020', '787878454');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL,
  `patient_id` varchar(20) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `appointment_date` date NOT NULL,
  `time_slot` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `patient_id`, `doctor_id`, `appointment_date`, `time_slot`) VALUES
(1, 'P2305114536', 2, '2023-05-15', '11:00'),
(2, 'P230512117', 2, '2023-05-15', '12:00'),
(4, 'P2305122921', 1, '2023-05-16', '15:00');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_list`
--

CREATE TABLE `doctor_list` (
  `id` int(11) NOT NULL,
  `dr_name` varchar(100) DEFAULT NULL,
  `dr_phone` varchar(60) DEFAULT NULL,
  `dr_email` varchar(100) DEFAULT NULL,
  `created_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor_list`
--

INSERT INTO `doctor_list` (`id`, `dr_name`, `dr_phone`, `dr_email`, `created_date`) VALUES
(1, 'Mr Doctor Rock', '00000', 'rock@ck.com', '2023-05-12'),
(2, 'Mr Doctor Nick', '00000', 'nick@ck.com', '2023-05-12');

-- --------------------------------------------------------

--
-- Table structure for table `loginInfo`
--

CREATE TABLE `loginInfo` (
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginInfo`
--

INSERT INTO `loginInfo` (`userName`, `password`) VALUES
('prova', 'prova');

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

CREATE TABLE `login_info` (
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `create_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`user_name`, `password`, `create_date`) VALUES
('mmz', 'mmzz', '2023-05-08'),
('prova', 'prova', '0000-00-00');

--
-- Triggers `login_info`
--
DELIMITER $$
CREATE TRIGGER `log_info_triger` BEFORE INSERT ON `login_info` FOR EACH ROW INSERT INTO loginInfo (loginInfo.userName, loginInfo.password) VALUES (login_info.user_name, login_info.password)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `patient_list`
--

CREATE TABLE `patient_list` (
  `patient_id` varchar(30) NOT NULL,
  `patient_name` varchar(100) NOT NULL,
  `patient_phone` varchar(100) NOT NULL,
  `patient_email` varchar(100) DEFAULT NULL,
  `patient_blood_group` varchar(4) DEFAULT NULL,
  `patient_dob` date DEFAULT NULL,
  `patient_sex` varchar(10) NOT NULL,
  `created_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_list`
--

INSERT INTO `patient_list` (`patient_id`, `patient_name`, `patient_phone`, `patient_email`, `patient_blood_group`, `patient_dob`, `patient_sex`, `created_date`) VALUES
('P2305114536', 'Taiabur', '01914651671', 'taiaburbd@gmail.com', 'A+', '2023-05-11', 'Male', '2023-05-11'),
('P230512117', 'Carmen', '00000', 'carman@man.com', 'A+', '2023-05-12', 'Female', '2023-05-12'),
('P230512292', 'Zain', '00000000', 'Zain@gmail.com', 'A+', '2023-05-12', 'Male', '2023-05-12'),
('P2305122921', 'Imran Khan', '00000000', 'imran@khan', 'A+', '2023-05-12', 'Male', '2023-05-12'),
('P2305132656', 'Amina', '000000', 'amina@bz.com', 'A-', '2023-05-13', 'Female', '2023-05-13');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `prod_id` int(11) NOT NULL,
  `prod_name` varchar(100) NOT NULL,
  `prod_price` decimal(8,2) NOT NULL,
  `prod_category` varchar(100) NOT NULL,
  `created_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`prod_id`, `prod_name`, `prod_price`, `prod_category`, `created_date`) VALUES
(1, 'Iphone', '100.00', 'mobile phone', '2023-05-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `amici`
--
ALTER TABLE `amici`
  ADD PRIMARY KEY (`idamici`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctor_list`
--
ALTER TABLE `doctor_list`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `loginInfo`
--
ALTER TABLE `loginInfo`
  ADD PRIMARY KEY (`userName`);

--
-- Indexes for table `login_info`
--
ALTER TABLE `login_info`
  ADD PRIMARY KEY (`user_name`);

--
-- Indexes for table `patient_list`
--
ALTER TABLE `patient_list`
  ADD UNIQUE KEY `patient_id` (`patient_id`),
  ADD KEY `admission_date` (`created_date`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`prod_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `amici`
--
ALTER TABLE `amici`
  MODIFY `idamici` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `doctor_list`
--
ALTER TABLE `doctor_list`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `prod_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
