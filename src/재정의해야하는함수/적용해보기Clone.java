package 재정의해야하는함수;

public class 적용해보기Clone {

	public static class Human implements Cloneable {
		String name;
		int age;

		public Human(String name, int age) {
			this.age = age;
			this.name = name;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		@Override
		public String toString() {
			return "human --> 이름 :" + name + " // age:" + age;
		}
	}

	public static void main(String[] args) {
		Human h4 = new Human("dfas	", 65);
		Human h4Clone = (Human) h4;
		System.out.println(h4);
		System.out.println(h4Clone);

	}

}
