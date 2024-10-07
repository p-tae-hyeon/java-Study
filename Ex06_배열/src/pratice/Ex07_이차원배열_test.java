package pratice;

public class Ex07_이차원배열_test {

	public static void main(String[] args) {
		int[][] array = new int[3][8];
		int cnt=1;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=cnt++;
			}
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=7;i>=0;i--) {
			for(int j=0;j<3;j++) {
				System.out.print(array[j][i]+ " ");
			}
			System.out.println();
		}
		

	}

}
