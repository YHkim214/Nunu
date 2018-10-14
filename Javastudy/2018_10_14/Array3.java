
public class Array3 {

	public static void main(String[] args) {
		//크기가 작은 배열을 더 큰 배열로 복사하는 방법
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("변경전");
		System.out.printf("arr.length: %d\n", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
		int[] tmp = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; //arr과 tmp가 같은 배열을 가리키도록 했다.
		
		System.out.println("변경후");
		System.out.printf("arr.length: %d\n", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}

	}

}
