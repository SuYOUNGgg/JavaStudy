--1. Ȳ���ư� ������ �μ��� ���� ����� �̸��� �Ի���, �޿��� ǥ�� �Ͻʽÿ�.
select name , hire, sal 
from member 
where dept_id = (select dept_id from member where name='Ȳ����');

--2. �޿��� ��ձ޿� ���� ���� ����� ���, �̸��� ǥ�� �Ͻʽÿ�.

--3. �ְ��� ��� �޿��� �����ϴ� �μ� ��ȣ�� ��� �޿��� ǥ�� �Ͻʽÿ�.


--4. �������� ���� �ϴ� ��� ����� �̸��� �޿��� ǥ�� �Ͻʽÿ�.
select name,sal
from member
where mgr=(select member_id from member where name = '����');

--5. ������ �μ��� ��� ����� ���, �̸�, �μ���ȣ, ������ ǥ�� �Ͻʽÿ�.
select member_id, name, dept_id, jikwi
from member
where dept_id = (select dept_id from dept where dept_name = '������');

--6. ���������� �ִ� ��� ����� ǥ�� �Ͻʽÿ�.
select name
from member
where member_id in( select mgr from member where mgr is not null);

select name 
from member
where exists ( select mgr from member where mgr is not null);


