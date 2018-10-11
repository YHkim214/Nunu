
public class TrainingEx02 {

	public static double add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double average(int a, int b, int c) {
		return add(a, b, c)/3;
	}
	
	public static void main(String[] args) {
		
		//철수성적표 출력하기
		
		System.out.println("성적표");
		System.out.println("===========");
		System.out.println("이름: 철수");
		System.out.println("국어: " + 89);
		System.out.println("영어: " + 70);
		System.out.println("수학: " + 95);
		System.out.println("총점: " + add(89,70,95));
		System.out.printf("평균: %.2f\n", average(89,70,95));
		System.out.println("총과여부 : " + true);
		
		
	}

}
