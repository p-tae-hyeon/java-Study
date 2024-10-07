package array;

import java.util.Random;

public class Ex10MinMax {

	public static void main(String[] args) {
		// 1. 배열 초기화.(랜덤한 값으로)
		int[] array = new int[10];
		Random random = new Random();
		
		for(int i=0;i<array.length;i++) {
			array[i] = random.nextInt(100)+1;
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		int max = array[0]; // 0, 1
		int min = array[0]; //100;
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min= array[i];
			}
		}
		
		System.out.println("가장 큰 수 : "+max);
		System.out.println("가장 작은 수 : "+min);
	

	}

}
