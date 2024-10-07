package practice;

import java.util.Scanner;

public class Ex10다중if {

	public static void main(String[] args) {
		// 월을 입력받아서 계절 표기
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		String season="계절";

		if (month == 12 || month <= 2) {// 12월, 1월, 2월 이면
			// 해당 월은 겨울입니다.
			season = "겨울";
		} else if (month <= 5) { // 5월 이하라면
			// 해당 월은 봄입니다.
			season = "봄";
		} else if (month <= 8) {// 8월 이하라면
			// 해당 월은 여름입니다.
			season = "여름";
		} else if (month<=11) { // 11월 이하라면
			// 해당 월은 가을입니다.
			season = "가을";
		} else {
			System.out.println("12이하의 정수를 입력해주세요");
		}
		System.out.println(month+"월은 "+season+"입니다.");
	}
}
