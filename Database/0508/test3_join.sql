--JOIN
select * from dept,member;

select dept.dept_name, member.name
from dept, member
where dept.dept_id= member.dept_id;

select t.dept_name, s.name 
from member s, dept t
where s.dept_id = t.dept_id;
--�������� ������, �ؿ����� ȣȯ���� �� ����.
select t.dept_name, s.name
from member s join dept t
on s.dept_id = t.dept_id;
--���� �������� join�� ��
select s.dept_name, t.name 
from dept s left outer join member t 
on s.dept_id =  t.dept_id;
--������ �������� join�� ��
select s.dept_name, t.name 
from dept s right outer join member t 
on s.dept_id =  t.dept_id;

--�����Ͱ� ���� �ʿ� +ǥ�ø� ���ش�.
select s.dept_name, t.name
from dept s, member t
where s.dept_id = t.dept_id(+);

--�μ��� '�ѹ���'�� ����� �̸��� ����Ͻÿ�.
select s.dept_name, t.name
from dept s, member t
where s.dept_id = t.dept_id
and s.dept_name = '�ѹ���';
--mgr�� ���� ����� ǥ���ϰ� ���� �� ���� ���̺��� �����ϴ� ���� �̿��Ѵ�.
select s.name, t.name 
from member s, member t
where s.member_id=t.mgr(+);
