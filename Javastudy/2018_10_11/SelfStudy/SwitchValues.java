
public class SwitchValues {

	public static void main(String[] args) {
	
		int a = 10, b = 20, tmp = 0;
		
		System.out.println("a = " + a + ", b = " + b);
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("a = " + a + ", b = " + b);
	}

}
