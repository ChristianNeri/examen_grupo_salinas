-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema examenb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema examenb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `examenb` DEFAULT CHARACTER SET utf8 ;
USE `examenb` ;

-- -----------------------------------------------------
-- Table `examenb`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `examenb`.`clientes` (
  `id_clientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `correo` VARCHAR(50) NULL,
  PRIMARY KEY (`id_clientes`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `id_clientes_UNIQUE` ON `examenb`.`clientes` (`id_clientes` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
