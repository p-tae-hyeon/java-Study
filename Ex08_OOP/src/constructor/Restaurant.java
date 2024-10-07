package constructor;

import java.security.PublicKey;

public class Restaurant {
	String address;
	String brand;
	int money;
	//public Restaurant(){} -> 기본 생성자 메서드.
	//보이진 않지만 존재한다.
	//생성자 목적 : 객체 생성시 필요한 초기작업을 수행하기 위해 사용한다.
	//생성자 목적2: 필드의 초기값을 설정하기 위해서 사용한다.
	//생성자 목적3: 입력해야하는 인자들을 강제한다.
	public Restaurant(){
		System.out.println("기본생성자 초기작업!");
		address = "목포";
		money = 1000000;
	}
	// 생성자 => 메서드. //중복정의 가능.
	
	public Restaurant(String ad, int won) {
		address=ad;
		money=won;
	}
	
	
	
	public Restaurant(String address, int money, String brand) {
		//address=address;
		//필드에 접근하는 키워드 this
		this.address = address;
		// 정리
		//1. 지역변수와 필드가 이름이 같을경우 우선순위는 지역변수다.
		//2. 만일 필드를 선택하고 싶다면? this 키워드를 사용한다.
		this.money = money;
		this.brand = brand;
	}
	
	
	
	
	
	
}
