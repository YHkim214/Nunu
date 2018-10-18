
public class ArrayMain08 {

	public static void main(String[] args) {
		
		int[][] array = new int[9][8];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = (j + 2) * (i + 1);
				System.out.printf("%d * %d = %d\t", j + 2, i + 1, array[i][j]);
			}
			System.out.println();
		}

	}

}
