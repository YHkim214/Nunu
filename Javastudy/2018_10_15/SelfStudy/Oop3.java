
public class Oop3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.printf("t1의 channel값은 %d입니다.\n", t1.channel);
		System.out.printf("t2의 channel값은 %d입니다.\n", t2.channel);
		
		t2 = t1; //이제 참조변수 t1과 t2는 같은 인스턴스를 가리킨다.
		
		t1.channel = 7;
		System.out.printf("t1의 channel값을 7로 변경하였습니다.\n");
		
		System.out.printf("t1의 channel값은 %d입니다.\n", t1.channel);//그렇기 때문에 t1의 값을 변화시키면 t2의 값도 변화한다.ㄴ
		System.out.printf("t2의 channel값은 %d입니다.\n", t2.channel);

	}

}
