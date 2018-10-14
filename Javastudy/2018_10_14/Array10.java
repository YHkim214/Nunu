
public class Array10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		//버블소트
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		
		System.out.println();
		
		for(int i = 0; i < numArr.length - 1; i++) {
			boolean change = false;
			
			for(int j = 0; j < numArr.length -1 -i; j++) {//j번째 인자와 그 옆의 인자의 값을 비교한다. j번째 인자가 더 크면 바꾼다. 이런식으로하면 맨 뒤에 제일 큰 값이 오게된다.
				if(numArr[j] > numArr[j + 1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
					change = true;
				}
			}
			
			if(!change) break; //변경된것이 없다면 반복문을 빠져나온다.
			
			for(int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}
	
}
