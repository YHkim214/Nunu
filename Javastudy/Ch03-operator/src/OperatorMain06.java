
public class OperatorMain06 {

	public static void main(String[] args) {
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++; //&&�� �������� false�� �����ǾȺ�.  ||�� �������� true�� �����ǾȺ�.
		
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
