
public class Oop7 {

	public static void main(String[] args) {
		//�޼ҵ� ȣ�� ����
		System.out.println("main(String[] args)�� ���۵Ǿ���");
		firstMethod();	
		System.out.println("main(String[] args)�� ������");
	}
	
	static void firstMethod(){
		System.out.println("firstMethod�� ���۵Ǿ���");
		secondMethod();
		System.out.println("firstMethod�� ������");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod�� ���۵Ǿ���");
		System.out.println("secondMethod�� ������");
	}

}
