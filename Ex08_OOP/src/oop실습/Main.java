package oop실습;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//객체만들기.
		// new라는 키워드를 이용해서 객체를 만듬.
		Scanner sc = new Scanner(System.in);
		People seungho = new People();//객체생성 후 seungho라는 변수에 담음.
		seungho.sight=100;
		//객체 사용하기.
		String value = sc.next();
		seungho.see("뽀로로");
		System.out.println(seungho.sight);
		
		
		People yonghyun = new People();
		System.out.println(yonghyun.sight);
		
		//===========================================================
		
		//스마트폰 만들기
		SmartPhone iphone = new SmartPhone();
		iphone.capacity=70;
		iphone.power=false;
		iphone.messageCount=0;
		
		//메세지 받기
		iphone.recieveMessage();
		System.out.println(iphone.messageCount);
		//버튼만지기
		boolean pw = yonghyun.touch("on버튼 누름");
		String onoff = iphone.showing(pw);
		
	}

}
