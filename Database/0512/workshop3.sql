select s.member_id, s.name
from member s, dept t
where s.dept_id = t.dept_id
and dept_name = '�ѹ���';

select member_id, name
from member where dept_id = (select dept_id from dept where dept_name ='�ѹ���');

select member_id, name from member
where dept_id in (10,20,30);

select dept_id from dept where dept_name in('�ѹ���','������');

select member_id, name from member
where dept_id in (select dept_id from dept where dept_name in ('�ѹ���','������'));
--exists���� ����
select * from member where dept_id = (select dept_id from dept where dept_name = '�ѹ���');
select * from member 
where exists (select dept_id from dept where dept_name = '�ѹ���');
select * from member 
where exists (select dept_id from dept where dept_name = '�ѹ���2');
select * from dept;

select * from member where exists (select * from dept where dept_id = member.dept_id);
select * from member;

