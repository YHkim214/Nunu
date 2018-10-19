
public class WorkerMain {
	
	public static void main(String[] args) {
		
		Worker w = new Worker();
		w.name = "윤호";
		for(int i = 1; i <= 10; i++) {
			w.work();
			if(i % 3 == 0)
				w.deposit();
		}
		
		System.out.println("직원 이름: " + w.name);
		System.out.printf("입금되지 않은 급여: %,d원\n", w.money);
		System.out.printf("통장 잔고: %,d원\n", w.balance);

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