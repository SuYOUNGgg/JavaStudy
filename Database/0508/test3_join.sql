--JOIN
select * from dept,member;

select dept.dept_name, member.name
from dept, member
where dept.dept_id= member.dept_id;

select t.dept_name, s.name 
from member s, dept t
where s.dept_id = t.dept_id;
--위에꺼와 같지만, 밑에꺼가 호환성이 더 좋다.
select t.dept_name, s.name
from member s join dept t
on s.dept_id = t.dept_id;
--왼쪽 기준으로 join할 때
select s.dept_name, t.name 
from dept s left outer join member t 
on s.dept_id =  t.dept_id;
--오른쪽 기준으로 join할 때
select s.dept_name, t.name 
from dept s right outer join member t 
on s.dept_id =  t.dept_id;

--데이터가 없는 쪽에 +표시를 해준다.
select s.dept_name, t.name
from dept s, member t
where s.dept_id = t.dept_id(+);

--부서가 '총무부'인 사원의 이름을 출력하시오.
select s.dept_name, t.name
from dept s, member t
where s.dept_id = t.dept_id
and s.dept_name = '총무부';
--mgr이 없는 사람도 표시하고 싶을 때 같은 테이블끼리 조인하는 것을 이용한다.
select s.name, t.name 
from member s, member t
where s.member_id=t.mgr(+);
