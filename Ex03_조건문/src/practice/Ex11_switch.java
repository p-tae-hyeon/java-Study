package practice;

import java.util.Scanner;

public class Ex11_switch {

	public static void main(String[] args) {
		// 예시
		// 5이하의 숫자를 입력받았을때.
		Scanner sc = new Scanner(System.in);
		System.out.println("5이하 숫자 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : // num이 1일 경우
			System.out.println("1");
		case 2 : // num이 2일 경우
			System.out.println("2");
		case 3 : // num이 3일 경우
			System.out.println("3");
			break;
		case 4 : // num이 4일 경우
			System.out.println("4");
		case 5 : // num이 5일 경우
			System.out.println("5");
			break;
		default :
			System.out.println("5이하 숫자 입력해주세요.");
		}

	}

}
