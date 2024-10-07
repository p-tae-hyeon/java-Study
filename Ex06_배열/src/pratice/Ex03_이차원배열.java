package pratice;

public class Ex03_이차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int cnt = 0;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = cnt++;
			}
		}
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
		
		for(int j=0;j<array.length;j++) {
			for(int i=array[j].length-1;i>=0;i--) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
