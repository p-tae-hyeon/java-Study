package array;

import java.util.Random;

public class Ex03_배열예제2 {

	public static void main(String[] args) {
		// 배열에 랜덤값을 넣어주기
		
		Random rd = new Random();
		int [] array = new int[8];
		array[0]=0;
		array[1]=1;
		array[2]=2;
		array[3]=3;
		array[4]=4;
		array[5]=5;
		array[6]=6;
		array[7]=7;
		for (int i=0;i<8;i++) {
			array[i]=rd.nextInt(10);
		}
		for (int i=0;i<8;i++) {
			System.out.println(array[i]);
		}
//		for(int i = 0;i<array.length;i++) {
//			array[i]=rd.nextInt(10);
//		}
		
//		for(int i = 0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
		
	}

}
