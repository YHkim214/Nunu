
public class ArrayMain05 {

	public static void main(String[] args) {
		
		int test[][];
		test = new int[2][3];
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		System.out.println(test[1][2]);
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.printf("test[%d][%d] = %d\n", i, j, test[i][j]);
			}
		}	
		
		int[][] test2 = new int[][] {
									{100,200,300},
									{400,500,600}
									};
	}

}
