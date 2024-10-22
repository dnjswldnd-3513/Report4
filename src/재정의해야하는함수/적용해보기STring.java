package 재정의해야하는함수;

class Human{
	String name;
	int age;
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human { name :"+name+", age :"+age+"}";
	}
}


public class 적용해보기STring {
	
	public static void main(String[] args) {
		Human hum = new Human("원지웅", 17);
		System.out.println(hum);
	}

}
