
public class CastMain02 {

	public static void main(String[] args) {

		//����� ����ȯ. ū �ڷ��� -> ���� �ڷ���. �����ͼս��� ���������.
		
		byte b1 = 127, b2 = 127;
		int i1 = b1 + b2;
		System.out.println((byte)i1); //int -> byte
		
		short s1 = 1234, s2 = 1234;
		int i2 = s1 + s2;
		System.out.println((short)i2); //int -> short
		
		float f1 = 3.14f;
		int i3 = (int)f1;
		System.out.println(i3); //float -> int
		
		double d1 = 10.9;
		long l1 = 1234L;
		long l2 = l1 + (long)d1;
		System.out.println(l2); //double -> long
	}

}
