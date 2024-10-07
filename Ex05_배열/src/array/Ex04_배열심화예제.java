package array;

import java.util.Random;

public class Ex04_배열심화예제 {

	public static void main(String[] args) {
		// 중복없는 랜덤값이 들어간 배열 만들기
		Random rd = new Random();
		int[] array = new int[10];
		for(int i = 0; i<array.length;i++) {
			array[i]=rd.nextInt(100);
			for(int j =0;j<i;j++) {
				if(array[i]==array[j]) {
					i--;
				}
			}
		}
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
