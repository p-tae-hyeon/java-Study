package practice;

import java.util.Scanner;

public class Ex09다중if2 {

	public static void main(String[] args) {
		// 지불금액을 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("지불금액을 입력하세요 : ");
		int price = sc.nextInt();
		int discount = 0;
		
		if(price>=100000) {// 지불금액이 100000 이상이면 
			// 할인율에 10을 넣어줘
			discount = 10;
		}else if(price>=50000) {// 지불금액이 50000이상이면
			// 할인율에 5를 넣어줘
			discount = 5;
		}
		// 할인가는 총금액에서 총금액 * 할인율 /100
		int discountPrice = price-(price*discount / 100);
		// 양식에 따라서 출력
		System.out.println("총금액 : "+ price + "원, 할인율 : "+discount+"%, 할인 금액 : "+(price*discount / 100)
				+ "원, 할인된 금액 :"+ discountPrice + "원");

	}

}
