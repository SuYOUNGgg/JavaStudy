select dept_name,decode(loc_id,100,'Incheon')
from dept;
--decode�Լ��� �ڹ��� switch�� �����.

select dept_name, decode(loc_id,100,'Incheon',200,'Seoul',300,'Busan','etc') 
from dept;

select dept_name, case loc_id
when 100 then 'Incheon'
when 200 then 'Seoul'
when 300 then 'Busan'
end
from dept;

--GROUP�Լ�
select count(*) from member;
select avg(sal) from member;
select count(*), avg(sal), max(sal), min(sal), sum(sal) from member;
--null���� ī��Ʈ���� �ʱ� ������ nvl�� ��ȯ�� �� ī��Ʈ�ؾ��Ѵ�.
select count(nvl(bonus,0)),count(bonus) from member;
--group by�� �÷��� �������� ��� �Ѵ�.
select dept_id,jikwi, count(*),avg(sal),max(sal), min(sal),sum(sal) from member
group by dept_id, jikwi;





