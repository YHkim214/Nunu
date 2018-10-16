
public class ForMain01 {
	public static void main(String[] args) {
		//for문 기초활용.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("========");
		
		for(int i = 1; i <= 5; i++)//수행문이 한 줄일때는 블럭 생략가능. 근데 안하는게 좋음.
			System.out.println(i);
		System.out.println("프로그램 끝!");
	}
}
