
public class IfMain05 {

	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		
		if(a == b) { //a가 float으로 자동형변환
			System.out.println("10과 10.0f는 같다.");
		}
		
		char c = '0';//c가 int로 자동형변환
		int d = 0;
		
		if(c != d) {
			System.out.println("'0'과 0은 같지않다.");
		}
		
		char e = 'A';
		int f = 65;
		
		if(e == f) {
			System.out.println("'A'와 65는 서로 같다.");
		}
	}

}
