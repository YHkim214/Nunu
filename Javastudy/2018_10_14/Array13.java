import java.util.*;

public class Array13 {
	//빙고게임
	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1; //1부터 25까지의 숫자를 입력
			}
		}
		
		for(int i = 0; i < SIZE; i++) { //배열을 셔플한다
			for(int j =0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i = 0; i < SIZE; i++) {//배열을 출력
				for(int j =0; j < SIZE; j++) {
					System.out.printf(" %2d", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1부터 %d까지의 숫자를 입력하세요(종료는 0)>", SIZE * SIZE);
			num = scanner.nextInt();
			
			outer: 
			for(int i = 0; i < SIZE; i++) { //입력받은 숫자를 배열에서 검색후 있으면 그 좌표의 값을 0으로 바꾼다.
				for(int j =0; j < SIZE; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
					if(num == 0) break outer; //label break로 2중 반복문을 빠져나온다.
					}
				}
			}
		} while(num != 0);
	}
}
