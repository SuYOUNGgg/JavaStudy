--1.�޿��� 14000���� 30000���̿� ���Ե��� �ʴ� ��� ������ �̸��� �޿��� ǥ�� �Ͻʽÿ�.
select name, sal 
from member
where sal <= 14000 or sal >=30000;
select name,sal
from member
where sal not between 14000 and 30000;

--2. ������ ���, �̸�, �޿��� �޿��� 20% �λ��� �޿��� ǥ�� �Ͻʽÿ�
select member_id, name, sal*1.2
from member;

--3. �� ������ �ٹ� �޼��� ǥ�� �Ͻʽÿ�.
select trunc(months_between(sysdate,hire))||'����' "�ٹ��޼�"
from member;

--4. �� ������ �ٹ� �޼��� ǥ�� �Ͻʽÿ�. ����� �Ҽ��� ��°�ڸ����� �ݿø� �մϴ�.
select round(months_between(sysdate,hire),2) ||'����' "�ٹ�����"
from member;

--5. �� ������ �̸� �޿��� ǥ�� �ϴ� ���ǹ��� �ۼ� �Ͻʽÿ�. �޿��� 10�ڸ� ���̿� ���ʿ��� #ǥ�ð� ä������ �������� ǥ�� �Ͻʽÿ�.
select name,lpad(sal,10,'#')
from member;

--6. �� ������ ���, �̸�, �Ի��ϰ� �Ի��� �Ŀ� 10���� ����� ��¥�� ǥ�� �Ͻÿ�. (�� ����� ��¥�� ����� ��YYYY-MM-DD�� �������� ǥ�� �Ͻʽÿ�)
select member_id,name,hire,to_char(add_months(hire,10),'yyyy-mm-dd') "10�� ��"
from member;

--7. member ���̺��� ����� �̸�, ����, �Ի��� �� �Ի��� ������ ǥ���ϵ� �������� ó������ �ϴ� ������ �Ի������ ���� �Ͻʽÿ�.
select name, jikwi ,hire, to_char(hire, 'day')
from member 
order by to_char(hire-1, 'd') asc;

--8. ��� ������ �̸�, ����, ������ ����� ǥ�� �Ͻʽÿ�. �� ������ ����� �� ���� �����Ͻʽÿ�. ���� ��������� -���� A ���� B ���� C �븮 D ��� E
select name "�̸�", jikwi "����",decode(jikwi, '����','A','����','B','����','C','�븮','D','���','E') "���"
from member;

--9. �� �������� �̸��� ������ ��� �Ͻʽÿ�. (sal*12 + bonus)
select name, sal*12 + nvl(bonus,0) "����"
from member;

--10. 2004�⿡ �Ի��� ������ ����� �̸��� ǥ���Ͻʽÿ�.
select name,member_id
from member
where to_char(hire,'yy')=04;

--11. �����ڰ� ���� ������ �̸��� ������ ǥ���Ͻʽÿ�.
select name, jikwi
from member
where mgr is null;

--12. ���ʽ��� ���� ������ �̸��� �޿�, ���ʽ��� �������� �������� �����Ͽ� ǥ���Ͻʽÿ�.
select name, sal, nvl(bonus,0)
from member
order by name, sal, nvl(bonus,0) desc;