package pratice;

import java.util.Scanner;

public class Ex14_별찍기2 {
	int c;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int num1 = sc.nextInt();

		/*
		 * for(int i=num1;i>=1;i--) { for(int num =1;num<=i;num++) {
		 * System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */
		int cnt = num1;
		for (int j = 0; j < num1; j++) {
			for (int i = 1; i <= cnt; i++) {
				System.out.print("*");
			}
			cnt--;
			System.out.println();

		}
		sc.close();

	}

}
