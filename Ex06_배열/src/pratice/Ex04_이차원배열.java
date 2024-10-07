package pratice;

public class Ex04_이차원배열 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];

		int cnt = 0;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt++;
			}
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				if(j%2==1) {
					System.out.print(array[j][4-i] + "\t");
				}else {
					System.out.print(array[j][i] + "\t");
				}
				
			}
			System.out.println();
		}
		

	}

}
