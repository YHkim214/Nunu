
public class PrintMain02 {

	public static void main(String[] args) {
		
		//System.out.printf(포멧문자,데이터)를 이용한 출력. 숫자출력에 강점을 가진다
		
		System.out.printf("%c\n", 'A'); //문자 %c
		System.out.printf("%2c\n", 'B');//오른쪽 정렬
		System.out.printf("%-2c%c\n", 'B', 'C');//왼쪽정렬
		
		System.out.println("============");
		
		System.out.printf("%d\n", 67); //정수 %d
		System.out.printf("%,d원\n", 10000000);// 3자리단위로 쉼표표시 신박하네
		System.out.printf("%4d\n", 20);
		System.out.printf("%-4d%d\n", 20, 10);
		
		System.out.println("============");
		
		System.out.printf("%f\n", 35.356); //실수 %f
		System.out.printf("%.3f\n", 35.356);
		
		System.out.println("============");
		
		System.out.printf("%s\n", "누누"); //문자열 %s
		
		System.out.println("============");
		
		System.out.printf("%b\n", true); //불리언 %b
		
		System.out.printf("%s는 %d입니다", "점수", 98);
	}

}