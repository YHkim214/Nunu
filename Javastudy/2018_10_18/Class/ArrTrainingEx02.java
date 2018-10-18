import java.util.*;

public class ArrTrainingEx02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력: ");
		int dan = scanner.nextInt();
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = dan * (i + 1);
			System.out.printf("%d * %d = %d\n", dan, i + 1 , arr[i]);
		}
		
		scanner.close();
	}
}
