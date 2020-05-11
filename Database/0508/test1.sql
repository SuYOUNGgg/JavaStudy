select dept_name,decode(loc_id,100,'Incheon')
from dept;
--decode함수는 자바의 switch와 비슷함.

select dept_name, decode(loc_id,100,'Incheon',200,'Seoul',300,'Busan','etc') 
from dept;

select dept_name, case loc_id
when 100 then 'Incheon'
when 200 then 'Seoul'
when 300 then 'Busan'
end
from dept;

--GROUP함수
select count(*) from member;
select avg(sal) from member;
select count(*), avg(sal), max(sal), min(sal), sum(sal) from member;
--null값은 카운트되지 않기 때문에 nvl로 변환한 뒤 카운트해야한다.
select count(nvl(bonus,0)),count(bonus) from member;
--group by의 컬럼을 기준으로 계산 한다.
select dept_id,jikwi, count(*),avg(sal),max(sal), min(sal),sum(sal) from member
group by dept_id, jikwi;





