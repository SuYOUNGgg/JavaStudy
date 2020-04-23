package Workshop2;

class BBSItem {
	static int n=1;
	int seqNo; 			//일련번호 필드
	String writer; 			//작성자 필드
	String writtenDate;			//작성일자 필드
	String title;			//제목필드
	String content;			//내용필드
	BBSItem(String writer, String writtenDate, 
			String title, String content){//생성자
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
//	int seqNo; 			//일련번호 필드
//	String writer; 			//작성자 필드
//	String writtenDate;			//작성일자 필드
//	String title;			//제목필드
//	String content;			//내용필드
//	BBSItem(int seqNo, String writer, String writtenDate, 
//			String title, String content){//생성자
//		this.seqNo=seqNo;
//		this.writer=writer;
//		this.writtenDate=writtenDate;
//		this.title=title;
//		this.content=content;
//	}
//}
//일련번호에 해당하는 seqNo 필드의 값을 생성자 파라미터로 받는 것이 아니라, 
//새로운 객체가 생성될 때마다 자동으로 붙여지게 하려고 한다. 처음으로 생성되는 BBSItem객체에는 1, 두번째로 생성되는 BBSItem 객체에는 2, 이런 식으로 일련번호가 붙여지도록 이 클래스르 수정하여라.

