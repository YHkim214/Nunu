public class TrainingEx01 {

	public static void main(String[] args) {
		
		//성적처리
		int korean = 87, english = 98, math = 92, sum = korean + english + math;
		double avg = sum / 3.0;
		
		System.out.printf("국어: %d\n",  korean);
		System.out.printf("영어: %d\n",  english);
		System.out.printf("수학: %d\n",  math);
		System.out.printf("총점: %d\n",  sum);
		System.out.printf("평균: %.2f",  avg);
	}

}
