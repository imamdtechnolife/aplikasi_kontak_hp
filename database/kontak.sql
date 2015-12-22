-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versi server:                 5.6.21-log - MySQL Community Server (GPL)
-- OS Server:                    Win32
-- HeidiSQL Versi:               9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for kontak
CREATE DATABASE IF NOT EXISTS `kontak` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `kontak`;


-- Dumping structure for table kontak.admin
IF NOT EXISTS ;

-- Dumping data for table kontak.admin: ~0 rows (approximately)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;


-- Dumping database structure for kontak
CREATE DATABASE IF NOT EXISTS `kontak` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `kontak`;


-- Dumping structure for table kontak.kontak_samsung
CREATE TABLE IF NOT EXISTS `kontak_samsung` (
  `no_seri` int(100) NOT NULL AUTO_INCREMENT,
  `nama_kontak` varchar(100) DEFAULT NULL,
  `no_hp` varchar(20) DEFAULT NULL,
  `keterangan` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`no_seri`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8;

-- Dumping data for table kontak.kontak_samsung: ~147 rows (approximately)
/*!40000 ALTER TABLE `kontak_samsung` DISABLE KEYS */;
REPLACE INTO `kontak_samsung` (`no_seri`, `nama_kontak`, `no_hp`, `keterangan`) VALUES
	(4, 'Imam Afriyadi', '081909106444', 'Saya Sendiri'),
	(5, 'Wawan Angga Arya Wangsa', '081917917563', 'Brother'),
	(6, 'Wawan Angga Arya Wangsa', '082341960082', 'Brother'),
	(7, 'K Ria', '082341960083', 'Kk Ipar'),
	(8, 'Zulpan nenek', '081907456411', 'Alumni Summit'),
	(10, 'Zaki', '081803179794', 'D3MI (Adik Kelas)'),
	(11, 'Yuyun', '082359225880', 'Teman Winda'),
	(12, 'Yadi', '087864226111', 'Alumni Summit'),
	(13, 'Wita', '081916990320', 'Teman Selvi'),
	(14, 'Winda', '087864371193', 'Sister (No. xl)'),
	(16, 'Wildan', '081907057498', 'Alumni BEM STMIK'),
	(17, 'Wawan', '087863991617', 'Teman SMP'),
	(18, 'Ust. Salman', '087866860760', 'Musrif HTI'),
	(19, 'Ust. Salman', '087866702209', 'Musrif HTI'),
	(20, 'Huda', '087765321645', 'Teman D3MI'),
	(21, 'Tohri', '087864111262', 'Teman Halaqoh KAMIL /  Alumni BEM STMIK'),
	(22, 'Tia', '081998956123', 'Adik di Sumbawa'),
	(23, 'Tio', '085337920451', 'Teman STMIK'),
	(24, 'Titin', '087863692078', 'Teman Selvi'),
	(26, 'Taufik', '081918283344', 'Teman Kampus Selvi'),
	(27, 'Taufik', '085903168931', 'Teman Kampus Selvi'),
	(28, 'Tanwir', '087765377738', 'Teman Halaqoh KAMIL'),
	(29, 'Sumber Sentosa', '081917218666', 'Bengkel Resmi Honda'),
	(30, 'Suhufi', '081907100715', 'Syabab HTI'),
	(31, 'Sudarmono', '087864977620', 'Teman Halaqoh HTI / Syabab HTI'),
	(32, 'Subhan', '081917957327', 'Teman Kos Punia'),
	(33, 'Satriawan', '081906992616', 'Alumni BEM STMIK'),
	(34, 'Sapri', '081997799821', 'Teman STMIK'),
	(35, 'Santun Fuady', '081907310004', 'Teman Halaqoh KAMIL'),
	(36, 'Said', '081918193680', 'Alumni BEM STMIK'),
	(37, 'Rodi', '081805271459', 'Teman STMIK / Adik Tingkat'),
	(38, 'Robi', '087863841444', 'Alumni SMANIKA'),
	(39, 'Robi STMIK', '082340077106', 'Teman STMIK / Adik Tingkat'),
	(40, 'Robi', '081918461188', 'Teman STMIK / Adik Tingkat'),
	(41, 'Rita Zaza', '087864616428', 'Teman Kampus Selvi'),
	(42, 'Rizky', '087863991096', 'Teman SMA / Alumni SMANIKA'),
	(43, 'Rindu', '082339222335', 'Teman Kampus / Alumni STMIK'),
	(44, 'Ratna', '081907088907', 'Teman Kampus Selvi'),
	(45, 'Rahmat', '08988386030', 'Syabab HTI'),
	(46, 'Rahman Hakim', '081997743459', 'Teman STMIK / Adik Tingkat'),
	(47, 'Pian', '083129591578', 'Teman SMA / Alumni SMANIKA'),
	(48, 'Pegawai Perpustakaan STMIK BG', '08873982820', 'Kampus'),
	(49, 'Ust. Amin', '081915912211', 'Hizbiyin'),
	(50, 'Pak Yar (Ea\')', '087863810770', 'Paman'),
	(51, 'Pak Salim', '0818363162', 'Ketua LPLK'),
	(52, 'Pak Sahar', '087864241526', 'Pemilik Kamar'),
	(53, 'Pak Popo', '081933138763', 'Tetangga Rumah Labuapi'),
	(54, 'Pak Adi', '081802028000', 'Suami Ka\' Pit'),
	(55, 'Ougi', '082237996767', 'Teman SMA / Alumni SMANIKA'),
	(56, 'Ori Ketua Suku', '087863588931', 'Teman D3MI'),
	(57, 'Nurul Aini (Uyung)', '081909030195', 'Teman SMA Selvi'),
	(58, 'Nura', '081917507534', 'Teman SMA Selvi'),
	(59, 'Mbak Ana', '082247116055', 'Teman D3MI'),
	(60, 'Murobby (Rahman Ikhwan)', '081907664126', 'Guru Halaqoh KAMIL'),
	(61, 'Mulyadi', '087864025502', 'Alumni SUMMIT'),
	(62, 'Mini', '087863728805', 'Teman Sumbawa'),
	(63, 'Mita', '085935667565', 'Sepupu'),
	(64, 'Minhaj', '087865089112', 'Alumni SUMMIT'),
	(65, 'Meiradi', '087865171952', 'Teman STMIK / Adik Tingkat'),
	(66, 'Mbak Ana', '085337771486', 'Teman D3MI (As)'),
	(67, 'Mbak Pi', '087863662908', 'Tetangga di Sumbawa'),
	(68, 'Mas Uki', '081907674432', 'Karyawan STMIK bag. Kemahasiswaan'),
	(69, 'Saktiawan', '085205324339', 'Teman STMIK / Teman Begadang'),
	(70, 'Mas Jaya', '087865460343', 'Alumni SUMMIT'),
	(71, 'Mas Helmi', '081805716401', 'Teman Kos Punia'),
	(72, 'Mas Helmi', '085239225517', 'Teman Kos Punia (As)'),
	(73, 'Mansur', '087765954091', 'Teman D3MI'),
	(74, 'Meiradi', '082339432743', 'Teman STMIK / Adik Tingkat (As)'),
	(75, 'Limarsi', '087865481727', 'Alumni BEM STMIK / Adik Tingkat'),
	(76, 'Lian', '081918140383', 'Alumni SUMMIT'),
	(77, 'Khairul Imam', '087864127033', 'Teman STMIK / Adik Tingkat'),
	(78, 'Karmin', '087865878724', 'Alumni BEM STMIK'),
	(79, 'KAMIL', '081907164077', 'LDK STMIK BG'),
	(80, 'Yadi', '081917217917', 'Alumni SUMMIT'),
	(81, 'Mini', '081917652497', 'Teman Sumbawa'),
	(82, 'Lidya', '083129672897', 'Sepupu'),
	(83, 'Lidya', '081915920373', 'Sepupu'),
	(84, 'Yazman', '081936736848', 'Alumni SUMMIT'),
	(85, 'Yazman', '085337795345', 'Alumni SUMMIT (As)'),
	(86, 'Kak Pit', '087763200006', 'Sister'),
	(87, 'Juan', '087866796215', 'Syabab HTI'),
	(88, 'Ita Mooi', '087765518114', 'Alumni BEM STMIK / Adik Tingkat'),
	(89, 'Iskandar', '087865596292', 'Teman STMIK / Mahasiswa Dompu'),
	(90, 'Iga', '081916986676', 'Adik di Sumbawa'),
	(91, 'Iip', '081918272715', 'Sepupu'),
	(92, 'Ibu Q', '081935979652', 'Ibu Q'),
	(93, 'Herlina', '081907586619', 'Alumni BEM STMIK / Adik Tingkat'),
	(94, 'Ginanjar', '085737885578', 'Teman STMIK / Adik Tingkat'),
	(95, 'Firman', '087863675549', 'Teman SMA / Alumni SMANIKA'),
	(96, 'Fahul', '087864616169', 'Teman D3MI / Alumni MAC'),
	(97, 'Fajri', '081906953759', 'Teman di Sumbawa'),
	(98, 'Faisal', '087864242777', 'Teman D3MI'),
	(99, 'Fahmi', '087863784246', 'Jamaah / Alumni SMANIKA'),
	(100, 'Epol', '081907563658', 'Teman D3MI'),
	(101, 'Endra', '087765532497', 'Teman Halaqoh KAMIL'),
	(102, 'Edwin', '085205645793', 'Teman D3MI'),
	(103, 'Dodik', '085205001108', 'Alumni SUMMIT'),
	(104, 'Dodik', '081907456931', 'Alumni SUMMIT'),
	(105, 'Dina', '081907391040', 'Teman D3MI'),
	(106, 'Dhedet', '081935938014', 'Alumni BEM STMIK'),
	(107, 'Carlos', '081917912065', 'Sepupu'),
	(108, 'Budi', '087865326863', 'Teman Selvi'),
	(109, 'Budi', '087864432700', 'Teman Selvi'),
	(110, 'Bude Lombok', '081997735878', 'Keluarga Ibu Q'),
	(111, 'Bude Lape', '081935928797', 'Keluarga Ibu Q'),
	(112, 'Bpk Q', '087863943630', 'Bpk Q'),
	(113, 'Bude Nurma', '087865064332', 'Keluarga Ibu Q'),
	(114, 'Bung Hendra', '087765481041', 'Alumni Halaqoh KAMIL'),
	(115, 'Azwari', '081915972970', 'Teman UNRAM'),
	(116, 'Ayat', '085238712447', 'Alumni BEM STMIK'),
	(117, 'Kak Anto', '087863951557', 'Brother'),
	(118, 'Ali', '087864125235', 'Teman D3MI'),
	(119, 'Akh Munir', '081907662008', 'Syabab HTI'),
	(120, 'Akh Irham', '087864606007', 'Teman Halaqoh KAMIL / Alumni BEM STMIK'),
	(121, 'Imam Ma\'ruf', '087865754696', 'Teman STMIK / Adik Tingkat'),
	(122, 'Fahmi', '087765229465', 'Jamaah / Alumni SMANIKA'),
	(123, 'Doni', '087864298111', 'Syabab HTI'),
	(124, 'Azmi', '081918405331', 'Teman Halaqoh KAMIL / Alumni BEM STMIK'),
	(125, 'Angger', '081939739030', 'Jamaah / Mahasiswa FKIP UNRAM'),
	(126, 'Andre', '087765975181', 'Teman Halaqoh HTI / Mahasiswa Peternakan UNRAM'),
	(127, 'Ajlan', '085237420857', 'Teman STMIK / Adik Tingkat'),
	(128, 'Ahsani', '083129435148', 'Syabab HTI'),
	(129, 'Santun Fuady', '087864230040', 'Teman Halaqoh KAMIL'),
	(130, 'Afardin', '085253717102', 'Teman D3MI'),
	(131, 'Adik Q', '081916912392', 'Adik Q'),
	(132, 'Adi', '085205266811', 'Teman D3MI'),
	(133, 'Kalkautsar', '087766696660', 'Teman STMIK / Adik Tingkat'),
	(134, 'Andri', '082341049808', 'Teman Halaqoh HTI / Mahasiswa Peternakan UnRam'),
	(135, 'Robi', '92384092809', 'teman'),
	(136, 'Bpk Ajan', '08197980332', 'Client'),
	(137, 'Rahmat', '087865120029', 'Syabab HTI / Mahasiswa Bahasa Arab IAIN Mataram'),
	(138, 'Iwan', '085238488443', 'Teman STMIK / Asdos Pengantar Jaringan'),
	(139, 'Aying', '081997770796', 'Teman STMIK / Adik tingkat'),
	(140, 'Pak Dil', '081915909467', 'Hizbiyin Taliwang'),
	(141, 'Arya', '087864228990', 'Adikku'),
	(142, 'Ramli Pickup', '081917132523', 'Penyedia Jasa Angkutan Barang'),
	(143, 'Sudarmono', '082340761409', 'Teman Halaqoh / Mahasiswa Pertanian UNRAM'),
	(144, 'Fikar anak p\'Ono', '081916927025', 'Keluarga Bude Lombok'),
	(145, 'Endra Felani', '081906917987', 'Teman Halaqoh / Teman STMIK BG'),
	(146, 'Mentari', '081933131545', 'Teman Kelas D3MI'),
	(147, 'Sriani', '2837598275289', 'Ibu'),
	(148, 'Saktiawan xl', '087864482239', 'Ketua OHC / Syabab HTI'),
	(149, 'Yadi 2', '083129013615', 'Alumni Summit / Mahasiswa Hukum UnRam'),
	(150, 'Nardi Telkom', '085219204410', 'Karyawan Telkom'),
	(151, 'ibu ajan', '081339878169', 'klien '),
	(152, 'siti zar\'ah', '083129963878', 'teman d3 mi'),
	(153, 'heni ', '081915888847', 'teman mama'),
	(154, 'Akhi Salafi', '085934568222', 'Teman masa kecil di kerato '),
	(155, 'Royani', '082340855699', 'Teman Selvi / Mahasiswa D3 Akuntansi UNRAM'),
	(156, 'Teman Firman (edit)', '087864463009', 'Bosnya Firman'),
	(157, 'Zaza', '087763220105', 'Teman Selvi / Mahasiswa D3 Akuntansi UNRAM'),
	(158, 'Aang', '08190953566', 'Sahabat Brang Biji');
/*!40000 ALTER TABLE `kontak_samsung` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
