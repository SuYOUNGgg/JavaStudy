package Workshop2;

class BBSItem {
	static int n=1;
	int seqNo; 			//�Ϸù�ȣ �ʵ�
	String writer; 			//�ۼ��� �ʵ�
	String writtenDate;			//�ۼ����� �ʵ�
	String title;			//�����ʵ�
	String content;			//�����ʵ�
	BBSItem(String writer, String writtenDate, 
			String title, String content){//������
		this.seqNo=n;
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
		
		n++;
		System.out.println(seqNo);
	}
}
public class WS3 {

	public static void main(String[] args) {
		BBSItem b1 = new BBSItem("","","","");
		BBSItem b2 = new BBSItem("","","","");
		

	}

}
//public class BBSItem {
//	int seqNo; 			//�Ϸù�ȣ �ʵ�
//	String writer; 			//�ۼ��� �ʵ�
//	String writtenDate;			//�ۼ����� �ʵ�
//	String title;			//�����ʵ�
//	String content;			//�����ʵ�
//	BBSItem(int seqNo, String writer, String writtenDate, 
//			String title, String content){//������
//		this.seqNo=seqNo;
//		this.writer=writer;
//		this.writtenDate=writtenDate;
//		this.title=title;
//		this.content=content;
//	}
//}
//�Ϸù�ȣ�� �ش��ϴ� seqNo �ʵ��� ���� ������ �Ķ���ͷ� �޴� ���� �ƴ϶�, 
//���ο� ��ü�� ������ ������ �ڵ����� �ٿ����� �Ϸ��� �Ѵ�. ó������ �����Ǵ� BBSItem��ü���� 1, �ι�°�� �����Ǵ� BBSItem ��ü���� 2, �̷� ������ �Ϸù�ȣ�� �ٿ������� �� Ŭ������ �����Ͽ���.

