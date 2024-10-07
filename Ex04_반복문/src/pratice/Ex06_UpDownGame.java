package pratice;

import java.util.Random;
import java.util.Scanner;

public class Ex06_UpDownGame {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 게임 시작시 1000포인트 가지고 시작
		int hp = 1000;
		int num;
		int rdNum;
		int cnt=0;
		
		while(hp>0) {
			rdNum = rd.nextInt(100);
			while(true) {
				System.out.print("숫자입력 : ");
				num = sc.nextInt();
				if(num==rdNum) {
					System.out.println("승리!");
					hp+=300;
					cnt++;
					break;
				} else if(num> rdNum) {
					System.out.println("down");
					hp-=200;
					System.out.println(hp);
				} else {
					System.out.println("up");
					hp-=200;
					System.out.println(hp);
				}
				if(hp<=0) {
					break;
				}
			}
		}
		System.out.println("정답횟수 : "+cnt);

	}

}
