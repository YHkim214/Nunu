
public class TraningEx01 {

	public static void main(String[] args) {

		System.out.println("컴퓨터공학과");
		System.out.println("===========");
		System.out.println("이름: 강호동");
		System.out.println("학번: 20181011");
		/*System.out.println("특기: 게임");
		System.out.println("취미: 축구");*/
		
		Human Kang = new Human("강호동", 20181111);
		
		System.out.printf("컴퓨터공학과\n===========\n이름: %s\n학번: %d", Kang.name, Kang.age);
		
	}

}
