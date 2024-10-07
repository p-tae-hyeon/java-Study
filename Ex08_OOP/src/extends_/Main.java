package extends_;

public class Main {

	public static void main(String[] args) {
		Animal ani1 = new Animal();
		ani1.sound();
		ani1.walk();
		//----------------
		Dog 면봉 = new Dog();
		면봉.sound();
		System.out.println(면봉.className);
		면봉.walk();
		//----------------
		Cat 나나 = new Cat();
		나나.sound();
		System.out.println(나나.className);
		나나.walk();
		

	}

}
