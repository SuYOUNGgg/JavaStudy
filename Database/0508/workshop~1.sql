--1. ��� ������ �޿� �Ѿ�, �޿� ���, �ְ� �޿�, �ּ� �޿��� ǥ�� �Ͻʽÿ�.
select sum(sal) "�޿� �Ѿ�", avg(sal) "�޿� ���", max(sal) "�ְ� �޿�", min(sal) "�ּ� �޿�"
from member;

--2. ������ ������ ������ ���� ǥ�� �Ͻʽÿ�.
select jikwi, count(*) 
from member
group by jikwi;

--3. ������ �߿��� �������� ���� ǥ�� �Ͻʽÿ�.
select count(distinct mgr) "�������� ��"
from member;

--4. �� ���� ���� ���ϰ� 2000, 2001, 2002, 2003�⿡ �Ի��� ���� ���� ǥ���Ͻ� �ÿ�.
select count(*) "�� ���� ��", count(decode(to_char(hire,'yyyy'),'2000',1)) "2000��"
    ,count(decode(to_char(hire,'yyyy'),'2001',1)) "2001��"
    ,count(decode(to_char(hire,'yyyy'),'2002',1)) "2002��"
    ,count(decode(to_char(hire,'yyyy'),'2003',1)) "2003��"from member;

--5. ���޵� ���ʽ��� ��հ��� ���Ͻʽÿ�. (���ʽ��� ���� ���� 0���� ������ ����)
select avg(nvl(bonus,0))
from member;

--6. �ְ� �޿��� 10000���� �Ѵ� �μ���ȣ�� ��ձ޿��� ǥ�� �Ͻʽÿ�.
select dept_id,avg(sal)
from member
group by dept_id
having max(sal)>10000;

--7. ������ �μ����� �ٹ��ϴ� ��� ������ �̸�, ����, �μ���ȣ, �μ��̸��� ǥ�� �Ͻʽÿ�.
select s.name, s.jikwi,s.dept_id,t.dept_name
from member s, dept t
where s.dept_id=t.dept_id
and t.dept_name = '������';

--8. ������ �̸�, ���, ������ �̸�, ����� ǥ�� �Ͻʽÿ�.
select s.name,s.member_id, t.name, t.member_id
from member s, member t
where t.member_id =s.mgr;

--9. �����ڰ� �������� ���� ������ �����Ͽ� ������ �̸�, ���, ������ �̸�, �������� ����� ǥ�� �Ͻʽÿ�.(�����ڰ� �������� ���� ��� �������� �̸��� ����� ������������ ǥ���ϼ���)
select s.name,s.member_id, NVL(t.name,'����'), NVL(TO_CHAR(t.member_id),'����')
from member s, member t
where t.member_id(+) =s.mgr;

--10. ������ ���� ���� �Ի��� ��� ������ �̸�, �Ի���, ������ �̸�, ������ �Ի����� ǥ�� �Ͻʽÿ�.
select s.name,s.hire,t.name,t.hire
from member s, member t
where t.member_id =s.mgr(+)
and s.hire<t.hire;

--11. ���ʽ��� �޴� ������ �̸�, �μ� ��ȣ, �μ� �̸��� ǥ�� �Ͻʽÿ�.
select s.name,s.dept_id, t.dept_name
from member s, dept t
where s.dept_id = t.dept_id
and s.bonus !=0;