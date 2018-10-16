
public class Oop16 {

	public static void main(String[] args) {
		//가변인자를 이용한 문자열 합치기 메소드
		
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1", "2", "3"}));
		System.out.println("[" +(concatenate(",", new String[0]) + "]"));
		System.out.println("[" +(concatenate(",")) + "]");

	}
	
	static String concatenate(String delim, String...args) {
		String result = "";
		
		for(String str: args) {
			result += str + delim;
		}
		
		return result;
	}
	
	/*static String concatenate(String...args) {
		return concatenate("," , args);
	}*/

}
