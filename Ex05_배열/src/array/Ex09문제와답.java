package array;

import java.util.Scanner;

public class Ex09문제와답 {

	public static void main(String[] args) {
		//2. 사용자의 입력을 담아줄 5칸 배열 만들기.
		//+미리 답을 담아줄 배열도 만들기.		
		int[] userAns = new int[5];
		int[] numAns = {1,2,3,4,5};
		String[] check = new String[5];
		Scanner sc = new Scanner(System.in);
		
		
		
		//1. 채점하기 답을 입력하세요 출력
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		//사용자의 입력을 배열에 담기.
		for(int i=0;i<userAns.length;i++) {
			System.out.print(i+1+"번답 >>");
			userAns[i] = sc.nextInt();
		}
		//userAns= {1,2,3,4,5}
		//3. 정답확인하기.
		System.out.println("정답확인");
		int score=0;
		for(int i=0;i<userAns.length;i++) {
			if(numAns[i]==userAns[i]) {
				System.out.print("O ");
				score+=20;// score=score+20;
				check[i]="O";
			}else {
				System.out.print("X ");
				check[i]="X";
			}
		}
		System.out.println("총 점 : "+score);
		
		
		//for-each문 for(잠시담아둘데이터타입 변수명:배열명){ 실행문장 }
		for(String x:check) {
			System.out.print(x+" ");
		}
	}

}
