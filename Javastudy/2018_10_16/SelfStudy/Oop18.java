
public class Oop18 {

	public static void main(String[] args) {
		//초기화블럭
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}

}

class BlockTest{
	static {
		System.out.println("static {}");
	}
	
	{
		System.out.println("{}");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
}
