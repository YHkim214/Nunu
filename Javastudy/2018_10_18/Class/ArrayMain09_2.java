
public class ArrayMain09_2 {
	
	public static void main(String[] args) {
		Student s1 = new Student(100, 90, 80);
		Student s2 = new Student(89, 90, 70);
		Student s3 = new Student(70, 56, 80);
		Student[] arr = {s1, s2, s3};
		
		for(Student i: arr) {
			System.out.printf("%d¹øÀÇ ÃÑÁ¡: %d, Æò±Õ: %.2f\n", i.num2 , i.sum(), i.avg());
		}
	}
}

class Student{
	static int num = 0;
	int num2;
	int korean;
	int english;
	int math;
	
	{
		num++;
	}
	
	Student(int korean, int english, int math){
		this.num2 = num; 
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	int sum() {
		return korean + english + math;
	}
	
	float avg() {
		return sum() / 3.0f;
	}
}