--1.������ ���� �÷��� ������ TEST ���̺��� ����ʽÿ�.
create table TEST
(
    ID number(5,1),
    name varchar2(20)
);
--2. TEST ���̺� JOB �÷��� �߰� �Ͻʽÿ�.(JOB VARCHAR2(10))
alter table TEST
    add(JOB varchar2(10));
    
-- 3. TEST ���̺� JOB �÷��� ������ �� ���̺��� ������ Ȯ�� �Ͻʽÿ�
ALTER TABLE TEST 
    DROP COLUMN JOB;
desc test;

--4. TEST ���̺� ID �÷��� PRIMARY KEY ���� ������ �߰� �Ͻʽÿ�.

