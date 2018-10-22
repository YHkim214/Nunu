
public class OperatorMain06 {

	public static void main(String[] args) {
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++; //&&는 선조건이 false면 후조건안봄.  ||는 선조건이 true면 후조건안봄.
		
		System.out.println(a + "," + b);
		System.out.println(c);
		
		System.out.println("==========");
		
		int d, e;
		d = e = 10;
		
		boolean f = ++d < e++ || d++ >= ++e;
		
		System.out.println(d + "," + e);
		System.out.println(f);
		
	}

}
