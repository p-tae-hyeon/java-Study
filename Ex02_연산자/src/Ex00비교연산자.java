import java.util.Scanner;

public class Ex00비교연산자 {

	public static void main(String[] args) {
		//비교연산자의 종류
		// <, >, <=, >=, ==, !=
		// 비교연산자의 결과는 언제나 boolean이다.
		// 결과는 언제나 true, false다.
		
		int num1 = 10;
		int num2 = 9;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		
		int num3=20;
		int num4=20;
		System.out.println(num3==num4);
		System.out.println(num3!=num4);
		
		//문자열 비교하기.
		String firstName = "송";
		String LastName = "승호";
		String fullName = "송승호";
		
		System.out.println(firstName+LastName);
		System.out.println(fullName);
		String fullName2 = firstName+LastName;
		
		
		System.out.println(fullName==fullName2);
		System.out.println(fullName.equals(fullName2));
		//문자열과 문자열의 비교는 .equals()를 사용해야한다.
		//ex) 비교대상1.equals(비교대상2)
		
		

	}

}
