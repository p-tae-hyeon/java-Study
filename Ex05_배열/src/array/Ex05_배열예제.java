package array;

import java.util.Random;

public class Ex05_배열예제 {

	public static void main(String[] args) {

		// 중복없는 랜덤값이 들어간 배열 만들기
		Random rd = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100);
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
		// 배열의 모든 수를 합한 것과 평균 구하기
		int result =0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		System.out.println("총 합계 : "+result);
		System.out.println("평균 : "+ result/array.length);
		
		

	}

}
