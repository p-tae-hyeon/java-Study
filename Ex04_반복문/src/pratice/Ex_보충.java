package pratice;

import java.util.Random;
import java.util.Scanner;

public class Ex_보충 {

	public static void main(String[] args) {
		// Up Down 게임 만들기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// 1000포인트 가지고 시작
		int point = 1000;
		// 랜덤 숫자는 0~99
		// 게임이 한번 진행되는게 아니기 때문에
		// 반복문 안에서 랜덤을 받아야 한다~!
		int rdNum = rd.nextInt(100);

		int cnt = 0;
		while (point > 0) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (rdNum == num) {
				point += 300;
				cnt++;
				System.out.println("정답입니다~!");
				System.out.println("남은 포인트 : "+point);
				rdNum=rd.nextInt(100);
			} else if (rdNum > num) {
				System.out.println("Up");
				point -= 100;
				System.out.println("남은 포인트 : "+point);
			} else if (rdNum < num) {
				System.out.println("Down");
				point -= 100;
				System.out.println("남은 포인트 : "+point);
			}
		}
		System.out.println("성공횟수 : " +cnt);
		// 종료시에 승리횟수 출력

		// 정답 맞추면 +300

		// 틀리면 -100

		// 포인트 모두 소진 시 승리횟수 출력하고 종료

	}

}
