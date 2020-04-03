create table team (
	team_id serial primary key,
	name varchar(200) unique not null,
	mascot varchar(200) unique not null
);

insert into team (name, mascot) values
	('Globetrotters', 'Globey'),
	('Raptors', 'Dino'),
	('Da Bulls', 'Bull');

create table coach (
	coach_id serial primary key,
	name varchar(200) not null,
	salary int,
	fk_team_id int references team(team_id)
);

insert into coach (name, salary, fk_team_id) values
('Dylan', 1000000, 1),
('Jaxon', 1000000, 2),
('Alex', 1000000, 3),
('Jackie', 1000000, 3);

create table player(
	player_id serial primary key,
	name varchar(200) not null,
	jersey int check (jersey >= 0 and jersey < 100),
	salary int,
	fk_team_id int references team(team_id)
);

insert into player (name, jersey, salary, fk_team_id) values
	('Dan', 20, 1000000, 3),
	('Jonny', 7, 1000000, 3),
	('Derek', 3, 1000000, 3),
	('Lamar', 2, 1000000, 3),
	('Shen', 85, 1000000, 3),
	('Sheldon', 62, 1000000, 3);
	
create table game (
	game_id serial primary key,
	location varchar(200)
);

insert into game (location) values
	('Morgantown Stadium'),
	('Madison Square Garden'),
	('Staples Center');

create table player_game (
	player_id int references player(player_id),
	game_id int references game(game_id)
);

insert into player_game values
(1, 3),
(2, 3),
(3, 3),
(4, 2), 	
(5, 1),
(6, 1);


 -- in a normalized database information is spread out over many tables
 -- often times you need to make a query that involves more than one table

 -- join horizontally combines two tables
 -- denormalizes the data
 -- joins require a join predicate (a shared column to match the two tables)

select * from player inner join team on player.fk_team_id = team.team_id;

select player.name, team.name from player inner join team on player.fk_team_id = team.team_id;
 -- alternative syntax
select * from player, team where player.fk_team_id = team.team_id;

-- There are multiple ways to perform join
-- left join
-- right join
-- inner join
-- natural join
-- cross join

insert into team (name, mascot) values ('Gators', 'Albert E Gator');

-- return only records for which a match can be found (equijoin)
select * from player inner join team on player.fk_team_id = team.team_id;

-- return every record in the first table plus any records that it matches in the second table
select * from player left join team on player.fk_team_id = team.team_id;

-- return every record in the second table plus any records that match in first table
select * from player right join team on player.fk_team_id = team.team_id;

-- return every team row mapped onto each player (cartesian product)
-- often used to check for any combination of entities that match a criteria
select * from player cross join coach where player.salary + coach.salary > 10000000;

-- theta join (join on something other than equality
select * from player inner join coach on player.salary > coach.salary and player.fk_team_id = coach.fk_team_id;

-- unions are helpful you have similar data in different tables
-- column count must be the same

-- e.g. who is the highest paid person in the the league?
-- or what's the average salary in the league?
select (player_id, name, salary) from player
union all
select (coach_id, name, salary) from coach;


-- highest paid salary

select name, salary from (
	select name, salary from player
	union
	select name, salary from coach
) order by salary desc limit 1;


-- functions are operations that you can apply to your fields
-- functions cannot alter data
-- scalar takes a single input uppercase, round
-- aggregate takes in multiple inputs, sum, avg, min, max

-- teams by average coach salary
select fk_team_id, avg(salary) from coach group by fk_team_id;

-- teams by total salary expenditure
select fk_team_id, sum(salary) from coach group by fk_team_id;

-- a lot of sql statements do not immediately change the state of the database
-- often your changes can be rollbacked
-- until your data is committed it does not exist physically in the database

insert into team (name, mascot) values ('Mountaineers', 'Mountie');
rollback;
commit;

create or replace procedure add_player(p_name varchar, jersey int, team_id int, salary int) 
LANGUAGE plpgsql
as $$
begin 
	insert into player ("name", "jersey", "fk_team_id", "salary") values (p_name, jersey, team_id, salary);
end;
$$;

call add_player('will', 24, 1, 2000000);