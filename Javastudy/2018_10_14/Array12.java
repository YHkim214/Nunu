import java.util.*;

public class Array12 {

	public static void main(String[] args) {
		//배의 위치를 맞추는 게임
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		int[][] shipBoard = {
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0},
			{ 1, 1, 1, 1, 0, 0, 1, 0 ,0},
			{ 0, 0, 0, 0, 0, 0, 1, 0 ,0},
			{ 0, 0, 0, 0, 0, 0, 1, 0 ,0},
			{ 0, 0, 0, 0, 0, 0, 0, 0 ,0},
			{ 1, 1, 0, 1, 0, 0, 0, 0 ,0},
			{ 0, 0, 0, 1, 0, 0, 0, 0 ,0},
			{ 0, 0, 0, 1, 0, 0, 1, 0 ,0},
			{ 0, 0, 0, 0, 0, 1, 1, 1 ,0},
		};
		
		for(int i = 0; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i+'0'); //int를 char로 만들기
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요.(종료는 00)");
			String input = scanner.nextLine();
			
			if(input.length() == 2) {
				x = input.charAt(0) - '0'; //char을 int로 만들기
				y = input.charAt(1) - '0';
				
				if(x == 0 && y == 0) break;
			}
			
			if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue;
			}
			
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			for(int i = 0; i < SIZE; i++) {
					System.out.println(board[i]);
			}
		}
	}

}
