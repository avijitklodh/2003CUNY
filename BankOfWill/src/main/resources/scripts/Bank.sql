create table "user" (
	id				serial primary key,
	first_name		varchar(200) not null,
	last_name		varchar(200) not null,
	
	username		varchar(200) unique not null,
	password_hash	varchar(200) not null,
	is_super 		boolean default false
);

create table account (
	id				serial primary key,
	balance 		double precision default 0,
	nickname		varchar(200) not null
);

create table user_account (
	user_id			serial references "user"(id),
	account_id		serial references account(id),
	primary key	(user_id, account_id)
);

create table transaction_log (
	id 				serial primary key,
	t_date			timestamp default current_timestamp,
	amount			double precision not null,
	message			varchar,
	to_account		serial references account(id),
	user_id			serial,
	from_account	serial,
	foreign key (user_id, from_account) references user_account (user_id, account_id)
);


drop table transaction_log;
drop table user_account cascade;
drop table account cascade;
drop table "user" cascade;

-- test table connections:

insert into "user" (first_name, last_name, username, password_hash) values
('nina', 'sultan', 'ninac', 'asdfabsdasdf'),
('will', 'newell', 'newellw', 'notahashsucka'),
('adam', 'ranieri', 'ranam', 'spelledthatwrong');

insert into account (balance, nickname) values
(23842.62, 'checking'),
(6837271.24, 'shared');

select id as user_id from "user" where first_name = 'adam';
select id as account_id from account where balance = 6837271.24;

select * from "user" inner join user_account on id = user_id and account_id = '113ca865-9140-42da-ba63-c1e8bad469b0';

insert into user_account (user_id, account_id) values
('30ee6697-e337-4fa1-8ae1-41649117bfa9', '76f87095-1faf-4e77-9926-1e5a7ecaa6f6');

insert into user_account (user_id, account_id) values
('289e7eca-46c3-4b42-accc-0ac6a41ca695', '113ca865-9140-42da-ba63-c1e8bad469b0');

-- invalid because foreign key account/user combo doesn't match (user not connected to from account)
insert into transaction_log (from_account, to_account, user_id, amount) values
('66b506d1-2eaa-40b5-b7f5-666b46b2edee', '23f664d7-0aeb-4682-b889-d7c56659c8e3', 'a2ec2d9e-3c09-4c4e-927e-1f8a427c12b3', 20.00::money);

-- does work because user is connected to from account
insert into transaction_log (from_account, to_account, user_id, amount) values
('66b506d1-2eaa-40b5-b7f5-666b46b2edee', '23f664d7-0aeb-4682-b889-d7c56659c8e3', '30ee6697-e337-4fa1-8ae1-41649117bfa9', 20.00::money);
