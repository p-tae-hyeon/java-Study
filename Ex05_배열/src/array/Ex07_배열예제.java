package array;

import java.util.Scanner;

public class Ex07_배열예제 {

	public static void main(String[] args) {
		// 숫자를 입력받아서 
		Scanner sc = new Scanner(System.in);
		// 10칸짜리 배열에 넣고 
		int[] array = new int[10];
		
		// 숫자를 입력받아서 배열에 넣는 반복문 만들어주기
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			array[i]=sc.nextInt();
		}// 숫자를 입력받아서 배열에 넣어주는 반복문
		
		
		// 3의 배수만 출력하기
		System.out.print("3의 배수 : ");
		for (int i = 0; i < array.length; i++) {
			if(array[i]%3==0) {
				System.out.print(array[i]+" ");
				System.out.println("Babo");
			}
		}
		
		
		
		
	}

}
