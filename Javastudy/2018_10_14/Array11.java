
public class Array11 {

	public static void main(String[] args) {
		//카운터
		int[] num = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 10);
			System.out.print(num[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < num.length; i++) {
			counter[num[i]]++;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d의 개수: %d\n", i, counter[i]);
		}
	}
}
