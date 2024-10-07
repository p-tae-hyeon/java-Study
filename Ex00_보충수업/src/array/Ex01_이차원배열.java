package array;

public class Ex01_이차원배열 {

	public static void main(String[] args) {
		// 1부터 25까지 증가하면서 값을 넣어줄겁니다!!!
		// 5행 5열 배열을 만들고///
		int[][] array = new int[5][5];
		
		// 모든 인덱스에 1을 넣어주기
		
//		array[0][0]=1;
//		array[0][1]=1;
//		array[0][2]=1;
//		array[0][3]=1;
//		array[0][4]=1;
		int cnt = 1;
		for(int j=0;j<=4;j++) {
			for(int i=0;i<=4;i++) {
				array[j][i]=i-j;
			}		
		}
		
		
		
		for(int j=0;j<=4;j++) {
			for(int i=0;i<=4;i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}
		

	}

}
