package pratice;

import java.util.Scanner;

public class Ex14_별찍기 {

	public static void main(String[] args) {
		// 행의 개수를 입력받아서 별찍기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num1 = sc.nextInt();
		
		
		for(int i=num1;i>=1;i--) {
			for(int num =1;num<=i;num++) {
				System.out.print("*");		
				
			}
			System.out.println();
		}
		
		

	}

}
