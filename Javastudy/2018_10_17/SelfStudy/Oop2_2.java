
public class Oop2_2 {
	
	//��Ӱ� ���԰����� ����
	
	public static void main(String[] args) {
		Point[] p = {	new Point(100, 100),
						new Point(140, 50),
						new Point(200, 100)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle();
		
		t.draw();
		c.draw();

	}

}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color = %s]\n", color);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0, 0);
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape{ //���� ����'�̰�(is)' ���� '����(has)'�ϱ� ������ Shape�� ����ϰ�, Point�� �����ߴ�.
	Point center;
	int r;
	
	Circle(){
		this(new Point(0, 0), 100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw(){ //Shape Ŭ������ draw �޼ҵ带 �������̵��ߴ�.
		System.out.printf("[center = %d, %d, r = %d, color = %s]\n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {	
		this.p = p;
	}
	
	void draw(){
		System.out.printf("[p1 = (%d, %d), p2 = (%d, %d), p3 = (%d, %d), color = %s]\n", 
				p[0].x, p[0].y, p[1].x, p[1].y, p[2].x, p[2].y, color);
	}
}