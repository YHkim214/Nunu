
public class OperatorMain04 {

	public static void main(String[] args) {
		boolean result;
		int a = 10;
		double b = 10.5;
		result = b > a;
		System.out.println("a < b : " + result);
		
		result = b < a;
		System.out.println("a > b : " + result);
		
		result = b <= a;
		System.out.println("a >= b : " + result);
		
		result = b >= a;
		System.out.println("a <= b : " + result);
		
		result = b == a;
		System.out.println("a == b : " + result);
		
		result = b != a;
		System.out.println("a != b : " + result);
	}
}
