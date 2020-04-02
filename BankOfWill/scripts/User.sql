create extension if not exists "uuid-ossp";

create table customer (
	id uuid default uuid_generate_v4(),
	first_name varchar(200) not null,
	last_name varchar(200),
	username varchar(200) not null,
	password_hash varchar(200) not null,
	primary key (customer_id)
);

drop table customer;