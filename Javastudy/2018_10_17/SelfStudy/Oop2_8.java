
public class Oop2_8 {
	
	//���������ڸ� �̿��� �ɹ������
	
	public static void main(String[] args) {
		Time t = new Time(18, 36, 45);
		System.out.println(t);
//		t.hour = 3; hour�� �����ڴ� private�̱� ������ Ŭ���� �ܺο��� ���� �� �� ����.
		t.setHour(t.getHour() + 1); //hour�� �����ϱ� ���ؼ��� �޼ҵ带 ���� �����ؾ� �Ѵ�.
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