package pratice;

public class Ex06_이차원배열_JavaFestival {

	public static void main(String[] args) {
		//숫자가 1~25까지 원본으로 출력하기
		//90도 왼쪽으로 돌려서 하나 출력
		
		int[][] array = new int[3][8];
		int cnt =1;
		
		// 1. 1~25까지의 숫자를 2차원배열에 담는 코드
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=cnt++;
			}
		}
		// 1-1. 입력이 제대로 되었는지 확인하기.
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		// 2. 담긴 2차원배열을 그대로 출력하는 코드
//		System.out.println("원본");
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				System.out.printf("%3d",array[i][j]);
//			}
//			System.out.println();
//		}
		
//		// 3. 90도 회전한 배열을 출력하는 코드
//		System.out.println("90도 회전");
//		for(int i=array.length-1;i>=0;i--) {
//			for(int j=0;j<array[i].length;j++) {
//				System.out.printf("%3d",array[j][i]);
//			}
//			System.out.println();
		}

	}


