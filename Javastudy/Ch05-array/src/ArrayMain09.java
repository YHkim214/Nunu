import java.util.*;

public class ArrayMain09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 3;
		
		String[] subname = {"����", "����", "����"};
		int[][] sub = new int[num][subname.length];
		int[] sum = new int[num];
		float[] avg = new float[num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < subname.length; j++) {
				do {System.out.print((i + 1) + "���� " + subname[j] + "������ �Է��ϼ���: ");
				sub[i][j] = scanner.nextInt();
				}while(sub[i][j] < 0 || sub[i][j] > 100);
				sum[i] += sub[i][j];
			}
			avg[i] = (float)sum[i] / subname.length;
		}
		
		for(int i = 0; i < num; i++) {
				System.out.printf("%d���� ����: %d, ���: %.2f\n", i + 1, sum[i], avg[i]);
		}
		scanner.close();
	}
}
