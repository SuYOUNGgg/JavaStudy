--1.다음과 같은 컬럼을 가지는 TEST 테이블을 만드십시오.
create table TEST
(
    ID number(5,1),
    name varchar2(20)
);
--2. TEST 테이블에 JOB 컬럼을 추가 하십시오.(JOB VARCHAR2(10))
alter table TEST
    add(JOB varchar2(10));
    
-- 3. TEST 테이블에 JOB 컬럼을 삭제한 후 테이블이 구조를 확인 하십시오
ALTER TABLE TEST 
    DROP COLUMN JOB;
desc test;

--4. TEST 테이블에 ID 컬럼의 PRIMARY KEY 제약 조건을 추가 하십시오.

