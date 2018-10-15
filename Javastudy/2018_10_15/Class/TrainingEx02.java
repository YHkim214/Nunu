import java.util.*;

public class TrainingEx02 {

	public static void main(String[] args) {
		//연필x개 30명에게 나눠줄때 인당 몇개주고 몇개남음?
		Scanner scanner = new Scanner(System.in);
		System.out.printf("연필 몇개사옴?>");
		
		int pencils = scanner.nextInt(), students = 30, quantity = pencils / students, rest = pencils % students;
		
		System.out.printf("학생 한 명이 가지는 연필 수: %d개\n", quantity);
		System.out.printf("남은 연필 수: %d개", rest);
		
		scanner.close();
		
	}

}
