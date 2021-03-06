CREATE TABLE CUSTOMER(
CUSTOMERID INT NOT NULL PRIMARY KEY,
NAME VARCHAR(20) NOT NULL
);

CREATE TABLE ORDERS(
CUSTOMERID INT NOT NULL,
ORDERID INT NOT NULL PRIMARY KEY,
DATE VARCHAR(30) NOT NULL,
FOREIGN KEY(CUSTOMERID) REFERENCES CUSTOMER(CUSTOMERID)
);

CREATE TABLE LINEITEM(
ORDERID INT NOT NULL,
ID INT NOT NULL PRIMARY KEY,
QUANTITY INT NOT NULL,
FOREIGN KEY(ORDERID) REFERENCES ORDERS(ORDERID)
);

CREATE TABLE PRODUCT(
ID INT NOT NULL,
NAME VARCHAR(200) NOT NULL,
PRICE FLOAT NOT NULL,
FOREIGN KEY(LINEITEMID) REFERENCES LINEITEM(ID)
);
SELECT * FROM LINEITEM;

INSERT INTO CUSTOMER(CUSTOMERID,NAME)
VALUES(101,'NILAM');

INSERT INTO ORDERS(CUSTOMERID,ORDERID,DATE) 
VALUES(101,201,'31-10-2019');

INSERT INTO LINEITEM(ORDERID,LINEITEMID,QUANTITY)
VALUES(201,301,5);

INSERT INTO PRODUCT(LINEITEMID,ID,NAME,PRICE)
VALUES(301,402,'Samsung',2000);
SELECT * FROM CUSTOMER;
SELECT * FROM ORDERS;
SELECT * FROM LINEITEM;
SELECT * FROM PRODUCT;`aurionpro`



