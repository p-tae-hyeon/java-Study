package pratice;

import java.util.Scanner;

public class Ex04_while예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int evenCnt = 0;
		int oddCnt = 0;
		
		while(true) {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();
			
			if(num%2==0) {
				evenCnt++;
			}else if(num%2==1) {
				oddCnt++;
			}
			if(num==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("짝수개수 : "+ evenCnt);
			System.out.println("홀수개수 : "+  oddCnt);
		}

	}

}
