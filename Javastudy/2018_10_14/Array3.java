
public class Array3 {

	public static void main(String[] args) {
		//ũ�Ⱑ ���� �迭�� �� ū �迭�� �����ϴ� ���
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("������");
		System.out.printf("arr.length: %d\n", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}
		
		int[] tmp = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; //arr�� tmp�� ���� �迭�� ����Ű���� �ߴ�.
		
		System.out.println("������");
		System.out.printf("arr.length: %d\n", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d\n", i, arr[i]);
		}

	}

}
