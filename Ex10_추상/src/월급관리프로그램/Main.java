package 월급관리프로그램;

public class Main {

	public static void main(String[] args) {
		// 생성자를 이용해서 객체 regular를 만들어봅시다!!
		// 객체 생성할때 
		// 클래스명 + (객체명) = new 생성자();
		RegularEmployee regular = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		
		regular.print();
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay()+"만원");
		
		// 생성자를 이용해서 temp객체를 만들자!
		TempEmployee temp = new TempEmployee("SMHRD002", "박문수", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"만원");
		
		// 생성자를 이용해서 객체 partTime만들기
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "임성훈", 10, 10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay()+"만원");
		
		

	}

}
