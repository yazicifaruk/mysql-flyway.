INSERT INTO customers (name) values ('ahmet');
INSERT INTO customers (name) values ('omer');
INSERT INTO customers (name) values ('hulya');

INSERT INTO phone_numbers(value) values ('1111111');
INSERT INTO phone_numbers(value) values ('2222222');
INSERT INTO phone_numbers(value) values ('3333333');

INSERT INTO customers_phones_numbers (customers_id,phone_numabers_id) values (1,1);
INSERT INTO customers_phones_numbers (customers_id,phone_numabers_id) values (1,2);
INSERT INTO customers_phones_numbers (customers_id,phone_numabers_id) values (2,1);

INSERT INTO products (name) values ('book');
INSERT INTO products (name) values ('pencil');
INSERT INTO products (name) values ('water');


INSERT INTO orders (created_at,customer_id) values (NOW(),1);
INSERT INTO items (order_id,product_id,quantity) values (1,1,2);
INSERT INTO items (order_id,product_id,quantity) values (1,2,3);