package practice;

import java.util.Scanner;

public class Ex13_switch {

	public static void main(String[] args) {
		// 금액을 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		// 국적 (USD , JPY, EUR)도 입력을 받아서
		System.out.print("국적을 입력하세요. \tUSD\tJPY\tEUR\n입력 : ");
		// 환율 계산해서 얼만지 출력
		String nation =sc.next();
		double result =0;
		
		switch(nation) {
		case "USD":
			result = money/1000*0.77;
			break;
		case "JPY" :
			result = money/1000 *102.32;
			break;
		case "EUR" :
			result = money/1000 *0.70;
			break;
		default : 
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.println(money + "원은 "+result+ " "+ nation + " 입니다.");
		
	}

}
