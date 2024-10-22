package Solid규칙을지키지않는다;



class DogClass {
	public void sound() {
		
	}
}



class CatClass {
	public void sound() {
		
	}
}

class Listen_Aniaml{
	public void DogSound() {
		DogClass dog = new DogClass();
		dog.sound();
	}
	
	
	public void CatSound() {
		CatClass cat = new CatClass();
		cat.sound();
	}
}



public class O {
	public static void main(String[] args) {
		Listen_Aniaml ist = new Listen_Aniaml();
		ist.CatSound();
		ist.DogSound();
	}
}
