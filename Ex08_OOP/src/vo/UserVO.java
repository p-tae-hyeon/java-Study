package vo;

import java.util.Objects;

public class UserVO {

	//VO(Value Object) : 데이터 자체를 표현하는 객체.
	// 객체가 상태와 행위를 표현한다면 VO는 상태만을 표현한다.
	
	
	//VO 특징 : 불변성, 값의 동등성, 로직메서드의 부재.
	//불변성 : 생성자를 이용해서 속성에 값을 넣으면, VO객체는 절대 바꿀 수 없어야한다.
	
	
	private String name;
	private int age;
	private String gender;
	
	//VO의 형태
	// 1. VO는 외부에서 함부로 필드에 접근해서 변경할 수 없게해야함.
	//    => private라는 접근제한자를 이용해서 외부에서 필드로 접근 불가하게 한다.
	// 2. VO는 객체를 생성할 때, 값을 넣어줄 것이므로 생성자를 만들어준다.
	// 3. 값을 꺼낼때 사용하는 getter를 만들어 사용해줘야 한다.(이름의 형식 : getXxx)

	//getter의 구조.
	//public 리턴타입 getXxx(){
	//      return xxx;
	//}
	//리턴값은 해당 필드를 내보내 준다.
	public UserVO(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
	//동등성을 위한 equals

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		return age == other.age && Objects.equals(gender, other.gender) && Objects.equals(name, other.name);
	}
	
	//setter?
	// DTO(Data Transfer Object) 에서 사용
	// 계층간 Data 전달에 목적을 두었음. => JDBC 하면서 나올건데.. VO와 비슷하지만 동등성과 불변성의 개념은 없다.
	
	
	
	
	
	
	
}
