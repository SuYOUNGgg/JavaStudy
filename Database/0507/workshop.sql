--1.급여가 14000에서 30000사이에 포함되지 않는 모든 직원의 이름과 급여를 표시 하십시오.
select name, sal 
from member
where sal <= 14000 or sal >=30000;
select name,sal
from member
where sal not between 14000 and 30000;

--2. 직원의 사번, 이름, 급여및 급여를 20% 인상한 급여로 표시 하십시오
select member_id, name, sal*1.2
from member;

--3. 각 직원의 근무 달수를 표시 하십시오.
select trunc(months_between(sysdate,hire))||'개월' "근무달수"
from member;

--4. 각 직원의 근무 달수를 표시 하십시오. 결과는 소숫점 두째자리에서 반올림 합니다.
select round(months_between(sysdate,hire),2) ||'개월' "근무개월"
from member;

--5. 각 직원의 이름 급여를 표시 하는 질의문을 작성 하십시오. 급여는 10자리 길이에 왼쪽에는 #표시가 채워지는 형식으로 표기 하십시오.
select name,lpad(sal,10,'#')
from member;

--6. 각 직원의 사번, 이름, 입사일과 입사한 후에 10달이 경과된 날짜를 표시 하시오. (단 경과된 날짜의 결과는 ‘YYYY-MM-DD‘ 형식으로 표시 하십시오)
select member_id,name,hire,to_char(add_months(hire,10),'yyyy-mm-dd') "10달 후"
from member;

--7. member 테이블에서 사원의 이름, 직위, 입사일 과 입사한 요일을 표시하되 월요일이 처음으로 하는 순서로 입사요일을 정렬 하십시오.
select name, jikwi ,hire, to_char(hire, 'day')
from member 
order by to_char(hire-1, 'd') asc;

--8. 모든 직원의 이름, 직위, 직위별 등급을 표시 하십시오. 각 직위별 등급은 아 래를 참조하십시오. 직위 직위별등급 -사장 A 부장 B 과장 C 대리 D 사원 E
select name "이름", jikwi "직위",decode(jikwi, '사장','A','부장','B','과장','C','대리','D','사원','E') "등급"
from member;

--9. 각 직원들의 이름과 연봉을 계산 하십시오. (sal*12 + bonus)
select name, sal*12 + nvl(bonus,0) "연봉"
from member;

--10. 2004년에 입사한 직원의 사번과 이름을 표시하십시오.
select name,member_id
from member
where to_char(hire,'yy')=04;

--11. 관리자가 없는 직원의 이름과 직위를 표시하십시오.
select name, jikwi
from member
where mgr is null;

--12. 보너스를 받은 직원의 이름과 급여, 보너스를 기준으로 내림차순 정렬하여 표시하십시오.
select name, sal, nvl(bonus,0)
from member
order by name, sal, nvl(bonus,0) desc;