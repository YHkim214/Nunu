class Point2{
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "(" + x + "," + y + ")";
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y); //자손 클래스의 생성자에 부모 클래스의 생성자를 명시해주지 않으면 컴파일러가 자동으로 super()을 삽입시켜준다. 
		this.z = z;  //하지만 부모클래스에서 super()가 정의되어있지 않은경우 에러를 일으킨다.
	}
	
	String getLocation() { //오버라이드한 메소드
		return "(" + x + "," + y + "," + z + ")";
	}
}