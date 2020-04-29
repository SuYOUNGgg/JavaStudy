SELECT * FROM CERT4;
SELECT * FROM MEMBER4;
-- (Cartesian Products) : Cross Join
-- INNER JOIN
SELECT MEMBER4.NO, MEMBER4.NAME, MEMBER4.ADDRESS, MEMBER4.TEL_NO, 
MEMBER4.SSN, CERT4.NAME, CERT4.BUILD
FROM MEMBER4, CERT4 
WHERE MEMBER4.CERT_NO = CERT4.NO;



