
public class Oop2_8 {
	
	//접근제어자를 이용한 맴버숨기기
	
	public static void main(String[] args) {
		Time t = new Time(18, 36, 45);
		System.out.println(t);
//		t.hour = 3; hour의 제어자는 private이기 때문에 클래스 외부에서 접근 할 수 없다.
		t.setHour(t.getHour() + 1); //hour를 변경하기 위해서는 메소드를 통해 접근해야 한다.
		System.out.println(t);
	}

}

class Time{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() { return hour; }
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if(hour < 0 || hour > 60) return;
		this.minute = minute;
	}
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if(hour < 0 || hour > 60) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}