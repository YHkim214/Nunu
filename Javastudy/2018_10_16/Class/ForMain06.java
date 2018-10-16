
public class ForMain06 {

	public static void main(String[] args) {
		//99단 출력예제2
		for(int i = 2; i <= 9; i++) { //2중 for문
			System.out.println("*" + i + "단*");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

}
