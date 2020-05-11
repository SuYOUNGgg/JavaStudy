//Q1
--�ֹ���ȣ ��19971213���� ���Ͽ� �ֹ���ȣ, �ֹ�����, ��ǰ��ȣ, �ֹ������� �ֹ������� ������������ ��ȸ�ϼ���
select ord_no , line_no ,item_no ,ord_qty 
from po_order_detail
where ord_no = '19971213'
order by ord_qty;

//Q2
--1997�� 12���� ����ó ��LG���ڡ��� �ֹ��� ��� �ǿ� ���� �ֹ���ȣ�� �ֹ��� (YYYY-MM-DD ��������) �� �ֹ� ���� ������������ ��ȸ�ϼ���
select a.ord_no, to_char(a.ord_date,'yyyy-mm-dd')
from po_order_header a, po_supplier b
where a.sup_no=b.sup_no
and b.sup_name = 'LG����'
and to_char(a.ord_date,'yyyymm') =199712
order by a.ord_date desc; 

//Q3
--�ֹ���ȣ�� ��19971203���� �ֹ��� ���� �ֹ���ȣ, ��ǰ��ȣ, ��ǰ��, ��ǰ�� �ֹ����� �� ��ǰ��ȣ�� ������������ ��ȸ�ϼ���. 
select a.ord_no,a.item_no,b.item_name,a.ord_qty
from po_order_detail a, po_item b
where a.item_no=b.item_no
and a.ord_no ='19971203'
order by a.item_no;

//Q4
--���Ⱑ �������� ��ǰ�� �Ϸ���� ���� ��� �ֹ��� ���Ͽ� �ֹ���ȣ�� ����ó �̸�, ��ȭ��ȣ�� ����ó �̸��� ������������ ��ȸ�ϼ���.
select a.ord_no,b.sup_name,b.sup_phone
from po_order_header a,po_supplier b
where to_char(a.due_date,'yyyymmdd') < to_char(sysdate,'yyyymmdd')
and a.delv_date is null
and a.sup_no=b.sup_no
order by b.sup_name;

//Q5
--����������, ����������, ��ȫ���Ρ� ������ �� �μ����� ����� ���� ���� ����� �μ���� �����ȣ�� ��ȸ�ϼ���
select emp_dep,min(emp_no)
from po_employeer
group by emp_dep
order by emp_dep;

//Q6
--��ȫ���Ρ��� ������ȣ�� ������ 1997�⿡ �ֹ��� �� ����ó�� �̸��� ����ó�� �ּҸ� ����ó �̸��� ������������ �ߺ����� �ʰ� ��ȸ�ϼ���.
select distinct a.sup_name, a.sup_addr
from po_supplier a, po_employeer b, po_order_header c
where b.emp_name = '����ȣ'
and b.emp_dep= 'ȫ����'
and a.sup_no=c.sup_no
and c.ord_emp=b.emp_no
and to_char(c.ord_date,'yyyy')='1997';

//Q7
-- ����ó ��LG���ڡ� �κ��� 1997�� 12���� ��ǰ���� ��ǰ�� ���� �� ���� ��� ��,  �� ��ǰ ���Ҵ��( �� ��ǰ�ܰ� * ��ǰ �ֹ����� ) �� ������ ���ϴ� SQL���� �ۼ��ϼ���.
select sum(a.unit_price*d.ord_qty) "�� ���� ���"
from po_item a, po_order_header b, po_supplier c,po_order_detail d
where b.ord_no = d.ord_no
and d.item_no = a.item_no
and to_char(b.delv_date,'yyyymm')='199712'
and c.sup_no=b.sup_no
and c.sup_name='LG����';


//Q8
--���⸦ �� ��Ű�� �ʴ� �ҷ� �����ڸ� �ľ��ϱ� ���� �����ں��� ���� �� �ؼ� Ƚ��( ��ǰ�� ���� �ȵ� ���� ����) �� 2�� �̻��� ����ó�� ����ó ��ȣ�� ���� ���ؼ� Ƚ���� ��ȸ�ϼ���. 
select sup_no "����ó ��ȣ",count(sup_no) "���� ���ؼ� Ƚ��"
from po_order_header
where due_date<delv_date
group by sup_no
having count(sup_no)>=2 ;

//Q9
--1997�⿡ �ֹ��� ��ǰ�� �ܰ� �߿� ���� ���� �ܰ��� ��ȸ�ϼ���.
select max(b.unit_price)
from po_order_header a,po_item b,po_order_detail c
where to_char(a.ord_date,'yyyy')='1997'
and a.ord_no = c.ord_no
and c.item_no=b.item_no;