import java.util.Arrays;

public class ArrayMain10 {

	public static void main(String[] args) {

		char[] array = {'z', 'c', 'e', 'a', 'q'};

		Arrays.sort(array); //�������� ����

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int[] array2 = {89, 39, 5, 2, 1, 6, 0};

		Arrays.sort(array2);		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");	
		}
		System.out.println();

		String[] array3 = {"java", "android", "jsp", "oracle", "java", "javascript"};

		Arrays.sort(array3);		
		for(int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();

		String[] array4 = {"�ڹ�", "�ȵ���̵�", "���̿�����", "����Ŭ", "�ڹ�", "�ڹٽ�ũ��Ʈ"};

		Arrays.sort(array4);		
		for(int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println();
	}
}
