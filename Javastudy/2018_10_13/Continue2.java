import java.util.*;

public class Continue2 {
	
	public static void main(String[] args) {
		//continue와 break label문을 이용한 계산대행 프로그램이다.
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Outer: while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴를 선택하세요.(종료:0):");
			
			menu = scanner.nextInt();
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("유효하지 않은 메뉴입니다. 다시 선택해 주세요");
				continue; //반복문의 처음으로 돌아간다.
			}
			
			for(;;) {
				System.out.printf("숫자를 입력해 주세요.(계산종료: 0, 전체종료: 99):");
				num = scanner.nextInt();
				
				if(num == 0) break; //for문을 빠져나온다. break문은 한단계의 반복문만 빠져나올 수 있다.
				
				if(num == 99) {
					System.out.println("프로그램을 종료합니다.");
					break Outer; //전체 반복문을 빠져 나온다.
				}
				
				switch(menu) {
				case 1:
					System.out.println("result = " + num * num);
					break;
				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break; //math 클래스를 이용한 계산
				case 3: System.out.println("result = " + Math.log(num));
					break;
				}
			}
		}
		
		scanner.close();
	}
}
