
public class Oop2_12 {

	public static void main(String[] args) {
		//instanceof ������ Ȱ��
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("This is a Object instance"); //FireEngine Ŭ������ Car�� ObjectŬ������ ��ӹ޾ұ� ������(FireEngine -> Car -> Object)
															//Car�� Object Ŭ������ �ν��Ͻ��� �������ִ� ���̴�
		}
	}

}
