package com.test2;


class BBSItem1 {
		static int seqNo; 		//�Ϸù�ȣ �ʵ�
		String writer; 			//�ۼ��� �ʵ�
		String writtenDate;			//�ۼ����� �ʵ�
		String title;			//�����ʵ�
		String content;			//�����ʵ�
		BBSItem1(String writer, String writtenDate, 
				String title, String content){//������
			this.seqNo=seqNo;
			this.writer=writer;
			this.writtenDate=writtenDate;
			this.title=title;
			this.content=content;
			seqNo++;
			System.out.println(seqNo);
		}
	}

//�Ϸù�ȣ�� �ش��ϴ� seqNo �ʵ��� ���� ������ �Ķ���ͷ� �޴� ���� �ƴ϶�, ���ο� ��ü�� ������ ������ �ڵ����� �ٿ����� �Ϸ��� �Ѵ�. 
//ó������ �����Ǵ� BBSItem��ü���� 1, �ι�°�� �����Ǵ� BBSItem ��ü���� 2, �̷� ������ �Ϸù�ȣ�� �ٿ������� �� Ŭ������ �����Ͽ���.

public class BBSItem {
	public static void main(String[] args) {	
		BBSItem1 b1  = new BBSItem1("","","","");
		BBSItem1 b2  = new BBSItem1("","","","");
		BBSItem1 b3  = new BBSItem1("","","","");
	}
}