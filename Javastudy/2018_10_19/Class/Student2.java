
public class Student2 {
	
	String name;
	int korean;
	int math;
	int english;
	int sum;
	double average;
	
	public static void main(String[] args) {
		// ��ü�� ����, ����
		Student2 student = new Student2();
		student.name = "ȫ�浿";
		student.korean = 98;
		student.math = 97;
		student.english = 95;
		
		student.sum = student.korean + student.math + student.english;
		student.average = student.sum / 3.0;
		
		System.out.println("�̸�: " + student.name);
		System.out.println("����: " + student.korean);
		System.out.println("����: " + student.math);
		System.out.println("����: " + student.english);
		System.out.println("����: " + student.sum);
		System.out.printf("���: %.2f\n", student.average);
		
		System.out.println("================");
		
		Student2 student2 = new Student2();
		student2.name = "�����";
		student2.korean = 99;
		student2.math = 70;
		student2.english = 100;
		
		student2.sum = student2.korean + student2.math + student2.english;
		student2.average = student2.sum / 3.0;
		
		System.out.println("�̸�: " + student2.name);
		System.out.println("����: " + student2.korean);
		System.out.println("����: " + student2.math);
		System.out.println("����: " + student2.english);
		System.out.println("����: " + student2.sum);
		System.out.printf("���: %.2f", student2.average);
	}

}
