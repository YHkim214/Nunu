import java.util.*;

public class WhileMain03 {

	public static void main(String[] args) {
		//while문을 이용한 99단
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력: ");
		int dan = scanner.nextInt();
		int i = 1;
		
		System.out.println("*" + dan + "단*");
		System.out.println("============");
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
		
		scanner.close();

	}

}
