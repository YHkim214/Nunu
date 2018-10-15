
public class Oop2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.printf("tv1의 channel값은 %d입니다.\n", tv1.channel);
		System.out.printf("tv2의 channel값은 %d입니다.\n", tv2.channel);
		
		tv1.channel = 7;
		System.out.printf("tv1의 channel값을 7로 변경하였습니다\n");
		
		System.out.printf("tv1의 channel값은 %d입니다.\n", tv1.channel);
		System.out.printf("tv2의 channel값은 %d입니다.\n", tv2.channel);//tv1과 tv2는 서로 다른 인스턴스를 가리키기 때문에 tv1의 값을 변화시켜도 tv2에는 아무런 영향이 없다.

	}

}
