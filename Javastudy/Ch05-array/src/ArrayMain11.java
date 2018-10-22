
public class ArrayMain11 {

	public static void main(String[] args) {
//		¹è¿­º¹½Î
		int[] array1 = {11, 22, 33, 44, 55};
		int[] array2 = new int[10];
		
		System.arraycopy(array1, 0, array2, 3, array1.length);
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		

	}
	
	static int[] copy(int[] a) {
		int[] tmp = new int[a.length];
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = a[i];
		}
		
		return tmp;
	}

}
