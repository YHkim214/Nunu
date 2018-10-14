import java.util.*;

public class Array14 {
	//단어 뜻 맞추기 게임
	public static void main(String[] args) {
		String[][] words = {
			{"Chair", "의자"},
			{"Computer", "컴퓨터"},
			{"Integer", "정수"},
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			String answer = scanner.nextLine();
			if(answer.equals(words[i][1])) {
				System.out.printf("정답입니다!\n\n");
			}else {
				System.out.printf("오답입니다! 정답은 %s입니다\n\n", words[i][1]);
			}
		}
	}

}
