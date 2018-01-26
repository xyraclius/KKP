-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2018 at 07:52 AM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kkp`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `Username` varchar(14) NOT NULL,
  `Password` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`Username`, `Password`) VALUES
('nabil', 'fq');

-- --------------------------------------------------------

--
-- Table structure for table `ksp`
--

CREATE TABLE `ksp` (
  `No` int(11) NOT NULL,
  `ID` varchar(5) NOT NULL,
  `KarTas` varchar(33) NOT NULL,
  `Na_Kap` varchar(30) NOT NULL,
  `Alamat` varchar(90) NOT NULL,
  `JK` varchar(6) DEFAULT NULL,
  `Pekerjaan` varchar(16) DEFAULT NULL,
  `Tgl_Reg` date DEFAULT NULL,
  `Tgl_Lahir` date DEFAULT NULL,
  `Keterangan` varchar(40) DEFAULT NULL,
  `Simpanan` int(10) DEFAULT NULL,
  `Angsuran` varchar(2) DEFAULT NULL,
  `Ttl_Pnj` int(9) DEFAULT NULL,
  `ByrSetBln` int(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ksp`
--

INSERT INTO `ksp` (`No`, `ID`, `KarTas`, `Na_Kap`, `Alamat`, `JK`, `Pekerjaan`, `Tgl_Reg`, `Tgl_Lahir`, `Keterangan`, `Simpanan`, `Angsuran`, `Ttl_Pnj`, `ByrSetBln`) VALUES
(1, 'P6460', 'KARTU KELUARGA | 9994567890444512', 'Nabil Fawwaz Elqayyim', 'Jl. H. Ijur Gg. H. Jamhur Rt20/01  No. 114 Cimanggis, Depok', 'Pria', 'Mahasiswa', '2016-05-24', '1995-10-31', 'Nabung buat beli hp', 0, '12', 2625000, 218750),
(3, 'S252a', 'KARTU KELUARGA | 1234567890234563', 'Ahmad Rizal', 'Jl. Mendik No. 92 Jakarta Selatan', 'Pria', 'Guru SD', '2016-05-24', '1988-03-16', 'Nabung buat anakku', 1315000, '0', 0, 0),
(4, 'P9eb2', 'KARTU KELUARGA | 1234567890123456', 'Rahmat Ardiansyah', 'Jl. Lebak Bulus No. 11 Jakarta Selatan', 'Pria', 'Satpam', '2016-05-24', '1987-09-05', 'Buat bayar rumah sakit', 0, '23', 2000000, 87500),
(6, 'S2ff1', 'PASSPORT | 91748284017463', 'Sabrina Tsaqila', 'Jl. Duren Sawit No. 32 Jakarta Selatan', 'Wanita', 'Mahasiswa', '2016-05-24', '1994-05-07', 'Nabung aja', 2275000, '0', 0, 0),
(35, 'Sf727', 'KTP | 3174043110930003', 'Ahmad Jaelani Nasution', 'Jl. Mekar Jaya No. 14 Jakarta Selatan', 'Pria', 'Juragan Ayam', '2018-01-19', '1975-06-11', 'Buat anakku nanti kalau sudah lahir', 6990000, '0', 0, 0),
(36, 'Pb9ec', 'SIM | 123456789012', 'Liana Sari', 'Jl. Permai Raya No. 94', 'Wanita', 'Mahasiswi', '2018-01-20', '1996-07-10', 'Bayar Semester Kuliah', 0, '12', 2625000, 218750),
(40, 'S5e68', 'SIM | 129818419993', 'Febri Ramdani', 'Jl. Fatmawati No. 61  Jakarta Selatan', 'Pria', 'PNS', '2018-01-20', '2018-01-13', 'Nabung aja', 4490000, '0', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `kspt`
--

CREATE TABLE `kspt` (
  `No` int(11) NOT NULL,
  `Tgl_Laporan` date NOT NULL,
  `Jml_Pnj_SW` int(15) NOT NULL,
  `Jml_Smp_SW` int(15) NOT NULL,
  `Jml_Pnj_BI` int(15) NOT NULL,
  `Jml_Smp_Bi` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kspt`
--

INSERT INTO `kspt` (`No`, `Tgl_Laporan`, `Jml_Pnj_SW`, `Jml_Smp_SW`, `Jml_Pnj_BI`, `Jml_Smp_Bi`) VALUES
(1, '2018-01-19', 38689234, 12100000, 7775000, 5675000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `ksp`
--
ALTER TABLE `ksp`
  ADD PRIMARY KEY (`No`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `kspt`
--
ALTER TABLE `kspt`
  ADD PRIMARY KEY (`No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ksp`
--
ALTER TABLE `ksp`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `kspt`
--
ALTER TABLE `kspt`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
