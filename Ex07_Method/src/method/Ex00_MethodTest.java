package method;

public class Ex00_MethodTest {

	public static void main(String[] args) {
		System.out.println(plus(3,4));
		System.out.println(plus(5,6));
		System.out.println(plus(3,1));
		System.out.println(plus(3,2));
		System.out.println(plus(3,10));
	}

	// 메서드의 선언 : 선언은 항상 다른 메서드의 밖에서 해준다.
	//public : 접근제한자 
		//public<project 전체>, 
		//private<내 class 내부>, 
		//protected<package 내부+자식>, 
		//default<package>
	//static : static메모리에 저장하겠다. (메서드를 꺼내쓰기 편하게 하기 위해)
	//리턴타입 : 돌려받는 결과값의 데이터 타입.
	//메서드명 : 메서드를 실행시킬때 부를 이름.
	//매개변수(parameter) : 메서드 안에서 사용할 수 있는 변수(선언만)
	
	public static int plus(int num1,int num2) {
		
		//int num3 = num1+num2;
		
		return num1+num2+100;
	}
	

}
