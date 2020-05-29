-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.3.14-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- springbbs 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `springbbs` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `springbbs`;

-- 테이블 springbbs.tbl_board 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbl_board` (
  `bno` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` varchar(20000) NOT NULL,
  `writer` varchar(50) NOT NULL,
  `regdate` datetime DEFAULT current_timestamp(),
  `updatedate` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`bno`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- 테이블 데이터 springbbs.tbl_board:~39 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tbl_board` DISABLE KEYS */;
INSERT INTO `tbl_board` (`bno`, `title`, `content`, `writer`, `regdate`, `updatedate`) VALUES
	(3, '새로운 글 제목asdfghsadfgh', '새로운 내용 내용asdfasdf', '뉴비들', '2020-04-06 11:18:14', '2020-05-08 11:58:38'),
	(5, '', '테스트 새글 내뇽', '글쓴이00', '2020-04-10 11:46:00', '2020-04-17 11:54:05'),
	(11, 'ㅁㅁasdfdsfasdfasdf', 'ㅁㄹ', 'ㅁㄴㅇㄹ', '2020-04-13 12:11:14', '2020-05-08 11:55:48'),
	(12, '124356', '123456uy', 'q', '2020-04-13 12:17:16', '2020-05-08 11:56:04'),
	(13, '213r4th', 'w2e3r4567', '43t5y67io', '2020-04-13 12:20:31', '2020-05-08 11:55:55'),
	(14, '13245', '312456', '13245', '2020-04-13 12:21:41', '2020-04-17 12:26:16'),
	(15, 'ewqrftghnm', 'qwdafsghn', 'sdafgnm', '2020-04-13 12:22:20', '2020-04-17 12:04:23'),
	(16, 'adsfsadf', 'asdfdsaf', 'asdfdasf', '2020-04-13 12:23:16', '2020-04-13 12:23:16'),
	(17, '새로운 글을 등록해보자', '등록해보았다', '등록해보았따', '2020-04-13 12:29:03', '2020-04-27 11:08:34'),
	(18, 'dasfg', 'aDSFG', 'ASDFG', '2020-04-17 11:29:14', '2020-04-27 11:08:42'),
	(19, 'sdsfghj', 'AZxsDFG', 'DSFGHJ', '2020-04-27 11:10:30', '2020-04-27 11:10:30'),
	(20, 'ZXCVB', 'SCDVF', 'ASDCFVGBNM', '2020-04-27 11:10:35', '2020-04-27 11:10:35'),
	(21, 'ASDFGH', 'ZXCVBN', 'WQERTYU', '2020-04-27 11:10:40', '2020-04-27 11:10:40'),
	(22, 'SDFGH', 'ZXCVBN', 'ASDFGNH', '2020-04-27 11:10:47', '2020-04-27 11:10:47'),
	(23, 'sdfghj', 'zxcvbnm', 'zxcvbn', '2020-04-27 11:10:51', '2020-04-27 12:07:00'),
	(24, 'eetttetwt', 'ee', 'ee', '2020-04-27 12:22:51', '2020-05-11 12:19:13'),
	(25, 'ee', 'ee', 'ee', '2020-04-27 12:22:54', '2020-04-27 12:22:54'),
	(26, 'ee', 'ee', 'ee', '2020-04-27 12:22:55', '2020-04-27 12:22:55'),
	(27, 'ee', 'ee', 'ee', '2020-04-27 12:22:55', '2020-04-27 12:22:55'),
	(28, 'ee', 'ee', 'ee', '2020-04-27 12:22:55', '2020-04-27 12:22:55'),
	(29, 'ee', 'ee', 'ee', '2020-04-27 12:22:55', '2020-04-27 12:22:55'),
	(30, 'ee', 'ee', 'ee', '2020-04-27 12:22:55', '2020-04-27 12:22:55'),
	(32, 'ee', 'ee', 'ee', '2020-04-27 12:22:56', '2020-04-27 12:22:56'),
	(33, 'ee', 'ee', 'ee', '2020-04-27 12:22:56', '2020-04-27 12:22:56'),
	(34, 'ee', 'ee', 'ee', '2020-04-27 12:22:56', '2020-04-27 12:22:56'),
	(35, 'ee', 'ee', 'ee', '2020-04-27 12:22:56', '2020-04-27 12:22:56'),
	(36, 'ee', 'ee', 'ee', '2020-04-27 12:22:56', '2020-04-27 12:22:56'),
	(37, 'ee', 'ee', 'ee', '2020-04-27 12:22:57', '2020-04-27 12:22:57'),
	(38, 'ee', 'ee', 'ee', '2020-04-27 12:22:57', '2020-04-27 12:22:57'),
	(39, 'ee', 'ee', 'ee', '2020-05-11 11:20:41', '2020-05-11 11:20:41'),
	(40, 'ee', 'ee', 'ee', '2020-05-11 11:20:44', '2020-05-11 11:20:44'),
	(41, 'ee', 'ee', 'ee', '2020-05-11 11:20:44', '2020-05-11 11:20:44'),
	(42, 'ee', 'ee', 'ee', '2020-05-11 11:20:45', '2020-05-11 11:20:45'),
	(43, 'ee', 'ee', 'ee', '2020-05-11 11:20:46', '2020-05-11 11:20:46'),
	(44, 'ee', 'ee', 'ee', '2020-05-11 11:20:47', '2020-05-11 11:20:47'),
	(45, 'ee', 'ee', 'ee', '2020-05-11 11:20:47', '2020-05-11 11:20:47'),
	(46, 'ee', 'ee', 'ee', '2020-05-11 11:20:48', '2020-05-11 11:20:48'),
	(47, 'ee', 'ee', 'ee', '2020-05-11 11:20:48', '2020-05-11 11:20:48'),
	(48, 'ee', 'ee', 'ee', '2020-05-11 11:20:49', '2020-05-11 11:20:49');
/*!40000 ALTER TABLE `tbl_board` ENABLE KEYS */;

-- 테이블 springbbs.tbl_reply 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbl_reply` (
  `rno` int(11) NOT NULL AUTO_INCREMENT,
  `bno` int(11) DEFAULT NULL,
  `reply` varchar(1000) NOT NULL,
  `replyer` varchar(50) NOT NULL,
  `replyDate` datetime DEFAULT current_timestamp(),
  `updateDate` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`rno`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- 테이블 데이터 springbbs.tbl_reply:~11 rows (대략적) 내보내기
/*!40000 ALTER TABLE `tbl_reply` DISABLE KEYS */;
INSERT INTO `tbl_reply` (`rno`, `bno`, `reply`, `replyer`, `replyDate`, `updateDate`) VALUES
	(2, 3, '댓글 테스트2', 'replyer2', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(3, 3, '댓글 테스트3', 'replyer3', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(4, 3, '댓글 테스트4', 'replyer4', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(5, 3, '댓글 테스트5', 'replyer5', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(6, 3, '댓글 테스트6', 'replyer6', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(7, 3, '댓글 테스트7', 'replyer7', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(9, 3, '댓글 테스트9', 'replyer9', '2020-05-18 12:12:58', '2020-05-18 12:12:58'),
	(10, 3, '수정된 내용입니다.', 'replyer10', '2020-05-18 12:12:58', '2020-05-18 12:25:02'),
	(11, 12, '수정합니다.', 'minseok', '2020-05-25 11:44:06', '2020-05-25 11:59:31'),
	(12, 0, 'ajax test', '민석', '2020-05-29 11:40:50', '2020-05-29 11:40:50');
/*!40000 ALTER TABLE `tbl_reply` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
