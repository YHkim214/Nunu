
public class OperatorMain06 {

	public static void main(String[] args) {
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
		
		System.out.println(a + "," + b);
		System.out.println(c);
	}

}
