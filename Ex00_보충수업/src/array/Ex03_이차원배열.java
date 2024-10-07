package array;

public class Ex03_이차원배열 {

	public static void main(String[] args) {
		// 5*5배열 만들기
		int [][] array = new int[5][5];
		
		// 0~24까지 수 넣어주기
		int cnt =0;
		for(int i=0 ; i<array.length;i++) {
			for(int j=0; j<array[i].length ;j++) {
				array[i][j]=cnt++;
			}
		}
		
		// 지그재그로 출력하기
		
//		for(int i=0 ; i<array.length;i++) {
//			for(int j=0; j<array[i].length ;j++) {
//				if(i%2==1) {
//					System.out.print(array[i][4-j]+"\t");
//				}else {
//					System.out.print(array[i][j]+"\t");					
//				}
//			}
//			System.out.println();
//		}
		for(int i=0 ; i<array.length;i++) {
			if(i%2==1) {
				for(int j=array[i].length-1;j>=0;j--) {
					System.out.print(array[i][j]+"\t");
				}
			}else {
				for(int j=0; j<array[i].length ;j++) {
					System.out.print(array[i][j]+"\t");					
					
				}
				
			}
			
			System.out.println();
		}
		
		
		
	}

}
