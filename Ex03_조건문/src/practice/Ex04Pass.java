package practice;

import java.util.Scanner;

public class Ex04Pass {

	public static void main(String[] args) {
		//문제 : score라는 변수가 60보다 크다면, 합격입니다. 그외의 경우는 불합격 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		
		if(score>60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}

}
