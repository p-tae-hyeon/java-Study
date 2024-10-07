package pratice;

import java.util.Random;

public class Ex05_Random {

	public static void main(String[] args) {
		// 랜덤 사용법
		Random rd =new Random();
		
		int a = rd.nextInt(100);
		System.out.println(a);
	}

}
