-- MySQL Script generated by MySQL Workbench
-- Mon May  9 22:26:41 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Customers` (
  `id customer` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `customers_phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id customer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tecnical_sertificate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tecnical_sertificate` (
  `idTecnical_sertificate` INT NOT NULL AUTO_INCREMENT,
  `number_technial_sert` VARCHAR(45) NOT NULL,
  `date` DATE NOT NULL,
  PRIMARY KEY (`idTecnical_sertificate`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cars` (
  `idCars` INT NOT NULL AUTO_INCREMENT,
  `model` VARCHAR(45) NOT NULL,
  `registration_number` VARCHAR(45) NOT NULL,
  `tecnical_sertificate_id` INT NOT NULL,
  `customers_id` INT NOT NULL,
  PRIMARY KEY (`idCars`),
  INDEX `fk_Cars_Tecnical_sertificate_idx` (`tecnical_sertificate_id` ASC) VISIBLE,
  INDEX `fk_Cars_Customers1_idx` (`customers_id` ASC) VISIBLE,
  CONSTRAINT `fk_Cars_Tecnical_sertificate`
    FOREIGN KEY (`tecnical_sertificate_id`)
    REFERENCES `mydb`.`Tecnical_sertificate` (`idTecnical_sertificate`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cars_Customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `mydb`.`Customers` (`id customer`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cars_services`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cars_services` (
  `idCars_services` INT NOT NULL AUTO_INCREMENT,
  `type_of_work` VARCHAR(45) NOT NULL,
  `time` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCars_services`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Purveyors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Purveyors` (
  `idPurveyors` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `phone` INT NOT NULL,
  `guarantee` INT NOT NULL,
  PRIMARY KEY (`idPurveyors`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Buy_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Buy_details` (
  `idbuy_details` INT NOT NULL,
  `name_detail` VARCHAR(45) NOT NULL,
  `quantity_detail` INT NOT NULL,
  `sum` INT NOT NULL,
  `Purveyors_id` INT NOT NULL,
  PRIMARY KEY (`idbuy_details`),
  INDEX `fk_Buy_details_Purveyors1_idx` (`Purveyors_id` ASC) VISIBLE,
  CONSTRAINT `fk_Buy_details_Purveyors1`
    FOREIGN KEY (`Purveyors_id`)
    REFERENCES `mydb`.`Purveyors` (`idPurveyors`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Payments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Payments` (
  `idPayment` INT NOT NULL AUTO_INCREMENT,
  `sum` VARCHAR(45) NOT NULL,
  `discount` VARCHAR(45) NULL,
  `сustomers_id` INT NOT NULL,
  PRIMARY KEY (`idPayment`),
  INDEX `fk_Payments_Customers1_idx` (`сustomers_id` ASC) VISIBLE,
  CONSTRAINT `fk_Payments_Customers1`
    FOREIGN KEY (`сustomers_id`)
    REFERENCES `mydb`.`Customers` (`id customer`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Orders` (
  `id` INT NOT NULL,
  `tecnical_sertificate_id` INT NOT NULL,
  `cars_services_id` INT NOT NULL,
  `price` VARCHAR(45) NOT NULL,
  `buy_details_id` INT NULL,
  `payment_idPayment` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Tecnical_sertificate_has_Cars_services_Cars_services1_idx` (`cars_services_id` ASC) VISIBLE,
  INDEX `fk_Tecnical_sertificate_has_Cars_services_Tecnical_sertific_idx` (`tecnical_sertificate_id` ASC) VISIBLE,
  INDEX `fk_Orders_buy_details1_idx` (`buy_details_id` ASC) VISIBLE,
  INDEX `fk_Orders_Payment1_idx` (`payment_idPayment` ASC) VISIBLE,
  CONSTRAINT `fk_Tecnical_sertificate_has_Cars_services_Tecnical_sertificate1`
    FOREIGN KEY (`tecnical_sertificate_id`)
    REFERENCES `mydb`.`Tecnical_sertificate` (`idTecnical_sertificate`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tecnical_sertificate_has_Cars_services_Cars_services1`
    FOREIGN KEY (`cars_services_id`)
    REFERENCES `mydb`.`Cars_services` (`idCars_services`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Orders_buy_details1`
    FOREIGN KEY (`buy_details_id`)
    REFERENCES `mydb`.`Buy_details` (`idbuy_details`)
    ON DELETE CASCADE
    ON UPDATE SET NULL,
  CONSTRAINT `fk_Orders_Payment1`
    FOREIGN KEY (`payment_idPayment`)
    REFERENCES `mydb`.`Payments` (`idPayment`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Executors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Executors` (
  `idExecutors` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `time` INT NOT NULL,
  PRIMARY KEY (`idExecutors`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Discount_cards`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Discount_cards` (
  `iddiscount_card` INT NOT NULL AUTO_INCREMENT,
  `percent` INT NOT NULL,
  `Customers_id customer` INT NOT NULL,
  PRIMARY KEY (`iddiscount_card`),
  INDEX `fk_discount_card_Customers1_idx` (`Customers_id customer` ASC) VISIBLE,
  CONSTRAINT `fk_discount_card_Customers1`
    FOREIGN KEY (`Customers_id customer`)
    REFERENCES `mydb`.`Customers` (`id customer`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Used_equipment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Used_equipment` (
  `idused_equipment` INT NOT NULL,
  `name_equipmentcol` VARCHAR(45) NOT NULL,
  `time` VARCHAR(45) NOT NULL,
  `Orders_id` INT NOT NULL,
  PRIMARY KEY (`idused_equipment`),
  INDEX `fk_used_equipment_Orders1_idx` (`Orders_id` ASC) VISIBLE,
  CONSTRAINT `fk_used_equipment_Orders1`
    FOREIGN KEY (`Orders_id`)
    REFERENCES `mydb`.`Orders` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Executers_of_orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Executers_of_orders` (
  `ID` VARCHAR(45) NOT NULL,
  `Orders_id` INT NOT NULL,
  `Executors_id` INT NOT NULL,
  `order` VARCHAR(45) NOT NULL,
  `executor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Orders_has_Executors_Executors1_idx` (`Executors_id` ASC) VISIBLE,
  INDEX `fk_Orders_has_Executors_Orders1_idx` (`Orders_id` ASC) VISIBLE,
  CONSTRAINT `fk_Orders_has_Executors_Orders1`
    FOREIGN KEY (`Orders_id`)
    REFERENCES `mydb`.`Orders` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Orders_has_Executors_Executors1`
    FOREIGN KEY (`Executors_id`)
    REFERENCES `mydb`.`Executors` (`idExecutors`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Courtesy_cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Courtesy_cars` (
  `idCourtesy_cars` INT NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `body_number` VARCHAR(45) NOT NULL,
  `customers_id` INT NOT NULL,
  PRIMARY KEY (`idCourtesy_cars`),
  INDEX `fk_Courtesy_cars_Customers1_idx` (`customers_id` ASC) VISIBLE,
  CONSTRAINT `fk_Courtesy_cars_Customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `mydb`.`Customers` (`id customer`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Washings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Washings` (
  `idWashings` INT NOT NULL,
  `complex` VARCHAR(45) NOT NULL,
  `wax` VARCHAR(45) NOT NULL,
  `drying` INT NOT NULL,
  `Orders_id` INT NOT NULL,
  PRIMARY KEY (`idWashings`),
  INDEX `fk_Washings_Orders1_idx` (`Orders_id` ASC) VISIBLE,
  CONSTRAINT `fk_Washings_Orders1`
    FOREIGN KEY (`Orders_id`)
    REFERENCES `mydb`.`Orders` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Documents_for_courtesy_cars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Documents_for_courtesy_cars` (
  `idDocuments_for_courtesy_cars` INT NOT NULL,
  `insuarance` VARCHAR(45) NOT NULL,
  `date` VARCHAR(45) NOT NULL,
  `tecnical_inspection` VARCHAR(45) NOT NULL,
  `courtesy_cars_id` INT NOT NULL,
  PRIMARY KEY (`idDocuments_for_courtesy_cars`),
  INDEX `fk_Documents_for_courtesy_cars_Courtesy_cars1_idx` (`courtesy_cars_id` ASC) VISIBLE,
  CONSTRAINT `fk_Documents_for_courtesy_cars_Courtesy_cars1`
    FOREIGN KEY (`courtesy_cars_id`)
    REFERENCES `mydb`.`Courtesy_cars` (`idCourtesy_cars`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;