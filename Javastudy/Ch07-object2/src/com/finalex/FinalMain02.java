package com.finalex;

class Me{
	private int var = 100;
	
	public final void setVar(int var) {
		this.var = var;
	}
}

public class FinalMain02 extends Me{
	
	/*public void setVar(int var) {
		this.var;
	}*/
	
	public static void main(String[] args) {
		FinalMain02 me = new FinalMain02();
		me.setVar(10000);
	}
}
