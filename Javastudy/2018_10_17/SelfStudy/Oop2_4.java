//포함관계를 이용한 유사 다중상속

class VCR{
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class TVCR extends Tv{
	VCR vcr = new VCR(); //vcr을 다중상속 할 수 없기 때문에 포함시켰다.
	int counter = vcr.counter;
	
	void play() {//그리고 메소드는 vcr의 메소드를 가져다가 그대로 쓴다.
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}