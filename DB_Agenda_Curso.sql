CREATE DATABASE  IF NOT EXISTS `db_agenda_curso` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `db_agenda_curso`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_agenda_curso
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `cadastro_equipe_treinamento`
--

DROP TABLE IF EXISTS `cadastro_equipe_treinamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadastro_equipe_treinamento` (
  `id_cadastro` int(11) NOT NULL AUTO_INCREMENT,
  `id_equipe` int(11) DEFAULT NULL,
  `id_treinamento` int(11) DEFAULT NULL,
  `id_instrutor` int(11) DEFAULT NULL,
  `prev_comeco` date DEFAULT NULL,
  `prev_fim` date DEFAULT NULL,
  `formato` enum('Presencial','Online','Hibrido') DEFAULT NULL,
  PRIMARY KEY (`id_cadastro`),
  KEY `FK_EquipeTreinoCad` (`id_equipe`),
  KEY `FK_TreinoEquipeCad` (`id_treinamento`),
  KEY `FK_InstrutorTreinoEqpCad` (`id_instrutor`),
  CONSTRAINT `FK_EquipeTreinoCad` FOREIGN KEY (`id_equipe`) REFERENCES `equipe` (`id_equipe`),
  CONSTRAINT `FK_InstrutorTreinoEqpCad` FOREIGN KEY (`id_instrutor`) REFERENCES `funcionario` (`id_funcionario`),
  CONSTRAINT `FK_TreinoEquipeCad` FOREIGN KEY (`id_treinamento`) REFERENCES `treinamento` (`id_treinamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadastro_equipe_treinamento`
--

LOCK TABLES `cadastro_equipe_treinamento` WRITE;
/*!40000 ALTER TABLE `cadastro_equipe_treinamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_equipe_treinamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cadastro_funcionario_equipe`
--

DROP TABLE IF EXISTS `cadastro_funcionario_equipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadastro_funcionario_equipe` (
  `id_cadastro` int(11) NOT NULL AUTO_INCREMENT,
  `id_funcionario` int(11) DEFAULT NULL,
  `id_equipe` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cadastro`),
  KEY `FK_FuncionarioCad` (`id_funcionario`),
  KEY `FK_EquipeCad` (`id_equipe`),
  CONSTRAINT `FK_EquipeCad` FOREIGN KEY (`id_equipe`) REFERENCES `equipe` (`id_equipe`),
  CONSTRAINT `FK_FuncionarioCad` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadastro_funcionario_equipe`
--

LOCK TABLES `cadastro_funcionario_equipe` WRITE;
/*!40000 ALTER TABLE `cadastro_funcionario_equipe` DISABLE KEYS */;
INSERT INTO `cadastro_funcionario_equipe` VALUES (5,8,2);
/*!40000 ALTER TABLE `cadastro_funcionario_equipe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipe`
--

DROP TABLE IF EXISTS `equipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipe` (
  `id_equipe` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(15) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `turno` enum('matutino','vespertino','noturno') DEFAULT NULL,
  PRIMARY KEY (`id_equipe`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipe`
--

LOCK TABLES `equipe` WRITE;
/*!40000 ALTER TABLE `equipe` DISABLE KEYS */;
INSERT INTO `equipe` VALUES (2,'Equipe 1','Desc	','noturno'),(3,'Equipe 9','Descrição','noturno');
/*!40000 ALTER TABLE `equipe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(14) DEFAULT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `sobrenome` varchar(30) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `email` varchar(320) DEFAULT NULL,
  `turno` enum('matutino','vespertino','noturno') DEFAULT NULL,
  `data_adimissao` date DEFAULT current_timestamp(),
  `cargo` enum('supervisor','instrutor','operador') DEFAULT NULL,
  `id_setor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `email` (`email`),
  KEY `FK_SetorFuncionario` (`id_setor`),
  CONSTRAINT `FK_SetorFuncionario` FOREIGN KEY (`id_setor`) REFERENCES `setor` (`id_setor`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (8,'123.456.789-98','nome','sobrenome','(  )      -    ','email','vespertino','2024-11-09','instrutor',1),(9,'153.454.684-82','Clevo','naro','(54) 64894-5213','clevin@gmail.com','vespertino','2024-11-12','operador',1),(10,'898.795.487-87','Funcionario','Funcionario','(21) 65184-6510','fucnioanrio@gmail.com','matutino','2024-11-12','operador',1);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setor`
--

DROP TABLE IF EXISTS `setor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setor` (
  `id_setor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) DEFAULT NULL,
  `sigla` char(3) DEFAULT NULL,
  PRIMARY KEY (`id_setor`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setor`
--

LOCK TABLES `setor` WRITE;
/*!40000 ALTER TABLE `setor` DISABLE KEYS */;
INSERT INTO `setor` VALUES (1,'ADIMINISTRAÇÂO','ADM');
/*!40000 ALTER TABLE `setor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treinamento`
--

DROP TABLE IF EXISTS `treinamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `treinamento` (
  `id_treinamento` int(11) NOT NULL AUTO_INCREMENT,
  `nome_treinamento` varchar(30) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `carga_horaria` int(11) DEFAULT NULL,
  `validade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_treinamento`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treinamento`
--

LOCK TABLES `treinamento` WRITE;
/*!40000 ALTER TABLE `treinamento` DISABLE KEYS */;
INSERT INTO `treinamento` VALUES (1,'Incendio','Treino',10,3);
/*!40000 ALTER TABLE `treinamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vw_equipe`
--

DROP TABLE IF EXISTS `vw_equipe`;
/*!50001 DROP VIEW IF EXISTS `vw_equipe`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_equipe` AS SELECT 
 1 AS `id_equipe`,
 1 AS `nome`,
 1 AS `turno`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_funcionario`
--

DROP TABLE IF EXISTS `vw_funcionario`;
/*!50001 DROP VIEW IF EXISTS `vw_funcionario`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_funcionario` AS SELECT 
 1 AS `id_funcionario`,
 1 AS `cpf`,
 1 AS `nome completo`,
 1 AS `telefone`,
 1 AS `email`,
 1 AS `turno`,
 1 AS `cargo`,
 1 AS `setor`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_getid_setor`
--

DROP TABLE IF EXISTS `vw_getid_setor`;
/*!50001 DROP VIEW IF EXISTS `vw_getid_setor`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_getid_setor` AS SELECT 
 1 AS `id_setor`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_treinamento`
--

DROP TABLE IF EXISTS `vw_treinamento`;
/*!50001 DROP VIEW IF EXISTS `vw_treinamento`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_treinamento` AS SELECT 
 1 AS `id_treinamento`,
 1 AS `nome`,
 1 AS `carga_horaria`,
 1 AS `validade`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vw_equipe`
--

/*!50001 DROP VIEW IF EXISTS `vw_equipe`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_equipe` AS select `equipe`.`id_equipe` AS `id_equipe`,`equipe`.`nome` AS `nome`,`equipe`.`turno` AS `turno` from `equipe` */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_funcionario`
--

/*!50001 DROP VIEW IF EXISTS `vw_funcionario`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_funcionario` AS select `funcionario`.`id_funcionario` AS `id_funcionario`,`funcionario`.`cpf` AS `cpf`,concat(`funcionario`.`nome`,' ',`funcionario`.`sobrenome`) AS `nome completo`,`funcionario`.`telefone` AS `telefone`,`funcionario`.`email` AS `email`,`funcionario`.`turno` AS `turno`,`funcionario`.`cargo` AS `cargo`,`setor`.`sigla` AS `setor` from (`funcionario` join `setor` on(`funcionario`.`id_setor` = `setor`.`id_setor`)) */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_getid_setor`
--

/*!50001 DROP VIEW IF EXISTS `vw_getid_setor`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_getid_setor` AS select `setor`.`id_setor` AS `id_setor` from `setor` */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_treinamento`
--

/*!50001 DROP VIEW IF EXISTS `vw_treinamento`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_treinamento` AS select `treinamento`.`id_treinamento` AS `id_treinamento`,`treinamento`.`nome_treinamento` AS `nome`,`treinamento`.`carga_horaria` AS `carga_horaria`,`treinamento`.`validade` AS `validade` from `treinamento` */
/*!50002 WITH CASCADED CHECK OPTION */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-12 14:45:22
