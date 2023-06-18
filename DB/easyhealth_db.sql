-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 13, 2023 at 03:32 AM
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
(23, 'P2305132656', 2, '2023-06-09', '10:00'),
(24, 'P2305293629', 1, '2023-06-11', '10:00'),
(27, 'P230512292', 1, '2023-06-11', '10:00'),
(29, 'P2305293629', 2, '2023-05-30', '12:00'),
(30, 'P2305293629', 1, '2023-07-08', '17:00'),
(31, 'P2305293629', 1, '2023-06-20', '17:00'),
(32, 'P2305293629', 1, '2023-06-20', '17:00');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_list`
--

CREATE TABLE `doctor_list` (
  `id` int(11) NOT NULL,
  `dr_name` varchar(100) DEFAULT NULL,
  `dr_phone` varchar(60) DEFAULT NULL,
  `dr_email` varchar(100) DEFAULT NULL,
  `created_date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor_list`
--

INSERT INTO `doctor_list` (`id`, `dr_name`, `dr_phone`, `dr_email`, `created_date`) VALUES
(1, 'Mr Doctor Rock', '00000', 'rock@ck.com', '2023-05-12'),
(2, 'Mr Doctor Nick', '00000', 'nick@ck.com', '2023-05-12'),
(3, 'Mr doctor', '32 111', 'doc@gmail.com', '2023-05-29');

-- --------------------------------------------------------

--
-- Table structure for table `loginInfo`
--

CREATE TABLE `loginInfo` (
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

CREATE TABLE `login_info` (
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `create_date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`user_name`, `password`, `create_date`) VALUES
('prova', 'prova', '0000-00-00'),
('taiabur', 'taiabur', '2023-05-22'),
('zain', 'zain', '2023-06-09');

-- --------------------------------------------------------

--
-- Table structure for table `medical_imaging`
--

CREATE TABLE `medical_imaging` (
  `image_id` int(11) NOT NULL,
  `pimage_id` int(11) NOT NULL,
  `patient_id` varchar(20) DEFAULT NULL,
  `image_path` text DEFAULT NULL,
  `investigation_type` varchar(50) DEFAULT NULL,
  `created_date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medical_imaging`
--

INSERT INTO `medical_imaging` (`image_id`, `pimage_id`, `patient_id`, `image_path`, `investigation_type`, `created_date`) VALUES
(1, 0, 'P230512117', '965c5faa-5bf2-4893-8163-66393c8c542f.jpg', 'B-Scan', '2023-05-27 02:11:46'),
(2, 0, 'P2305132656', '68488636-f2dd-4b16-b1fd-cd4d423c963d.jpg', 'B-Scan', '2023-05-27 02:11:51'),
(3, 0, 'P2305114536', '485fcba1-da8b-468a-88a9-e9fcfc4b7ca4.jpg', 'B-Scan', '2023-05-27 02:11:57'),
(4, 3, 'P2305114536', 'segmented_image/RBVS/485fcba1-da8b-468a-88a9-e9fcfc4b7ca4.jpg', 'Retinal Blood Vessel Segmentation', '2023-05-27 02:12:36'),
(5, 3, 'P2305114536', 'segmented_image/RBVS/485fcba1-da8b-468a-88a9-e9fcfc4b7ca4.jpg', 'Retinal Blood Vessel Segmentation', '2023-05-27 02:40:22'),
(6, 1, 'P230512117', 'segmented_image/RBVS/965c5faa-5bf2-4893-8163-66393c8c542f.jpg', 'Retinal Blood Vessel Segmentation', '2023-05-28 14:08:59'),
(7, 1, 'P230512117', 'segmented_image/RBVS/965c5faa-5bf2-4893-8163-66393c8c542f.jpg', 'Retinal Blood Vessel Segmentation', '2023-06-09 19:24:45'),
(8, 0, 'P230512292', '1d348283-3481-441d-9a94-db2fa8544c3f.jpg', 'Color Fundus Photograph', '2023-06-09 19:26:17'),
(9, 8, 'P230512292', 'segmented_image/RBVS/1d348283-3481-441d-9a94-db2fa8544c3f.jpg', 'Retinal Blood Vessel Segmentation', '2023-06-09 19:26:54'),
(10, 1, 'P230512117', 'segmented_image/RBVS/965c5faa-5bf2-4893-8163-66393c8c542f.jpg', 'Retinal Blood Vessel Segmentation', '2023-06-13 02:08:10'),
(11, 2, 'P2305132656', 'segmented_image/RBVS/68488636-f2dd-4b16-b1fd-cd4d423c963d.jpg', 'Retinal Blood Vessel Segmentation', '2023-06-13 02:25:51');

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
('P230512117', 'Carmen', '00000', 'carman@man.com', 'A+', '2023-05-12', 'Female', '2023-05-12'),
('P230512292', 'Zain Amin', '00000000', 'Zain@gmail.com', 'A+', '2023-05-12', 'Male', '2023-05-12'),
('P2305132656', 'Amina', '000000', 'amina@bz.com', 'A-', '2023-05-13', 'Female', '2023-05-13'),
('P2305293629', 'Taiabur', '01914651671', 'taiaburbd@gmail.com', 'A+', '2023-05-29', 'Male', '2023-05-29'),
('P230609917', 'Imran', '019122456798', 'imran@gmail.com', 'B+', '2023-06-09', 'Male', '2023-06-09');

-- --------------------------------------------------------

--
-- Table structure for table `prescriptions`
--

CREATE TABLE `prescriptions` (
  `id` int(11) NOT NULL,
  `appointment_id` int(11) DEFAULT NULL,
  `patient_id` varchar(20) DEFAULT NULL,
  `doctor_id` int(11) NOT NULL,
  `history_dm` varchar(20) DEFAULT NULL,
  `htn` varchar(10) DEFAULT NULL,
  `ihd` varchar(10) DEFAULT NULL,
  `ckd` varchar(20) DEFAULT NULL,
  `cabg` varchar(20) DEFAULT NULL,
  `stenting` varchar(20) DEFAULT NULL,
  `anti_coagulaut` varchar(20) DEFAULT NULL,
  `bep` varchar(20) DEFAULT NULL,
  `thyroid` varchar(20) DEFAULT NULL,
  `pace_makcer` varchar(20) DEFAULT NULL,
  `medicine_type` varchar(20) DEFAULT NULL,
  `medicine_name` varchar(50) DEFAULT NULL,
  `medicine_dose` varchar(20) DEFAULT NULL,
  `medicine_duration` varchar(20) DEFAULT NULL,
  `investigation_advice` varchar(30) DEFAULT NULL,
  `treatment_plan` varchar(30) DEFAULT NULL,
  `doctor_note` text DEFAULT NULL,
  `create_date` date NOT NULL DEFAULT current_timestamp(),
  `status` varchar(10) DEFAULT 'inactive'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `prescriptions`
--

INSERT INTO `prescriptions` (`id`, `appointment_id`, `patient_id`, `doctor_id`, `history_dm`, `htn`, `ihd`, `ckd`, `cabg`, `stenting`, `anti_coagulaut`, `bep`, `thyroid`, `pace_makcer`, `medicine_type`, `medicine_name`, `medicine_dose`, `medicine_duration`, `investigation_advice`, `treatment_plan`, `doctor_note`, `create_date`, `status`) VALUES
(1, 11, 'P230512117', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', '', '', NULL, NULL, NULL, '2023-05-24', 'inactive'),
(4, 23, 'P2305132656', 2, 'false', 'true', 'false', 'true', 'true', 'false', NULL, 'false', 'true', NULL, 'Eye Drop', 'Moftim', '2 Drop 4 Hourly', '2 weeks ', 'Color Fundus Photograph (CFP)', 'Lasik Suergery', 'As soon as possible ', '2023-06-13', 'inactive');

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
  ADD PRIMARY KEY (`id`),
  ADD KEY `patient_id_fk` (`patient_id`),
  ADD KEY `doctor_id` (`doctor_id`);

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
-- Indexes for table `medical_imaging`
--
ALTER TABLE `medical_imaging`
  ADD PRIMARY KEY (`image_id`);

--
-- Indexes for table `patient_list`
--
ALTER TABLE `patient_list`
  ADD UNIQUE KEY `patient_id` (`patient_id`),
  ADD KEY `admission_date` (`created_date`);

--
-- Indexes for table `prescriptions`
--
ALTER TABLE `prescriptions`
  ADD PRIMARY KEY (`id`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `doctor_list`
--
ALTER TABLE `doctor_list`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `medical_imaging`
--
ALTER TABLE `medical_imaging`
  MODIFY `image_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `prescriptions`
--
ALTER TABLE `prescriptions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `prod_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor_list` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_id_fk` FOREIGN KEY (`patient_id`) REFERENCES `patient_list` (`patient_id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
