
public class BreakMain03 {

	public static void main(String[] args) {
		//���߹ݺ������� break�� �̿��� �ѹ��� ����������
		exit_for: 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) break exit_for;
				System.out.printf("%d, %d\n", i, j);
			}
		}
	}

}
