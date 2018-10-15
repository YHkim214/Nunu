import java.util.*;

public class SwitchMain03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("도시명입력: ");
		String city = scanner.nextLine();
		
		switch(city) { //jdk 7.0이상부터 문자열 가능
		case "서울":
			System.out.println("거주지는 서울입니다");
			break;
		case "부산":
			System.out.println("거주지는 부산입니다");
			break;
		case "광주":
			System.out.println("거주지는 광주입니다");
			break;
		default:
			System.out.println("거주지는 서울 부산 광주가 아닙니다");
		}
		
		scanner.close();
	}

}
