--1. 모든 직원의 급여 총액, 급여 평균, 최고 급여, 최소 급여를 표시 하십시오.
select sum(sal) "급여 총액", avg(sal) "급여 평균", max(sal) "최고 급여", min(sal) "최소 급여"
from member;

--2. 직위가 동일한 직원의 수를 표시 하십시오.
select jikwi, count(*) 
from member
group by jikwi;

--3. 직원들 중에서 관리자의 수를 표시 하십시오.
select count(distinct mgr) "관리자의 수"
from member;

--4. 총 직원 수를 구하고 2000, 2001, 2002, 2003년에 입사한 직원 수를 표시하십 시오.
select count(*) "총 직원 수", count(decode(to_char(hire,'yyyy'),'2000',1)) "2000년"
    ,count(decode(to_char(hire,'yyyy'),'2001',1)) "2001년"
    ,count(decode(to_char(hire,'yyyy'),'2002',1)) "2002년"
    ,count(decode(to_char(hire,'yyyy'),'2003',1)) "2003년"from member;

--5. 지급된 보너스의 평균값을 구하십시오. (보너스가 없는 경우는 0으로 적용하 세요)
select avg(nvl(bonus,0))
from member;

--6. 최고 급여가 10000원이 넘는 부서번호와 평균급여를 표시 하십시오.
select dept_id,avg(sal)
from member
group by dept_id
having max(sal)>10000;

--7. 영업부 부서에서 근무하는 모든 직원의 이름, 직위, 부서번호, 부서이름을 표시 하십시오.
select s.name, s.jikwi,s.dept_id,t.dept_name
from member s, dept t
where s.dept_id=t.dept_id
and t.dept_name = '영업부';

--8. 직원의 이름, 사번, 관리자 이름, 사번을 표시 하십시오.
select s.name,s.member_id, t.name, t.member_id
from member s, member t
where t.member_id =s.mgr;

--9. 관리자가 지정되지 않은 직원도 포함하여 직원의 이름, 사번, 관리자 이름, 관리자의 사번을 표시 하십시오.(관리자가 지정되지 않은 경우 관리자의 이름과 사번은 ‘없음’으로 표시하세요)
select s.name,s.member_id, NVL(t.name,'없음'), NVL(TO_CHAR(t.member_id),'없음')
from member s, member t
where t.member_id(+) =s.mgr;

--10. 관리자 보다 먼저 입사한 모든 직원의 이름, 입사일, 관리자 이름, 관리자 입사일을 표시 하십시오.
select s.name,s.hire,t.name,t.hire
from member s, member t
where t.member_id =s.mgr(+)
and s.hire<t.hire;

--11. 보너스를 받는 직원의 이름, 부서 번호, 부서 이름을 표시 하십시오.
select s.name,s.dept_id, t.dept_name
from member s, dept t
where s.dept_id = t.dept_id
and s.bonus !=0;