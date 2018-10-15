
public class OperatorMain08 {

	public static void main(String[] args) {
		//최대 최소구하기
		int a = 5, b = 10;
		int max;//최대값
		int min;
		
		max = a > b ? a : b;
		min = a > b ? b : a;
		
		System.out.printf("max: %d\n", max);
		System.out.printf("min: %d", min);
	}

}
