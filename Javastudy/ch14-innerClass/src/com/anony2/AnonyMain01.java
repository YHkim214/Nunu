package com.anony2;

class Inner6{
	public void disp() {
		System.out.println("disp 메서드");
	}
}

public class AnonyMain01 {

	//익명내부 클래스. inner6를 상속받은 이름없는 클래스를 만듬
	//inner6의 메서드를 오버라이딩한 메서드만 사용 할 수 있다.
	public void make() {
		Inner6 i = new Inner6() {
			@Override
			public void disp() {
				System.out.println("익명객체의 disp 메서드");
			}
		};
		i.disp();
	}

	public static void main(String[] args) {

		new AnonyMain01().make();

	}

}
