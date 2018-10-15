
public class OperatorMain09 {

	public static void main(String[] args) {
		//대소문자 구분
		char ch = 'b';
		String s;
		
		s = (ch >= 'A' && ch <= 'Z') ? "대문자임" : "대문자가 아님";
		
		System.out.println("ch = " + s);
	}

}
