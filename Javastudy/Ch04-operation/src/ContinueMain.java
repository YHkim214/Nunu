
public class ContinueMain {

	public static void main(String[] args) {
		//continue는 반복문에서 특정조건일때 반복문의 해당 회차를 건너뜀
		for(int i = 0; i <= 10; i++) {
			if(i % 3 == 0) continue; //3의배수인 경우 해당회차를 건너 뜀
			System.out.println(i);
		}
	}

}
