
public class VariableTypeMain {

	public static void main(String[] args) {
		System.out.println("====����====");//1����Ʈ
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("====������====");//2����Ʈ, ǥ������ 0~65,535, �ٱ��� ó���� ���� �����ڵ�
										  //�ƽ�Ű�ڵ�: ������, ����, Ư�� || �����ڵ�: ��� ����

		char c1 = 'A';
		int c2 = c1;//������ Ÿ��ĳ����
		char c3 = (char) c2;// ����� Ÿ�� ĳ����
		char c4 = '\u0041';
		char c5 = '��';
		char c6 = '\uc790';
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		
		System.out.println("====������====");
		//byte 1byte short 2byte int 4byte long 8byte
		byte n1 = 127;
		System.out.println("n1 = " + n1);
		short n2 = 32767;
		System.out.println("n2 = " + n2);
		int n3 = 321231213;
		System.out.println("n3 = " + n3);
		long n4 = 3213213213213231L;
		System.out.println("n4 = " + n4);
		
		System.out.println("====�Ǽ���====");
		//float 4byte double 8byte
		
		float f1 = 12.223f;
		System.out.println("f1 = " + f1);
		double d1 = 12.322;
		System.out.println("d1 = " + d1);
		
		System.out.println("====���ڿ�====");
		
		String name = new String("��ȣ");
		System.out.println(name);
	}
}