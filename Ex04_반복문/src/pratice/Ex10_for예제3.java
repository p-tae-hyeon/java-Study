package pratice;

import java.util.Scanner;

public class Ex10_for예제3 {

	public static void main(String[] args) {
		// 2개의 정수 base, n 을 입력받아 base 의 n제곱 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("base : ");
		int base = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		int result =1;
		
		for ( int i = 1;i<=n ;i++) {
			result *= base;
		}
		
		System.out.println("result : "+result);
	}

}
