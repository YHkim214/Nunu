package com.instance;

class Tv{
	boolean power = false;
	int channel;
	
	public void power() {
		power = !power;
		if(power == true)
			System.out.println("Tv�� �������ϴ�");
		else
			System.out.println("Tv�� �������ϴ�");
	}
	
	public void channelUp(){
		channel++;
		System.out.println("���� ä��: " + channel);
	}
	
	public void channelDown() {
		channel--;
		System.out.println("���� ä��: " + channel);
	}
}

public class TvMain {
	
	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.power();
		
		tv.channel = 7;
		System.out.println("���� ä��: " + tv.channel);
		
		tv.channelDown();
		tv.power();
	}

}
