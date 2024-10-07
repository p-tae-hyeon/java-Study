package 월급관리프로그램;

public class RegularEmployee extends Employee{


	int bonus;
	
	// 2. 메서드
	// 4개의 매개변수를 가진 생성자(객체를 생성할 때 필드의 값을 초기화)
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
	}

	@Override
	public int getMoney() {
		System.out.println();
		return (pay+bonus)/12;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
