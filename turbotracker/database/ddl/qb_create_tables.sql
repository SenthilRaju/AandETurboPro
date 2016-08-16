CREATE TABLE `qbConfig` (
  `qbID` INT NOT NULL AUTO_INCREMENT,
  `qbUserName` VARCHAR(45) NOT NULL,
  `qbPassword` VARCHAR(45) NOT NULL,
  `qbUserKey` VARCHAR(45) NOT NULL,
  `qbHost` VARCHAR(45) NOT NULL,
  `tpUserName` VARCHAR(45) NOT NULL,
  `qbEnabled` VARCHAR(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`qbID`));

ALTER TABLE `vePO` 
ADD COLUMN `qbPO` VARCHAR(45) NULL AFTER `wantedOnOrBefore`;
