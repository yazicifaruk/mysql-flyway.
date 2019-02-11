create table customers(id bigint not null auto_increment,name varchar(255),primary key(id));
create table customers_phone_numbers(customers_id bigint not null,phone_number_id bigint not null,primary key(id));
create table items(id bigint not null auto_increment,quantity integer not null,order_id bigint,product_id bigint,primary key(id));
create table orders(id bigint not null auto_increment,name created_at datetime,customer_id bigint,primary key(id));
create table phone_numbers(id bigint not null auto_increment,value varchar(255),primary key(id));