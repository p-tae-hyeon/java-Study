package 월급관리프로그램;

public class TempEmployee {
	// 1. 필드
	// 사번
	String empno;
	// 이름
	String name;
	// 연봉
	int pay;
	
	// 2. 메서드
	public TempEmployee(String empno, String name, int pay) {
//		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
	
	public String print() {
		return empno+" : "+name + " : "+pay;
	}
	
}
