package 재정의해야하는함수;


public class 적용해보기equals {
	public static class Human {
		String name;
		int age;

		public Human(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;//가져온 객체가 같은 객체인가? 참조값이 같으면 안의 값들이 같은것이기 때문에true로 종료
			}
			if (!(obj instanceof Human)) {
				return false;//인스턴스인가? 아니면 false
			}
			//객체는 맞지만 참조가 다르면 실행해야할 문들
			Human a = (Human) obj;
			return name.equals(a.name) && age == a.age;
		}

		
		//객체가 같으면 같은곳에 저장되어야 하기때문에 hashcode를 생성
		//계산은 이름의 해쉬코드와 age를 합친것
		@Override
		public int hashCode() {
			return name.hashCode() + age;
		}
	}

	public static void main(String[] args) {
		Human h1 = new Human("d", 21);
		Human h2 = new Human("f", 21);
		Human h3 = new Human("fd", 21);
		Human h4 = new Human("fd", 21);
		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.equals(h4));
		System.out.println(h3.hashCode());
		System.out.println(h4.hashCode());
		
	}

}
