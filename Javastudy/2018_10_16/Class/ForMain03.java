
public class ForMain03 {
	public static void main(String[] args) {
		//for문 기초활용3
		int total = 0;
		for(int i = 1; i <= 5; i++) { //누적합 구하기
			total += i;
			System.out.printf("1부터 %d까지의 자연수의 합: %d\n", i, total);
		}
	}
}
