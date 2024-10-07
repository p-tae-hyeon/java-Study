package practice;

import java.util.Scanner;

public class Ex01OldAge {

	public static void main(String[] args) {
		//키보드로 값을 입력받아서, 20보다 크거나 같으면 성인입니다 출력.
		
		// 1. 사용자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		// 2. 비교하기
		if(age>=20) {
			System.out.println("성인입니다.");
		}	
		
	}

}
