
public class CastMain01 {

	public static void main(String[] args) {
		
		//묵시적 형변환. 작은 자료형 -> 큰 자료형. 데이터손실없음
		byte b1 = 127, b2 = 127; //32비트 미만 자료형간의 연산시 자료형은 int가 된다.
		int b3 = b1 + b2;
		System.out.println(b3);
		
		short s1 = 32767, s2 = 32767;
		int s3 = s1 + s2;
		System.out.println(s3);
		
		int i1 = 1234;
		long l1 = i1;
		System.out.println(l1);
		
		int i2 = 1234;
		long l2 = 1234L;
		long l3 = i2 + l2; //int + long = long
		System.out.println(l3);
		
		int i3 = 100;
		double d1 = 9.7;
		double d2 = i3 + d1;//int + double = double
		System.out.println(d2);
	}

}
