package pratice;

public class Ex08_이차원배열 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열을 선언하고

		int[][] array = new int[5][5];

		// 1~25까지 넣어서 초기화하세요!

		int cnt = 1;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[j][i] = cnt++;
			}
		}
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
