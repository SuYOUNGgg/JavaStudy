CREATE table DEPT2
as
select * from   DEPT;

select * from DEPT2;
DELETE FROM DEPT2;
INSERT INTO DEPT2 SELECT * FROM DEPT;
DESC DEPT2;

SELECT * FROM DEPT;
DESC DEPT;
INSERT INTO DEPT VALUES(60, '�����', 600);
UPDATE DEPT SET DEPT_NAME = 'IT��' WHERE DEPT_ID =60;


select * from member
where dept_id = (select dept_id from dept where dept_name ='�λ��');

select * from member s, dept t
where s.dept_id = t.dept_id
and t.dept_name = '�λ��';

select * from dept;
delete from dept where dept_id = 60;
--delete from member; �̰��ϸ� �� ������.....

