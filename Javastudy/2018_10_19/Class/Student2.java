
public class Student2 {
	
	String name;
	int korean;
	int math;
	int english;
	int sum;
	double average;
	
	public static void main(String[] args) {
		// °´Ã¼ÀÇ ¼±¾ğ, »ı¼º
		Student2 student = new Student2();
		student.name = "È«±æµ¿";
		student.korean = 98;
		student.math = 97;
		student.english = 95;
		
		student.sum = student.korean + student.math + student.english;
		student.average = student.sum / 3.0;
		
		System.out.println("ÀÌ¸§: " + student.name);
		System.out.println("±¹¾î: " + student.korean);
		System.out.println("¼öÇĞ: " + student.math);
		System.out.println("¿µ¾î: " + student.english);
		System.out.println("ÃÑÁ¡: " + student.sum);
		System.out.printf("Æò±Õ: %.2f\n", student.average);
		
		System.out.println("================");
		
		Student2 student2 = new Student2();
		student2.name = "¼ÕÈï¹Î";
		student2.korean = 99;
		student2.math = 70;
		student2.english = 100;
		
		student2.sum = student2.korean + student2.math + student2.english;
		student2.average = student2.sum / 3.0;
		
		System.out.println("ÀÌ¸§: " + student2.name);
		System.out.println("±¹¾î: " + student2.korean);
		System.out.println("¼öÇĞ: " + student2.math);
		System.out.println("¿µ¾î: " + student2.english);
		System.out.println("ÃÑÁ¡: " + student2.sum);
		System.out.printf("Æò±Õ: %.2f", student2.average);
	}

}
