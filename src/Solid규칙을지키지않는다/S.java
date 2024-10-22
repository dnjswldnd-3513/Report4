package Solid규칙을지키지않는다;




class Dog{
	
	String name;
	int weight;
	
	public Dog(String name,int weight ) {
		this.name = name;
		this.weight = weight;
	}
	
	
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void info() {
		System.out.println("이름 :" +name+", 무게"+weight);
	}
	
	
	public void dogRun(Dog dog) {
		System.out.println(dog.name + "가 뛰고 있다.");
	}
	
	
}


public class S {
	public static void main(String[] args) {
		Dog 백구 = new Dog("흑구", 30);
		백구.dogRun(백구);
	}
}
