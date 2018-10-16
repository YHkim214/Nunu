
public class Oop20 {

	public static void main(String[] args) {
		//인스턴스 초기화블럭을 이용해 시리얼 번호를 입력
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("p1의 제품번호: "+ p1.serialNo);
		System.out.println("p2의 제품번호: "+ p2.serialNo);
		System.out.println("p3의 제품번호: "+ p3.serialNo);
		System.out.println("p4의 제품번호: "+ p4.serialNo);
		System.out.println("생산된 제품수는 모두"+ Product.count+"개 입니다.");
	}

}

class Product{
	static int count = 0;
	int serialNo;
	
	{
		serialNo = count;//인스턴스가 생성될 때마다 시리얼 넘버에 카운트가 대입되고 카운트는 1 증가한다
		count++;
	}
}
