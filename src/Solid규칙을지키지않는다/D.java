package Solid규칙을지키지않는다;

public class D {
	class Dog {

		public Dog() {
		}

		public void sound() {
			System.out.println("멍");
		}
	}

	class DogTraning {

		private Dog dog;

		public DogTraning() {
			this.dog = new Dog();
		}

		public void train() {
			dog.sound();
			System.out.println("강아지가 훈련받고 있습니다. ");
		}

	}

}
