
public class ArrayMain12 {

	public static void main(String[] args) {
		
		//배열선언, 생성, 초기화
		int[] array = {10, 20, 30, 40, 50};
		
		//반복문을 이용한출력

		for (int i = 0; i < array.length; i++) {
			System.out.println(i + ":" +array[i]);
		}
		System.out.println("===============");
		
		//개선된 루프(확장 for문)
		//지정한 배열의 첫 인덱스부터 마지막 인덱스까지 내부적으로 호출해서 배열의 요소를 지정한 변수에 저장함
		//     변수         배열
		for (int n : array) { //n에 array배열의 요소가 '순서'대로 저장됨
			System.out.println(n);
		}
		
		System.out.println("===============");
		
		String[] array2 = {"행복", "나라", "여행", "여름", "가을"};
		
		for(String str: array2) {
			System.out.println(str);
		}
	}
}
