
public class VariableTypeMain {

	public static void main(String[] args) {
		System.out.println("====논리형====");//1바이트
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("====문자형====");//2바이트, 표현범위 0~65,535, 다국어 처리를 위한 유니코드
										  //아스키코드: 영문자, 숫자, 특문 || 유니코드: 모든 문자

		char c1 = 'A';
		int c2 = c1;//묵시적 타입캐스팅
		char c3 = (char) c2;// 명시적 타입 캐스팅
		char c4 = '\u0041';
		char c5 = '자';
		char c6 = '\uc790';
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		
		System.out.println("====정수형====");
		//byte 1byte short 2byte int 4byte long 8byte
		byte n1 = 127;
		System.out.println("n1 = " + n1);
		short n2 = 32767;
		System.out.println("n2 = " + n2);
		int n3 = 321231213;
		System.out.println("n3 = " + n3);
		long n4 = 3213213213213231L;
		System.out.println("n4 = " + n4);
		
		System.out.println("====실수형====");
		//float 4byte double 8byte
		
		float f1 = 12.223f;
		System.out.println("f1 = " + f1);
		double d1 = 12.322;
		System.out.println("d1 = " + d1);
		
		System.out.println("====문자열====");
		
		String name = new String("윤호");
		System.out.println(name);
	}
}