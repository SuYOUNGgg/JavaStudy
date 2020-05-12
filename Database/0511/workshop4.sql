--1. 황기훈과 동일한 부서에 속한 사원의 이름과 입사일, 급여를 표시 하십시오.
select name , hire, sal 
from member 
where dept_id = (select dept_id from member where name='황기훈');

--2. 급여가 평균급여 보다 많은 사원의 사번, 이름을 표시 하십시오.

--3. 최고의 평균 급여를 포함하는 부서 번호와 평균 급여를 표시 하십시오.


--4. 배기수에게 보고 하는 모든 사원의 이름과 급여를 표시 하십시오.
select name,sal
from member
where mgr=(select member_id from member where name = '배기수');

--5. 영업부 부서에 모든 사원의 사번, 이름, 부서번호, 직위를 표시 하십시오.
select member_id, name, dept_id, jikwi
from member
where dept_id = (select dept_id from dept where dept_name = '영업부');

--6. 부하직원이 있는 모든 사원을 표시 하십시오.
select name
from member
where member_id in( select mgr from member where mgr is not null);

select name 
from member
where exists ( select mgr from member where mgr is not null);


