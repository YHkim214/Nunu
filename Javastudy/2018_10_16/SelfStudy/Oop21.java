
public class Oop21 {
	//생성자와 클래스변수를 이용한 시리얼 넘버 붙여주기
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();

	}

}

class Document{
	String name;
	static int count = 0;;
	
	Document(){
		this("제목없음" + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}