
public class OperatorMain07 {

	public static void main(String[] args) {
		int x = 10;
		int y = -10;
		
		int absX = x >= 0 ? x : -x;
		int absY = y >= 0 ? y : -y;
		
		System.out.println("x의 절대값: " + absX);
		System.out.println("y의 절대값: " + absY);
	}

}
