package array;

import java.util.Scanner;

public class Ex04_이차원배열 {

	public static void main(String[] args) {
		// 3행 5열 answer 만들기
		// int
		// 3*5 배열만들기
		
		int [][] answer = new int[3][5];
		
		// 첫 번쨰 행에는 답 !!
		answer[0][0]=4;
		answer[0][1]=5;
		answer[0][2]=4;
		answer[0][3]=1;
		answer[0][4]=2;
				
		// 마지막 행에는 배점!!!
		answer[2][0]=10;
		answer[2][1]=20;
		answer[2][2]=30;
		answer[2][3]=20;
		answer[2][4]=20;
		
		// 값을 입력받아서 2번째 행에 넣어주기
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5;i++) {
			System.out.print(i+1 +"번째 답 >> ");
			answer[1][i] = sc.nextInt();			
		}
		
		// 총점 담을 변수 만들기
		int result =0;
		
		for(int i = 0; i<5; i++) {
			if(answer[0][i]==answer[1][i]) {
				System.out.print("O");
				result+=answer[2][i];
			}else {
				System.out.print("X");
			}			
		}
		
		
		System.out.println();
		System.out.println("총점 : "+result + "점");
		
		
		
		
		
		

	}

}
