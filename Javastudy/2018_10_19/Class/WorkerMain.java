
public class WorkerMain {
	
	public static void main(String[] args) {
		
		Worker w = new Worker();
		w.name = "��ȣ";
		for(int i = 1; i <= 10; i++) {
			w.work();
			if(i % 3 == 0)
				w.deposit();
		}
		
		System.out.println("���� �̸�: " + w.name);
		System.out.printf("�Աݵ��� ���� �޿�: %,d��\n", w.money);
		System.out.printf("���� �ܰ�: %,d��\n", w.balance);

	}

}

class Worker{
	
	String name;
	int money;
	int balance;
	
	public void work() {
		money += 1000;
	};
	
	public void deposit() {
		balance += money;
		money = 0;
	}
	
}