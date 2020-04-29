
CREATE TABLE CERT5
(
	NO                   CHAR(18) NOT NULL ,
	NAME                 CHAR(18) NULL ,
	BUILD                CHAR(18) NULL 
);



CREATE UNIQUE INDEX XPK11 ON CERT5
(NO   ASC);



ALTER TABLE CERT5
	ADD CONSTRAINT  XPK11 PRIMARY KEY (NO);



CREATE TABLE MEMBER5
(
	NO                   CHAR(18) NOT NULL ,
	NAME                 CHAR(18) NULL ,
	ADDRESS              CHAR(18) NULL ,
	TEL_NO               CHAR(18) NULL ,
	SSN                  CHAR(18) NULL ,
	CERT_NO              CHAR(18) NOT NULL 
);



CREATE UNIQUE INDEX XPK12 ON MEMBER5
(NO   ASC);



ALTER TABLE MEMBER5
	ADD CONSTRAINT  XPK12 PRIMARY KEY (NO);



ALTER TABLE MEMBER5
	ADD (CONSTRAINT R_2 FOREIGN KEY (CERT_NO) REFERENCES CERT5 (NO));