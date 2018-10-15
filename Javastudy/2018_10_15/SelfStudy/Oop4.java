
public class Oop4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i = 0; i < tvArr.length; i++) { //반복문을 돌려서 Tv객체배열을 초기화한다.
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;//객체배열의 인자객체의 채널을 설정한다.
		}
		
		for(int i = 0; i < tvArr.length; i++) { //반복문을 돌려서 각 인자에 channelUp 메소드를 실행시킨다. 
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
	}

}
