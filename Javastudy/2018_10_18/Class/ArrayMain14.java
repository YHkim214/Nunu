
public class ArrayMain14 {
	//프로그램 실행시 외부에서 2개의 정수를 입력받아서 연산
	public static void main(String[] args) {
//		int result = args[0] + args[1] - >자료형이 맞지 않기 때문에 에러가 난다.
		//args의 자료형은 문자열이기 때문에 자료형을 int로 바꿔줘야한다.
						//String -> int
		int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(result);
		
	}
}
