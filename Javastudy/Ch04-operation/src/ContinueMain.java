
public class ContinueMain {

	public static void main(String[] args) {
		//continue�� �ݺ������� Ư�������϶� �ݺ����� �ش� ȸ���� �ǳʶ�
		for(int i = 0; i <= 10; i++) {
			if(i % 3 == 0) continue; //3�ǹ���� ��� �ش�ȸ���� �ǳ� ��
			System.out.println(i);
		}
	}

}
