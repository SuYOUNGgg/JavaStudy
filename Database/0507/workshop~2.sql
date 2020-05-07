select substr(hire,1,2) || '-' ||
substr(hire,4,2) || '-' ||
substr(hire,7,2) hire
from member;

select replace(hire,'00','99') from member;

select round(987.654,2) "round1", round(987.654,0) "round2", round(987.654,-1) "round3"
from dual;

select trunc(987.654,2) "trunc1", trunc(987.654,0) "trunc2", trunc(987.654,-1) "trunc3"
from dual;

select mod(121,10) "mod", ceil(123.45) "ceil", floor(123.45) "floor"
from dual;

select power(2,3) from dual;

select months_between('20/09/30','20/08/31') from dual;
select months_between(sysdate,'20/02/01') from dual;
select trunc(months_between(sysdate,'20/02/01')) from dual;

select add_months(sysdate,10) from dual;

select 2 + '2' from dual;
--select 2 + 'A' from dual;

select to_char(sysdate, 'yyyy') from dual;

SELECt name,to_char(hire,'yyyy') 
from member
where to_char(hire,'yyyy')>2001;

--값이 null인 경우, 0으로 취급하는 것
select bonus from member;
select nvl(bonus,0) from member;

