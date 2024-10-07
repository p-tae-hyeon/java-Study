package method;

public class ParOReX {

	public static void main(String[] args) {
		sumPrint(3, 4);
		//출력하는 기능을 가진 메서드이므로 변수에 값을 저장할 수 없다.
		//System.out.println(sumPrint(1, 2)); => 출력을 출력할 수 없다.
	}
	// void : 리턴타입이 없다.
	// 기능 자체를 가지고 있는경우가 많음.
	public static void sumPrint(int num1, int num2) {
		System.out.println("결과값은 "+ (num1+num2)+"입니다.");
	}
}
