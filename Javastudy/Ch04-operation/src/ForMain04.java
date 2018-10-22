
public class ForMain04 {
	public static void main(String[] args) {
		//for문 기초활용 4
		int sum = 0, total =  0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1부터 100까지의 합: " + sum);
		System.out.println("==============");
		for(int i = 1; i <= 100; i++) {//짝수 누적합
			if(i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합: " + total);
	}
}
