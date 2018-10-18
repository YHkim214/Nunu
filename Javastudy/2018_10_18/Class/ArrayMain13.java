
public class ArrayMain13 {
	//프로그램 실행시 프로그램 외부에서 데이터를 전달받아 사용하기
	public static void main(String[] args) { // <-여기 String[] args에 값을 넣는다
		//프로그램 실행시 데이터를 전달하면 배열이 생성되고
		//main메서드의 인자인 args가 해당 배열을 가리키게 된다.
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	//코드를 한 번 실행한 후
	//마우스 오른쪽 버튼 -> Run As -> Run configuration -> ArrayMain13선택 -> Argument탭의 Program Argument창에 서울 대전 대구 부산 입력.
	//다시 프로그램을 실행하면 서울 대전 대구 부산이 출력됨.
	//공백문자를 기준으로 배열의 인자가 구분됨
	//공백문자를 인자에 포함시키고 싶다면 큰따옴표로 감싸면됨. ex) 태양의 후예 -> 인자 2개로 인식됨, "태양의 후예" -> 인자 하나로 인식됨
}
