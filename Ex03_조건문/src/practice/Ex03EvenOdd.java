package practice;

import java.util.Scanner;

public class Ex03EvenOdd {

	public static void main(String[] args) {
		//1. 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		String result=null; //컴퓨터에 입장에서 짝수와 홀수가 둘다 아닌경우가 있다고 생각한다.
		//그래서 초기값을 지정해줘야하는데..
		//아무런 값도 없음을 나타내고 싶을땐, null 또는 ""을 넣어준다.
		//2.출력
		if(num%2==0) {
			result = "짝수입니다.";
		}
		if(num%2==1) {
			result = "홀수입니다.";
			
		}
		System.out.println(result);

	}

}
