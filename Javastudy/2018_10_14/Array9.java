import java.util.*;

public class Array9 {

	public static void main(String[] args) {
		//배열을 랜덤한 불연속적인 값으로 채우기
		int[] code = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
