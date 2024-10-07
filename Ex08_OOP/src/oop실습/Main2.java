package oop실습;

public class Main2 {

	public static void main(String[] args) {
		//계산기 만들기
		Calculate cal1 = new Calculate();
		cal1.num1=10;
		cal1.num2=20;
		System.out.println(cal1.plus());
		
		Calculate cal2 = new Calculate();
		cal2.num1=cal1.plus();
		cal2.minus();
	}

}
