
public class ArrayMain12 {

	public static void main(String[] args) {
		
		//�迭����, ����, �ʱ�ȭ
		int[] array = {10, 20, 30, 40, 50};
		
		//�ݺ����� �̿������

		for (int i = 0; i < array.length; i++) {
			System.out.println(i + ":" +array[i]);
		}
		System.out.println("===============");
		
		//������ ����(Ȯ�� for��)
		//������ �迭�� ù �ε������� ������ �ε������� ���������� ȣ���ؼ� �迭�� ��Ҹ� ������ ������ ������
		//     ����         �迭
		for (int n : array) { //n�� array�迭�� ��Ұ� '����'��� �����
			System.out.println(n);
		}
		
		System.out.println("===============");
		
		String[] array2 = {"�ູ", "����", "����", "����", "����"};
		
		for(String str: array2) {
			System.out.println(str);
		}
	}
}
