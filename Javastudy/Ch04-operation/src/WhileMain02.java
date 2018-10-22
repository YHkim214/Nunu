
public class WhileMain02 {

	public static void main(String[] args) {
		//while문 기초2
		int sum = 0, su = 1;
		
		while(su <= 100) {
			sum += su;
			su++;
		}
		System.out.println("1부터 100까지의 합: " + sum);
	}

}
