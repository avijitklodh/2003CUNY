create extension if not exists "uuid-ossp";

create table customer (
	id				uuid default uuid_generate_v4(),
	first_name		varchar(200) not null,
	last_name		varchar(200) not null,
	
	username		varchar(200) unique not null,
	password_hash	varchar(200) not null,
	is_super 		boolean default false,
	primary key 	(id)
);

create table account (
	id 				uuid default uuid_generate_v4(),
	balance 		money,
	nickname		varchar(200),
	primary key		(id)
);

create table customer_account (
	customer_id		uuid references customer(id),
	account_id		uuid references account(id),
	primary key	(customer_id, account_id)
);

create table transaction_log (
	id 				uuid default uuid_generate_v4(),
	t_date			timestamp default current_timestamp,
	amount			money not null,
	message			varchar,
	to_account		uuid references account(id),
	customer_id		uuid,
	from_account	uuid,
	foreign key (customer_id, from_account) references customer_account (customer_id, account_id),
);

drop table customer;
drop table account;
drop table customer_account;
drop table transaction_log;

-- test table connections:

insert into customer (first_name, last_name, username, password_hash) values
('will', 'newell', 'newellw', 'notahashsucka'),
('adam', 'ranieri', 'ranam', 'spelledthatwrong');

insert into account (balance) values
(23842.62),
(6837271.24);

select id as customer_id from customer where first_name = 'adam';
select id as account_id from account where balance = 6837271.24::money;

insert into customer_account (customer_id, account_id) values
('a9643c49-73d8-4452-b726-582c5c6c9635', '66b506d1-2eaa-40b5-b7f5-666b46b2edee');

insert into customer_account (customer_id, account_id) values
('a2ec2d9e-3c09-4c4e-927e-1f8a427c12b3', '23f664d7-0aeb-4682-b889-d7c56659c8e3');

-- invalid because foreign key account/user combo doesn't match (user not connected to from account)
insert into transaction_log (from_account, to_account, customer_id, amount) values
('66b506d1-2eaa-40b5-b7f5-666b46b2edee', '23f664d7-0aeb-4682-b889-d7c56659c8e3', 'a2ec2d9e-3c09-4c4e-927e-1f8a427c12b3', 20.00::money);

-- does work because user is connected to from account
insert into transaction_log (from_account, to_account, customer_id, amount) values
('66b506d1-2eaa-40b5-b7f5-666b46b2edee', '23f664d7-0aeb-4682-b889-d7c56659c8e3', 'a9643c49-73d8-4452-b726-582c5c6c9635', 20.00::money);
