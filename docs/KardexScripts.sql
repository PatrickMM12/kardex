-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Kardex
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Kardex
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Kardex` DEFAULT CHARACTER SET utf8 ;
USE `Kardex` ;

-- -----------------------------------------------------
-- Table `Kardex`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Kardex`.`Fornecedor` (
  `Codigo` INT NOT NULL AUTO_INCREMENT,
  `Cnpj` VARCHAR(18) NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Telefone` VARCHAR(20) NULL,
  `Email` VARCHAR(60) NULL,
  PRIMARY KEY (`Codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Kardex`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Kardex`.`Produto` (
  `Codigo` INT NOT NULL AUTO_INCREMENT,
  `Descricao` VARCHAR(45) NOT NULL,
  `Qtde` INT NULL DEFAULT 0,
  `CustoMedio` DECIMAL(8,2) NULL,
  PRIMARY KEY (`Codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Kardex`.`Entrada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Kardex`.`Entrada` (
  `Codigo` INT NOT NULL,
  `Data` DATETIME NULL,
  `Qtde` INT NULL DEFAULT 0,
  `Valor` DECIMAL(8,2) NULL,
  `Fornecedor` INT NOT NULL,
  `Produto` INT NOT NULL,
  PRIMARY KEY (`Codigo`, `Fornecedor`, `Produto`),
  INDEX `fk_Entrada_Fornecedor_idx` (`Fornecedor` ASC) VISIBLE,
  INDEX `fk_Entrada_Produto1_idx` (`Produto` ASC) VISIBLE,
  CONSTRAINT `fk_Entrada_Fornecedor`
    FOREIGN KEY (`Fornecedor`)
    REFERENCES `Kardex`.`Fornecedor` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Entrada_Produto1`
    FOREIGN KEY (`Produto`)
    REFERENCES `Kardex`.`Produto` (`Codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
