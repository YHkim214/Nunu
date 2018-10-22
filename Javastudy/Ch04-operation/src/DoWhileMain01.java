
public class DoWhileMain01 {

	public static void main(String[] args) {
		int su = 0;
		String str = "Hello Java!";
		
		while(su++ < 5){//선 비교 후 처리
			System.out.println(str);
		}
		
		System.out.println("================");
		
		su = 0;//선 처리 후 비교
		do {
			System.out.println(str);
		} while(su++ < 5);
	}

}
