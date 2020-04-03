CREATE TABLE TEAM (
TEAM_ID INT PRIMARY KEY AUTO_INCREMENT, -- primary key is a combo constraint of not null a unique
NAME VARCHAR(200) UNIQUE,
MASCOT VARCHAR(200) NOT NULL
);

-- composite key is a PRIMARY key composed of two fields
-- a PRIMARY key uniquely IDENTIfy every record PLAYER_ID or primary key (TEAM_NAME + JERSERY_NUM)

INSERT INTO TEAM VALUES (0,'Globetrotters','Globey the Globe');
INSERT INTO TEAM VALUES (0,'Raptors','Dino');
INSERT INTO TEAM VALUES (0,'Da Bulls','Bull');

CREATE TABLE COACH (
COACH_ID int PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(200) NOT NULL,
SALARY INT,
TEAM_ID int,
CONSTRAINT FK_COACH_TEAM FOREIGN KEY COACH(TEAM_ID) REFERENCES TEAM(TEAM_ID)
);
-- 
-- SELECT * FROM TEAM;
-- SELECT * FROM COACH;

INSERT INTO COACH VALUES (0,'Dylan',1000000,1);
INSERT INTO COACH VALUES (0,'Jaxon',1000000,2);
INSERT INTO COACH VALUES (0,'Alex',1000000,3);
INSERT INTO COACH VALUES (0,'Jackie',1000000,3);
INSERT INTO COACH VALUES (0,'Adam',10000000,1);
INSERT INTO COACH VALUES (0,'Coach McAwful',1,1);

CREATE TABLE PLAYER(
PLAYER_ID INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(200)NOT NULL,
JERSEY INT CHECK (JERSEY >= 0 AND JERSEY < 100), -- BETWEEN CONSTRAINT
SALARY INT,
TEAM_ID INT,
CONSTRAINT FK_PLAYER_TEAM FOREIGN KEY PLAYER(TEAM_ID) REFERENCES TEAM(TEAM_ID)
);

INSERT INTO PLAYER VALUES (0,'Dan', 20, 100000,3);
INSERT INTO PLAYER VALUES (0,'Dylan', 10, 100000,3);
INSERT INTO PLAYER VALUES (0,'Ryan', 35, 100000,1);
INSERT INTO PLAYER VALUES (0,'Jamir', 36, 100000,1);
INSERT INTO PLAYER VALUES (0,'Max', 9, 100000,2);
INSERT INTO PLAYER VALUES (0,'Brandon', 12, 100000,2);

SELECT * FROM player;

CREATE TABLE GAME(
GAME_ID INT PRIMARY KEY AUTO_INCREMENT,
LOCATION VARCHAR(200)
);

-- JUNCTION TABLE
CREATE TABLE PLAYER_GAME(
PLAYER_ID INT,
GAME_ID INT,
CONSTRAINT FK_PG_PLAYER FOREIGN KEY PLAYER_GAME(PLAYER_ID) REFERENCES PLAYER(PLAYER_ID),
CONSTRAINT FK_PG_GAME FOREIGN KEY PLAYER_GAME(GAME_ID) REFERENCES GAME(GAME_ID)
);


INSERT INTO GAME VALUES (0,'Morgantown Stadium');
INSERT INTO GAME VALUES (0, 'Madison Square Garden');
INSERT INTO GAME VALUES (0, 'Staple Center');
INSERT INTO GAME VALUES (0, 'Madison Square Garden');

SELECT * FROM PLAYER;
SELECT * FROM GAME;
SELECT * FROM PLAYER_GAME;
SELECT * FROM COACH;

INSERT INTO PLAYER_GAME VALUES (1,3); -- DAN ID 1 PLAYED AT THE STAPLE CENTER FOR GAME_ID3
INSERT INTO PLAYER_GAME VALUES (2,3);
INSERT INTO PLAYER_GAME VALUES (6,4);
INSERT INTO PLAYER_GAME VALUES (6,1);
INSERT INTO PLAYER_GAME VALUES (2,4);


-- In a normalized relational database your information is spread out over many tables
-- often times you need to make a query that involves more than table ex find a player's coaches

-- join join horizontally combines two tables
-- DENORMALIZES the data
-- joins require a join predicate  how to join
-- a shared column to match the two tables

-- select every column from the table player
SELECT * FROM PLAYER;
SELECT * FROM TEAM;

SELECT * FROM PLAYER INNER JOIN TEAM ON PLAYER.TEAM_ID = TEAM.TEAM_ID;

SELECT PLAYER.NAME,TEAM.NAME FROM PLAYER INNER JOIN TEAM ON PLAYER.TEAM_ID = TEAM.TEAM_ID;

SELECT PLAYER.NAME,TEAM.NAME FROM TEAM,PLAYER WHERE PLAYER.TEAM_ID = TEAM.TEAM_ID; -- HAVE NOT SEEN THIS BEFORE
-- THIS PERFORMS INNER JOINS ONLY GUESS

-- There are multiple ways to perform join
-- left join 
-- right join
-- inner join
-- natural join 
-- cross join

INSERT INTO TEAM VALUES (0,'Gators','Albert E Gator');
SELECT * FROM PLAYER INNER JOIN TEAM ON PLAYER.TEAM_ID = TEAM.TEAM_ID; 
-- return only records for which a match can be found

SELECT * FROM PLAYER LEFT JOIN TEAM ON PLAYER.TEAM_ID = TEAM.TEAM_ID;
-- return EVERY RECORD in the first table plus any records that it matches in the second table

SELECT * FROM PLAYER RIGHT JOIN TEAM ON PLAYER.TEAM_ID = TEAM.TEAM_ID;
-- return every RECORD in the second table plus any records that match in the first table

SELECT * FROM PLAYER INNER JOIN TEAM ON PLAYER.NAME = TEAM.MASCOT; 
SELECT * FROM PLAYER LEFT JOIN TEAM ON PLAYER.NAME = TEAM.MASCOT; 
SELECT * FROM PLAYER RIGHT JOIN TEAM ON PLAYER.NAME = TEAM.MASCOT; 

SELECT * FROM PLAYER CROSS JOIN TEAM; -- CARTESIAN PRODECT
SELECT * FROM PLAYER CROSS JOIN COACH WHERE PLAYER.SALARY + COACH.SALARY > 10000000;

-- theta join. join on something other than equality (equijoin)
SELECT * FROM PLAYER INNER JOIN COACH ON PLAYER.SALARY > COACH.SALARY;

-- foreign keys enforce data integrity
-- it impossible create players that do not have a team
-- you cannot accidently delete a team that has players

-- set operators combine two tables by just stacking them on top of one another

-- unions are helpful when you have similary data in different tables
-- who's the highest paid person in the the leauge?
-- what's the average salary in the league?

SELECT *
FROM (
SELECT PLAYER_ID,NAME,SALARY 
FROM PLAYER UNION ALL 
SELECT COACH_ID,NAME,SALARY FROM COACH) 
as dummy;


-- functions are operations that you can apply to your fields
-- FUNCTIONS CANNOT ALTER DATA
-- scalar takes a single input  UPPERCASE, ROUND
-- aggregate takes in multiple inputs SUM(), AVG(), MIN(), MAX()


SELECT * FROM COACH;

-- AGGREGATE FUNCTION 
-- Teams by average coach salary
SELECT TEAM_ID, AVG(SALARY) FROM COACH GROUP BY TEAM_ID;

-- teams by total salary expendiure
SELECT TEAM_ID, SUM(SALARY) FROM COACH GROUP BY TEAM_ID;

-- every time you make a query you are generating a virtual table
-- a table is generated based on some querying and logic
-- it does not exist physically in a database
-- turn off the power you would lose them
-- but you can constant virtual tables are generated and maintained
-- virtual tables 
-- *as far I know virtual tables and views are synonymous


-- Transaction a series of SQL statments that form a logical unit
-- a transaction can be a single statement or multiple statements

-- A lot of sql statements do not immediately change the state of the database
-- often your changes can be rollbacked
-- until your data is committed is does not exist physically in the database

INSERT INTO TEAM VALUES (0,'Mountaineers','Mountie');
ROLLBACK; -- reverting to the previous checkpoint
COMMIT; -- saving the game
SELECT * FROM TEAM;

-- ACID properties of transactions

-- Atomicity (everything in a transaction either works or the entire thing is rolled back)

-- Consistency (the database is only ever in a consistent state. There is no commited version of a database
-- midway through a transaction)

-- Isolation (A lot of database will have many transactions occuring at the same exact time, there is overlap
-- this overlap can load to consistency issues. We can prevent consistency issues by using isolation levels)

-- Durablity (transactions should be fault tolerant or fail gracefully.
--  An error in a transaction does not result in
-- a system crash, corrupted data or lost data)






