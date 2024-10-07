package 월급관리프로그램;

public class PartTimeEmployee {
	// 1. 필드
	// 사번
	String empno;
	// 이름
	String name;
	// 시급
	int pay;
	
	// 일한 날짜
	int workDay;

	
	// 메서드
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		return pay*workDay;
	}
	
	public String print() {
		return empno+" : "+name + " : "+pay;
	}
	

}
