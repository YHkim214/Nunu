
public class AdvencedForloop {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		//���� �߰��� for �ݺ���. �迭 �Ǵ� �÷����� ��Ҹ� ������� �ϳ��� �о ������ �����Ѵ�.
		for(int tmp: arr) { 
			sum += tmp;
			System.out.printf("%d ", tmp);
		}
		System.out.println();
		System.out.println(sum);
	}

}
