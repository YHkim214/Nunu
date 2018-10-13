import java.util.*;

public class DoWhileLoop {
	//자주 쓰이지는 않는다는 반복문 do-while
	//do-while을 이용해 만든 숫자 맞추기 게임
	public static void main(String[] args) {
		int guess = 0, answer = 0;
		
		Random rand = new Random();
		answer = rand.nextInt(100) + 1; //Random 클래스를 이용한 1-100까지의 난수 생성
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("1과 100사이의 정수를 입력해보세요.");
			guess = scanner.nextInt();
			
			if(guess > answer) {
				System.out.println("너무 큽니다.");
			}else if(guess < answer) {
				System.out.println("너무 작습니다.");
			}
		} while(guess != answer);
		
		scanner.close();
		
		System.out.println("정답입니다!");

	}

}
