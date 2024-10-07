package oop실습;
//class : 객체를 만들기 위한 설계도이자 분류이다.
public class People {
	//속성
	//이름, 나이, 성별, 키, 인종, 몸무게, 혈액형, 발사이즈,시력,
	//머리색, 피부톤, 손갯수, 귀갯수, 
	//속성 : 필드(변수) => 메서드 밖에서 정의하는 변수다. 객체의 속성을 나타낸다.
	double sight;
	double weight;
	
	//행위 : 메서드(Method)
	//보다, 먹다, 자다, 운동하다, 만지다, 듣다, 말하다.
	public void see(String screen) {
		sight--;
	}
	
	public boolean touch(String button) {
		System.out.println("버튼만졌음!");
		return true;
	}
	protected void listen(String sound) {
		System.out.println(sound+"듣는중");
		
	}
	String talk() {
		System.out.println("말하다!");
		return "안녕";
	}
	
	
}
