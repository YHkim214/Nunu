
public class Oop19 {
	//초기화블럭 테스트
	static int[] arr = new int[10];
	
	static { //명시적 초기화를 통해 배열 arr을 생성했고, 초기화블럭을 통해서 배열에 임의의숫자를 채웠다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
	}

	
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}
}
