package com.instance;

class Tv{
	boolean power = false;
	int channel;
	
	public void power() {
		power = !power;
		if(power == true)
			System.out.println("Tv가 켜졌습니다");
		else
			System.out.println("Tv가 꺼졌습니다");
	}
	
	public void channelUp(){
		channel++;
		System.out.println("현재 채널: " + channel);
	}
	
	public void channelDown() {
		channel--;
		System.out.println("현재 채널: " + channel);
	}
}

public class TvMain {
	
	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.power();
		
		tv.channel = 7;
		System.out.println("현재 채널: " + tv.channel);
		
		tv.channelDown();
		tv.power();
	}

}
