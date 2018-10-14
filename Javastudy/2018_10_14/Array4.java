
public class Array4 {

	public static void main(String[] args) {
		
		//arraycopy 메소드 사용법
		
		char[] abc = {'a', 'b', 'c', 'd', 'e'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);//(복사해올 배열, 시작 인덱스, 붙여넣기할 배열, 시작인덱스, 복사할 길이)
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}		
}
