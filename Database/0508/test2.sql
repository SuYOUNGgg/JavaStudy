select name, tel,case(substr(tel,1,instr(tel,')')-1))
when '02' then 'seoul'
when '031' then 'gyenggi'
when '051' then 'busan'
when '052' then 'ulsan'
when '055' then 'gyeongnam'
else 'etc'
end "LOC"
from student
where deptno1 =201;

select deptno, avg(nvl(sal,0)) "avg"
from emp
group by deptno;

select deptno, job, avg(nvl(sal,0)) "avg_sal"
from emp
group by deptno, job;

select deptno, job, avg(nvl(sal,0)) "avg_sal" 
from emp
group by deptno, job
order by 1,2;