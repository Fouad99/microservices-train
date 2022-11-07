DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;



CREATE TABLE customer (
    customer_id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    mobile_number varchar(20) NOT NULL,
    create_dt date DEFAULT NULL
);

CREATE TABLE accounts (
    customer_id int AUTO_INCREMENT,
    account_number int AUTO_INCREMENT PRIMARY KEY,
    account_type varchar(100) NOT NULL,
    branch_address varchar(200) NOT NULL,
    create_dt date DEFAULT NULL
);

INSERT INTO customer (name, email, mobile_number, create_dt)
    VALUES ('Fouad Serradj', 'fouad.serradj@gmail.com', '4568954545', CURDATE());

INSERT INTO accounts (customer_id, account_number, account_type, branch_address ,create_dt)
    VALUES (1, 186576999 , 'savings', '123 main st-catherine, Montreal', CURDATE());

