CREATE TABLE CONTACT(
ID INT AUTO_INCREMENT ,
FIRSTNAME VARCHAR(30),
LASTNAME VARCHAR(35),
PHONENO VARCHAR(40),
EMAILID VARCHAR(30),
PRIMARY KEY(ID)
);

SELECT * FROM CONTACT;

insert INTO CONTACT(FIRSTNAME,LASTNAME,PHONENO,EMAILID)
VALUES("NIKI","PATEL",48584,"DHH@GMAIL.COM");


insert INTO CONTACT(FIRSTNAME,LASTNAME,PHONENO,EMAILID)
VALUES("NILAM","PATEL",983435554,"NIL@GMAIL.COM");


DELETE FROM CONTACT 
WHERE FIRSTNAME='Akash';

drop table CONTACT;


UPDATE CONTACT SET FIRSTNAME='HETA', LASTNAME='DESAI'
WHERE ID=1;
SELECT * FROM CONTACT;
