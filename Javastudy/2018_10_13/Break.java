
public class Break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) break;//조건을 만족하면 요기서 반복문을 빠져 나온다.
			i++;
			sum += i;
		}
		
		System.out.printf("sum = %d", sum);

	}

}
