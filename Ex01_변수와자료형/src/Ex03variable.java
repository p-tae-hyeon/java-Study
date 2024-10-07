
public class Ex03variable {

//main메서드 만들기 : main쓰고 ctrl+space
//자동 줄맞춤 : ctrl+shift+f
	public static void main(String[] args) {
		
		//boolean.
		//논리형.
		//boolean = 1byte.
		//boolean 표현범위 : true, false
		//ex)on/off, 참석여부 ... 등등..
		boolean onoff = true; // true면 켜짐, false면 꺼짐.
		boolean coin = true; //true면 앞면, false면 뒷면.
		boolean female = true; // true면 여자, false면 남자.
		
		//char 타입.
		//문자형
		// char의 크기 = 2byte = 16bit
		// char형의 표현범위 2^16 = 0~65535까지 표현. 
		// Java에서 char는 UNIcode와 대응한다.
		// C 언어 등은 1byte를 이용할 것이다.
		
		// 1byte는 8비트로 ascii코드 체계다.
		// 심지어 그중 1bit는 parrity code로 1의 갯수가 홀수인지 짝수인지 알려주는 녀석으로 쓴다.
		//(오류검출용) -> 그 결과. 표현범위가 0~127까지만 가능했다.
		// 이를 8bit까지 쓰게하려다보니, ANSI체계로 256개의 문자와 대응하게 만들었다.
		// 그런데... 한글,한자,히라가나 등이 표현이 안되니., 유니코드가 생겨났다.
		// 유니코드는 16bit 체계로 한글도 표현이 가능해졌다.
		// ASCII(7bit) -> ANSI(8bit) -> UNICODE(16bit)
		char data = '송';
		
		//byte타입
		// 정수형
		// 크기는 1byte
		// 표현범위는 -128~127
		// ex) 나이.일.점수.시간.온도......
		byte temp = 127;
		
		//short 타입
		// 정수형
		// 크기 : 2byte
		// 표현범위 : 2^16 -> 3만정도;
		// ex)연도,내키,발사이즈,칼로리.
		short kcal = 30000;
		
		// int 타입
		// 정수형 (대표적으로 사용)
		// 크기: 4byte -> 21억까지 사용가능.
		// ex) 한국인구수, 등등
		int koreaHuman = 50000000;
		
		//long 타입
		//정수형
		//크기 : 8byte =64bit 2^64 = 920경
		// ex) 내 자산,
		long money = 6000000000000l;//숫자 뒤에 l(L)을 붙여줘야 한다.
		
		//flaot 타입
		// 실수형
		// 크기 : 4byte = 32bit
		// 범위 : -3.4e38 ~ 3.4e38
		// 숫자뒤에 f를 붙여줘야함.
		float height = 200.0f;
		
		//double 타입
		// 실수형
		// 크기 : 8byte =64bit.
		// 범위 : -1.7e308 ~ 1.7e308
		// 모든 실수를 나타내는 변수들은 지수부와 가수부로 나누어져 사용하기때문에 숫자 범위가 되게 크다.
		// 실수는 물리적인 미세한 오차가 존재한다..
		double pi = 3.141592;
		
		//String 타입.
		// 레퍼런스 데이터 타입.(참조형)
		// char가 문자 하나만 나타내니까.. 미리 여러 문자를 합칠 수 있는 데이터타입을 만들어 두었다.
		String name = "송승호";
		
		
		//데이터 타입들 끼리는 어느정도 데이터타입을 변환할 수 있다.
		//강제형변환(명시적형변환), 자동형변환(묵시적형변환)
		
		//묵시적 형변환
		// 등호를 기준으로 할때, 타입이 일치하지 않는경우.
		// 자바의 컴파일러가 알아서 작은타입을 큰 타입으로 자동 변환시켜주는 것.
		
		double tenPi = 3.14*10;//10은 정수인데, 실수연산을 위해서 10.0이 됨!
		
		int num1 = 10;
		double num2 =20.0;
		num2 = num1;
		System.out.println(num2);
		
		// 강제형변환(명시적형변환, casting)
		// 소괄호를 이용해서 타입을 명시.
		//ex)
		double pi2=3.14;
		int intPi2 = (int) pi2;
		System.out.println(intPi2);
		double pi3 = intPi2;
		System.out.println(pi3);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
