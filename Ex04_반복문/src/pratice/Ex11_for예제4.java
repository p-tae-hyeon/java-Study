package pratice;

import java.util.Scanner;

public class Ex11_for예제4 {

	public static void main(String[] args) {
		// 구구단 2단 출력하기
		
		for (int i = 1;i<=9;i++) {
			System.out.println("2*"+i+"="+(2*i));
		}
		
		// 숫자 입력받아서 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1;i<=9;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
		
		
	}

}
