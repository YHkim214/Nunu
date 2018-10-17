
public class ArrayMain01 {

	public static void main(String[] args) {
		//1차원 배열
		char[] ch;
		ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("=======================");
		
		int[] it = new int[6];
		
		for(int i = 0; i < it.length; i++) {
			System.out.println(it[i]);
		}
		
		System.out.println("=======================");
		
		char[] ch2 = new char[] {'J', 'A', 'V', 'A'}; //명시적 배열생성
		char[] ch3 = {'자', '바'}; //암시적 배열생성
	}

}
