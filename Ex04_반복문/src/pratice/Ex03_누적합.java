package pratice;

import java.util.Scanner;

public class Ex03_누적합 {

	public static void main(String[] args) {
		// while문 사용해서
		// 합이 누적되서 출력
		Scanner sc = new Scanner(System.in);
		int num =0;
		int sum =0;
		boolean a = true;
		while(a) {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();
			sum+=num;
			System.out.println("누적결과 : "+ sum);
			
			if(num==-1) {
				a=false;
			}
		}
		System.out.println("종료되었습니다.");

	}

}
