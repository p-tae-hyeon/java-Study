package array;

public class Ex02_이차원배열 {

	public static void main(String[] args) {
		// 5*5배열을 만들고
		int[][] array = new int[5][5];
		// 0~24까지 넣어주기
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = cnt++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}

	}

}
