
public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i == 5) continue; //조건을 만족하면 여기서 나머지를 건너뛰고 다음 반복문으로 넘어간다.
			System.out.println(i);
		}
	}

}
