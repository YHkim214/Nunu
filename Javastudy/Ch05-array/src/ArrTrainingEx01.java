
public class ArrTrainingEx01 {

	public static void main(String[] args) {
//		10,20,30,40,50을 초기값으로 가지는 배열 선언 생성 초기화
//		위 배열을 반복문을 이용해 출력
//		인덱스 3의 데이터를 10으로 변경
//		마지막 요소의 값을 200으로 변경
//		반복문을 이용해 모든 원소의 값을 0으로 변경
//		홀수 인덱스에 10, 짝수 인덱스에 20저장

		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) { //1
			arr[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i < arr.length; i++) { //2
			System.out.println(arr[i]);
		}
		
		arr[3] = 100; //3
		
		arr[arr.length - 1] = 200; //4
		
		for(int i = 0; i < arr.length; i++) { //5
			arr[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) { //6
			if(i % 2 == 0) {
				arr[i] = 20;
			}else {
				arr[i] = 10;
			}
		}
	}

}
