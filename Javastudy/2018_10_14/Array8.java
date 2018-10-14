
public class Array8 {

	public static void main(String[] args) {
		//로또 공 뽑기
		int[] balls = new int[45];
		
		for(int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		int tmp = 0;
		int j = 0;
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			tmp = balls[i]; //첫 6개의 인자만 섞는다.
			balls[i] = balls[j];
			balls[j] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("balls[%d]: %d\n", i, balls[i]);
		}

	}

}
