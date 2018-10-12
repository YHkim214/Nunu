package SelfStudy01;

public class gugudan {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			for(int e = 1; e < 10; e++) {
				System.out.printf("%d * %d = %d\t", i, e, i*e);
				if(e == 9) {
					System.out.println();
				}
			}
		}

	}

}
