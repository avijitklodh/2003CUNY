create table school(
id serial primary key,
name varchar(200) unique,
phone varchar(200),
capacity int
);

create table student (
id serial primary key,
name varchar(200),
fk_school integer references school(id)
);

insert into school (name, phone, capacity) values ('osage', '576122', 500);

select * from school;