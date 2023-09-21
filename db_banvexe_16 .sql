-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_banvexe
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `benxe`
--

DROP TABLE IF EXISTS `benxe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `benxe` (
  `ID_Ben` int NOT NULL AUTO_INCREMENT,
  `TenBen` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`ID_Ben`),
  UNIQUE KEY `UQ__BenXe__31C2674FF4B884CC` (`TenBen`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benxe`
--

LOCK TABLES `benxe` WRITE;
/*!40000 ALTER TABLE `benxe` DISABLE KEYS */;
INSERT INTO `benxe` VALUES (1,'Bình Thuận'),(6,'Đà lạt'),(4,'Hà Nội'),(3,'Hồ Chí Minh'),(2,'Kon Tum'),(5,'Ninh Bình');
/*!40000 ALTER TABLE `benxe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuyenxe`
--

DROP TABLE IF EXISTS `chuyenxe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chuyenxe` (
  `ID_ChuyenXe` int NOT NULL AUTO_INCREMENT,
  `tenCX` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ID_benDen` int NOT NULL,
  `ID_benDi` int NOT NULL,
  `giaChuyen` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_ChuyenXe`),
  UNIQUE KEY `UQ__ChuyenXe__FB758DB925B98273` (`tenCX`),
  KEY `FK_ChuyenxeBenDen_Benxe_idx` (`ID_benDen`),
  KEY `FK_ChuyenxeBenDi_Benxe_idx` (`ID_benDi`),
  CONSTRAINT `FK_ChuyenxeBenDen_Benxe` FOREIGN KEY (`ID_benDen`) REFERENCES `benxe` (`ID_Ben`),
  CONSTRAINT `FK_ChuyenxeBenDi_Benxe` FOREIGN KEY (`ID_benDi`) REFERENCES `benxe` (`ID_Ben`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuyenxe`
--

LOCK TABLES `chuyenxe` WRITE;
/*!40000 ALTER TABLE `chuyenxe` DISABLE KEYS */;
INSERT INTO `chuyenxe` VALUES (1,'Bình Thuận - Hồ Chí Minh',3,1,'560000'),(2,'Hồ Chí Minh - Đà lạt',6,3,'60000.0'),(3,'Vũng tàu - Đà lạt',6,5,'750000.0'),(6,'Hà Nội - Bình Thuận',1,4,'45222.0'),(8,'Hà Nội - Hồ Chí Minh',3,4,'45222.0'),(15,'Bình Thuận - Đà lạt',6,1,'123.0');
/*!40000 ALTER TABLE `chuyenxe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuyenxe_xe`
--

DROP TABLE IF EXISTS `chuyenxe_xe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chuyenxe_xe` (
  `ID_ChuyenXe` int NOT NULL,
  `ID_Xe` int NOT NULL,
  `gioKhoiHanh` datetime NOT NULL,
  PRIMARY KEY (`ID_ChuyenXe`,`ID_Xe`),
  KEY `FK_ChuyenXe_Xe_Xe_idx` (`ID_Xe`),
  CONSTRAINT `FK_ChuyenXe_Xe_ChuyenXe` FOREIGN KEY (`ID_ChuyenXe`) REFERENCES `chuyenxe` (`ID_ChuyenXe`),
  CONSTRAINT `FK_ChuyenXe_Xe_Xe` FOREIGN KEY (`ID_Xe`) REFERENCES `xe` (`ID_Xe`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuyenxe_xe`
--

LOCK TABLES `chuyenxe_xe` WRITE;
/*!40000 ALTER TABLE `chuyenxe_xe` DISABLE KEYS */;
INSERT INTO `chuyenxe_xe` VALUES (1,1,'2023-04-19 19:30:00'),(2,2,'2023-04-25 20:30:00'),(8,1,'2023-04-11 23:00:00');
/*!40000 ALTER TABLE `chuyenxe_xe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ghe`
--

DROP TABLE IF EXISTS `ghe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ghe` (
  `ID_Ghe` int NOT NULL AUTO_INCREMENT,
  `TinhTrangGhe` tinyint(1) NOT NULL,
  `ID_Xe` int NOT NULL,
  `ThuTuGhe` int NOT NULL,
  PRIMARY KEY (`ID_Ghe`),
  KEY `FK_Ghe_Xe_idx` (`ID_Xe`),
  CONSTRAINT `FK_Ghe_Xe` FOREIGN KEY (`ID_Xe`) REFERENCES `xe` (`ID_Xe`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ghe`
--

LOCK TABLES `ghe` WRITE;
/*!40000 ALTER TABLE `ghe` DISABLE KEYS */;
INSERT INTO `ghe` VALUES (1,0,1,1),(2,0,1,2),(3,0,1,3),(4,0,1,4),(5,0,1,5),(6,0,2,1),(7,0,2,2),(8,0,2,3),(9,0,2,4),(10,0,2,5);
/*!40000 ALTER TABLE `ghe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id_role` int NOT NULL,
  `name_role` varchar(10) NOT NULL,
  PRIMARY KEY (`id_role`),
  UNIQUE KEY `name_role_UNIQUE` (`name_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(3,'customer'),(2,'staff');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_fullname` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `user_id_card` varchar(12) NOT NULL,
  `user_phone_number` varchar(10) NOT NULL,
  `user_date_of_birth` date DEFAULT NULL,
  `user_date_join` date NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(45) NOT NULL,
  `user_address` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `role_id` int NOT NULL DEFAULT '3',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_card_UNIQUE` (`user_id_card`),
  UNIQUE KEY `user_phone_number_UNIQUE` (`user_phone_number`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `FK_User_Role_idx` (`role_id`),
  CONSTRAINT `FK_User_Role` FOREIGN KEY (`role_id`) REFERENCES `role` (`id_role`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Cáp Tấn Đạt','0123456','0961414817','2002-01-14','2023-03-21','username1','123456','125 Bình Thạnh',3),(2,'Trần Đatk','1202345','0123456789','2002-12-03','2023-03-21','username2','123456','84 Nguyễn Kiệm',1),(3,'Duy nến','5555555','0694135478','2002-12-03','2023-03-21','username3','123456','2 Bình Chánh',2),(4,'Đạt','12313123','1241242141','2002-12-03','2023-03-21','username4','123456','2 Bình Chánh',3),(20,'System','5220245','012345678','1990-04-17','2023-04-08','username6','123456','11 Phan Đình Phùng',2),(21,'Bảo đb','8461331','097841257','2002-07-15','2023-04-08','username7','123456','21 Tân Phú',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vexe`
--

DROP TABLE IF EXISTS `vexe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vexe` (
  `ID_VeXe` int NOT NULL AUTO_INCREMENT,
  `ID_Ghe` int NOT NULL,
  `ID_KhachHang` int NOT NULL,
  `ID_ChuyenXe` int NOT NULL,
  `ID_NhanVien` int NOT NULL,
  `NgayIn` datetime DEFAULT NULL,
  `isConfirm` tinyint DEFAULT NULL,
  PRIMARY KEY (`ID_VeXe`),
  KEY `FK_VeXe_User_idx` (`ID_NhanVien`),
  KEY `FK_VeXe_Usercus_idx` (`ID_KhachHang`),
  KEY `FK_VeXe_Chuyenxe_idx` (`ID_ChuyenXe`),
  KEY `FK_VeXe_Ghe_idx` (`ID_Ghe`),
  CONSTRAINT `FK_VeXe_Chuyenxe` FOREIGN KEY (`ID_ChuyenXe`) REFERENCES `chuyenxe` (`ID_ChuyenXe`),
  CONSTRAINT `FK_VeXe_Ghe` FOREIGN KEY (`ID_Ghe`) REFERENCES `ghe` (`ID_Ghe`),
  CONSTRAINT `FK_VeXe_User` FOREIGN KEY (`ID_NhanVien`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FK_VeXe_Usercus` FOREIGN KEY (`ID_KhachHang`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vexe`
--

LOCK TABLES `vexe` WRITE;
/*!40000 ALTER TABLE `vexe` DISABLE KEYS */;
/*!40000 ALTER TABLE `vexe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xe`
--

DROP TABLE IF EXISTS `xe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xe` (
  `ID_Xe` int NOT NULL AUTO_INCREMENT,
  `TenXe` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `BienSo` char(11) NOT NULL,
  PRIMARY KEY (`ID_Xe`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xe`
--

LOCK TABLES `xe` WRITE;
/*!40000 ALTER TABLE `xe` DISABLE KEYS */;
INSERT INTO `xe` VALUES (1,'Đông Hưng','51B-275-58'),(2,'Minh Nghĩa','86B-012-64');
/*!40000 ALTER TABLE `xe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-12 10:32:42
