package extends_;

public class Dog extends Animal{
	String className = "면봉";
	
	@Override
	public void walk() {
		System.out.println(className+"(이)가 걷는다.");
	}
}
