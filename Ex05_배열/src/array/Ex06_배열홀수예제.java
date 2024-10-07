package array;

import java.util.Random;

public class Ex06_배열홀수예제 {

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
		
		int cnt =0;
		int cnt2 =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1) {
				System.out.println(array[i]);
				cnt++;
			}else {
				cnt2++;
			}
		}
		System.out.println("홀수의 개수 : "+cnt);
		System.out.println("짝수의 개수 : "+cnt2);
		
		
		
		
	}

}
