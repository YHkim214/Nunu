package thistest2;

public class ThisConstMain {
	public ThisConstMain() {
		this("�ϴ�");
	}
	public ThisConstMain(int a) {
		this(String.valueOf(a));
	}
	public ThisConstMain(String str) {
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		ThisConstMain tm1 = new ThisConstMain();
		ThisConstMain tm2 = new ThisConstMain("�ٴ�");
		ThisConstMain tm3 = new ThisConstMain(1000);
	}
}