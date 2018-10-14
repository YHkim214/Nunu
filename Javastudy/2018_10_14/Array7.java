public class Array7 {

	public static void main(String[] args) {
		//섞기
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];//인자의 첫번째 인덱스의 값과 랜덤한 인덱스의 값을 바꿔준다.
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}

}
