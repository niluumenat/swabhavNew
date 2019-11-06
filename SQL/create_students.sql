CREATE TABLE COLLEGE(
    COLLEGEID INT NOT NULL,
    NAME VARCHAR(100) NOT NULL,
    DESCRIPTION VARCHAR(200) NULL,
    PRIMARY KEY(COLLEGEID)
);
 
CREATE TABLE STUDENTS(
	 COLLEGEID INT NOT NULL,
    ROLLNO INT AUTO_INCREMENT PRIMARY KEY,
    Name varchar(100) not null,
    CGPA FLOAT NOT NULL,
    FOREIGN KEY (COLLEGEID) REFERENCES COLLEGE(COLLEGEID)
);

INSERT INTO COLLEGE(COLLEGEID,NAME,DESCRIPTION)
VALUES(103,'ST. FRANCIS','VIRAR');
SELECT * FROM COLLEGE;

SELECT * FROM STUDENTS;
INSERT INTO STUDENTS(COLLEGEID,NAME,CGPA) 
VALUES (101,'AKASH',6.7);






