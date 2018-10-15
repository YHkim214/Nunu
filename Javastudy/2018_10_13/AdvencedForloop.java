
public class AdvencedForloop {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		//새로 추가된 for 반복문. 배열 또는 컬렉션의 요소를 순서대로 하나씩 읽어서 변수에 저장한다.
		for(int tmp: arr) { 
			sum += tmp;
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		System.out.println(sum);
	}

}
