-- test.users definition

CREATE TABLE `users` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(100) DEFAULT NULL,
  `lastName` varchar(100) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `role` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET SQL_MODE = 'ORACLE';
CREATE OR REPLACE PROCEDURE ADD_USER (fname VARCHAR , lname  VARCHAR , uname VARCHAR , pass VARCHAR , urole VARCHAR)
AS
 BEGIN
 INSERT INTO   users VALUES (0,fname , lname , LOWER(uname)  ,phone ,pass, urole);
 END ;

