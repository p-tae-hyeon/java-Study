package 월급관리프로그램;

public abstract class Employee {

	// partTime , Regular, Temp 공통된 필드, 메서드 작성
	// 1. 필드
	// 사번
	String empno;
	// 이름
	String name;
	// 시급
	int pay;
	
	// 생성자
	// 상속을 받은 이후에 부모 클래스에 생성자가 있으면
	// 자식클래스에 부모 클래스의 생성자를 무조건 구현해야합니다!!!!!
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	// 월급구하는 메서드
	// 추상메서드로 변환하기
	// abstract 추가
	public abstract int getMoney();
	
	
	
	// print
	public String print() {
		return empno+" : "+name + " : "+pay;
	}

	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
