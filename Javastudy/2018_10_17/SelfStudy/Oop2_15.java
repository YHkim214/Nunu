
public class Oop2_15 {
	//인터페이스의 다형성을 이용한 코드
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);

	}

}

interface Repairable{};

class Unit{
	int hitpoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitpoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);
		hitpoint = MAX_HP;
	}
	
	public String toString() {
		return "DropShip";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitpoint = MAX_HP;
	}
	
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(50);
		hitpoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println( u.toString() + "의 수리가 끝났습니다.");
		}
	}
	
	public String toString() {
		return "Marine";
	}
}