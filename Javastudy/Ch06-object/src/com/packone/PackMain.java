package com.packone;

import com.packtwo.PackTwo;

public class PackMain {
	public static void main(String[] args) {
		//클래스를 호출할때는 패키지를 포함해서 호출하는 것이 원칙이지만, 같은 패키지의 클래스를 호출할때는 패키지를 생략해도 된다.
		PackOne po = new PackOne();
		
		//다른 패키지의 클래스를 호출할때는 패키지를 표시하거나 패키지를 import 해야함
		PackTwo pt = new PackTwo();
		
		PackThree p3 = new PackThree();
		System.out.println(p3);
		
		//기존 패키지와 import한 패키지에 같은 이름의 클래스가 존재할때, 그 클래스를 호출하면 import해온 패키지의 클래스가 호출된다.
		//그런 경우에는 패키지 경로를 명시해서 호출
		com.packtwo.PackThree p4 = new com.packtwo.PackThree();
		System.out.println(p4);
	}
}
