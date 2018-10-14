import java.util.*;

public class Array2 {

	public static void main(String[] args) {
	
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;//1부터 10까지의 난수 생성
		}
		
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] +",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));//배열을 통째로 출력하는 방법
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}

}
