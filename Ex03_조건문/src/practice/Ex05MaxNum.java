package practice;

import java.util.Scanner;

public class Ex05MaxNum {

	public static void main(String[] args) {
		// 문제 : 3개의 숫자 중 가장 큰 값 찾기.
		// 1. 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = sc.nextInt();
		
		int max;
		//2. 가장 큰 값 찾기.\
		if(num1>num2) {
			max=num1;
		}else {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		
		System.out.println("최대값은 "+max+"입니다.");
		
	}

}
