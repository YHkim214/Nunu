
public class TrainingEx03 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 배열의 요소 중 제일 큰값, 두번째 큰값 구하기
		 * 입력값: 10, 30, 50, 7, 88, 22
		 * 첫번쨰 큰값: 88
		 * 두번째 큰값: 50
		*/
		int[] array = {10, 30, 50, 7, 88, 59};
		int first = array[0];
		int second = array[0];
		
		//조건체크
		for (int i = 1; i < array.length; i++) {
			if(first < array[i]) {
				second = first;
				first = array[i];
			}
			if(second < array[i] && array[i] < first) {
				second = array[i];
			}
		}
		
		//출력
		System.out.println("첫번째 큰 값: " + first);
		System.out.println("첫번째 큰 값: " + second);
		
		
	}

}
