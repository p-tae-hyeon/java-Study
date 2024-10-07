package pratice;

import java.util.Scanner;

public class Ex15피라미드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		int cnt =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("\t");
			}
			for(int k=0;k<(i*2)+1;k++) {
				cnt++;
				System.out.print(cnt+"\t");
			}
			System.out.println();
		}
	}

}
