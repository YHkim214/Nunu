
public class Array10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		//�����Ʈ
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		
		System.out.println();
		
		for(int i = 0; i < numArr.length - 1; i++) {
			boolean change = false;
			
			for(int j = 0; j < numArr.length -1 -i; j++) {//j��° ���ڿ� �� ���� ������ ���� ���Ѵ�. j��° ���ڰ� �� ũ�� �ٲ۴�. �̷��������ϸ� �� �ڿ� ���� ū ���� ���Եȴ�.
				if(numArr[j] > numArr[j + 1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tmp;
					change = true;
				}
			}
			
			if(!change) break; //����Ȱ��� ���ٸ� �ݺ����� �������´�.
			
			for(int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	}
	
}
