package 재정의해야하는함수;

import java.util.Arrays;

public class 적용해보기Comparable {
	public static class Human implements Comparable<Human>{
		String name;
		int age;
		public Human(String name,int age) {
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "age :	"+age;
		}
		@Override
		public int compareTo(Human o) {//나이순으로
			return Integer.compare(this.age, o.age);
		}
		
	}


	public static void main(String[] args) {
		Human[] human = new Human[3];
		human[0] = new Human("a", 30);
		human[1] = new Human("b",21);
		human[2] = new Human("c",25);
		Arrays.sort(human);
		System.out.println(Arrays.toString(human));
	}
}
