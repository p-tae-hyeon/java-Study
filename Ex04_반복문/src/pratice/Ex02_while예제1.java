package pratice;

import java.util.Scanner;

public class Ex02_while예제1 {

	public static void main(String[] args) {
		// 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(num<10) {
			System.out.print("정수입력 : ");
			num=sc.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
