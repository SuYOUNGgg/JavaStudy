select * from dept;
select deptno from emp;
select distinct deptno from emp; 
select * from dept2;
select distinct area from dept2;
select * from emp2;
desc emp2;
select name, emp_type, birthday from emp2;
select name, pay from emp2 order by pay desc;
select name, pay from emp2 order by pay asc, name desc;

select ename from emp;
desc emp;
select ename || job || ',' "name job" from emp;

select * from emp where ename = 'SMITH' ;
select * from emp where sal > 1000;
select empno from emp
where ename='SMITH' and job='CLERK';

SELECT * FROM EMP;
SELECT * FROM EMP WHERE hiredate >= '81/02/20' and hiredate <= '81/02/02';

select * from emp where hiredate between '81/02/20' and '81/04/02';
select empno, ename, deptno 
from emp
where deptno IN(10,20);
