create table emp7
(
    no number(3,1),
    name    varchar2(10)
);
alter table emp7
    add (location varchar2(30));
select * from emp7;

create table member2
(
    UserID  number(6),
    UserName varchar2(100)
)
alter table member2
    add (Address    varchar2(300));
alter table member2
    add (Address2   varchar2(300));
    
alter table member2
    rename column Address2 to Addr;
rename member2 to member3;
alter table member3
    modify(Addr varchar(3000));
    
TRUNCATE table member3;
select * from member3;
drop table member3;

create table member4 
(
    emp_no number(3),
    emp_name    varchar(30)
)
insert into member4 values(1,'이순신');
insert into member4 values(2,'홍길동');
insert into member4 values(3,'강감찬');
select * from member4;
update member4 set emp_name='권율';
select * from member4;
update member4 set emp_name='이순신'where emp_no = 1;
update member4 set emp_name='홍길동'where emp_no = 2;
