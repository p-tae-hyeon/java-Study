package constructor;

public class Main {

	public static void main(String[] args) {
		
		//1. 기본생성자를 이용해서 객체 생성시 초기작업과 
		//   초기값이 알맞게 입력되었는지 확인하기.
		Restaurant res1 = new Restaurant();
		System.out.println(res1.address);
		
		//2. 매개변수로 초기값을 받아오는 생성자를 가지는 객체 만들기.
		Restaurant res2 = new Restaurant("무안", 10);
		System.out.println(res2.address+res2.money);
		
		//3. 생성자를 이용해 매개변수를 강제하는것 확인해보기.
		// = new Restaurant(123,"");
	}

}
