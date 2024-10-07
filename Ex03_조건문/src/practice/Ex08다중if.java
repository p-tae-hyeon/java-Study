package practice;

import java.util.Scanner;

public class Ex08다중if {

	public static void main(String[] args) {
		// 두개의 정수와 연산자를 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력시 0이 아닌 정수를 입력해주세요.");
		System.out.println("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 : ");
		String operator = sc.next();

		int result = 0;
		// 계산하는 계산기 만들기
		if (operator.equals("+")) {// 연산자가 더하기면
			// 결과값에 num1 + num2를 넣어줘
			result = num1 + num2;
		} else if (operator.equals("-")) { // 연산자가 빼기면
			// 결과값에 num1 - num2를 넣어줘
			result = num1 - num2;
		} else if (operator.equals("*")) {// 연산자가 곱하기면
			// 결과값에 num1 * num2를 넣어줘
			result = num1 * num2;
		} else if (operator.equals("/")) {// 연산자가 나누기(몫)이면
			// 결과값에 num1 / num2를 넣어줘
			result = num1 / num2;

		} else if (operator.equals("%")) {// 연산자가 나누기(나머지)이면
			// 결과값에 num1 % num2를 넣어줘
			result = num1 % num2;

		} else {
			System.out.println("연산자를 입력해주세요!");
		}
		System.out.println(num1+ " "+operator+" "+num2 + " = "+ result);

	}

}
