package com.overriding;

class GrandParent{
	public String getCar() {
		return "구형자동차";
	}
}

class Father extends GrandParent{
	public String getCar() {
		return "신형자동차";
	}
}

class Uncle extends GrandParent{
	
}

public class OverridingMain01 {

	public static void main(String[] args) {
		Father f = new Father();
		System.out.println(f.getCar());
	}

}
