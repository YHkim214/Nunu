import java.util.*;

public class Array13 {
	//�������
	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1; //1���� 25������ ���ڸ� �Է�
			}
		}
		
		for(int i = 0; i < SIZE; i++) { //�迭�� �����Ѵ�
			for(int j =0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i = 0; i < SIZE; i++) {//�迭�� ���
				for(int j =0; j < SIZE; j++) {
					System.out.printf(" %2d", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1���� %d������ ���ڸ� �Է��ϼ���(����� 0)>", SIZE * SIZE);
			num = scanner.nextInt();
			
			outer: 
			for(int i = 0; i < SIZE; i++) { //�Է¹��� ���ڸ� �迭���� �˻��� ������ �� ��ǥ�� ���� 0���� �ٲ۴�.
				for(int j =0; j < SIZE; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
					if(num == 0) break outer; //label break�� 2�� �ݺ����� �������´�.
					}
				}
			}
		} while(num != 0);
	}
}
