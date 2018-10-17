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
		super(x, y); //�ڼ� Ŭ������ �����ڿ� �θ� Ŭ������ �����ڸ� ��������� ������ �����Ϸ��� �ڵ����� super()�� ���Խ����ش�. 
		this.z = z;  //������ �θ�Ŭ�������� super()�� ���ǵǾ����� ������� ������ ����Ų��.
	}
	
	String getLocation() { //�������̵��� �޼ҵ�
		return "(" + x + "," + y + "," + z + ")";
	}
}