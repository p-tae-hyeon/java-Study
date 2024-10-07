package practice;

import java.util.Scanner;

public class Ex02_35 {

	public static void main(String[] args) {
		
		// 입력된 값이 3과 5의 배수라면 "3과5의 배수입니다." 를 출력하는 프로그램
		
		// 1. 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		// 2. 출력
		if(num%3==0 && num%5==0) {//증감/산술/비교/논리/조건/대입
			System.out.println("3과 5의 배수입니다.");
		}

	}

}
