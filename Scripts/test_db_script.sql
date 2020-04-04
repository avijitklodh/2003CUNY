-- tables should match entities
--create table EMPLOYEE (ID int, FIRST_NAME varchar(200), LAST_NAME varchar(200), DEPARTMENT varchar(200));

-- we want a table with unique primary keys
--create table EMPLOYEE (ID serial primary key, FIRST_NAME varchar(200), LAST_NAME varchar(200), DEPARTMENT varchar(200));
create table EMPLOYEE (
ID serial primary key,
FIRST_NAME varchar(200),
LAST_NAME varchar(200),
department varchar(200) references department(department_name)

);


-- remove a table
drop table employee;


-- CREATE
insert into EMPLOYEE (first_name, last_name, department) values ( 'Aadam', 'Ranieri', 'Training');
insert into EMPLOYEE (first_name, last_name, department) values ( 'Nina', 'Sulan', 'LCAT');
insert into EMPLOYEE (first_name, last_name, department) values ( 'Will', 'Newell', 'Development');
insert into EMPLOYEE (first_name, last_name, department) values ( 'Jerry', 'Someone', 'Development');

-- READ

select * from employee;

select * from employee where department = 'Development';
select FIRST_NAME, LAST_NAME from employee where department = 'Training';

-- UPDATE

update employee set first_name 'William' where first_name = 'Will';

-- DELETE

delete from employee where id = 101;

delete from employee;
