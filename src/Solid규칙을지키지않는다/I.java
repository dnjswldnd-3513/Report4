package Solid규칙을지키지않는다;




interface GameLogics{
	void printPS();
	void printMN();
}

class 마법사 implements GameLogics{

	@Override
	public void printPS() {
		System.out.println("피는 500");
	}

	@Override
	public void printMN() {
		System.out.println("마나는 155");
	}
	
}


class 전사 implements GameLogics{

	@Override
	public void printPS() {
		System.out.println("체력은 1000");
	}

	@Override
	public void printMN() {
		//전사는 마나를 사용하지 않는 캐릭터이다.
	}
	
}//불필요한 코드임 전사에게 있어서 마나라는 인터페이스는

public class I {
	
}
