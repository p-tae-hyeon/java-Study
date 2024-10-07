package pratice;

public class Ex01_이차원배열 {

	public static void main(String[] args) {
		// 5행 5열 2차원 배열을 선언하고 
		
		int[][] array = new int[5][5];
		
		// 1~25까지 초기화하세요 == 값을 넣어주세요
		
		// 배열의 칸수 5*5 =25개
		// 25번 반복하는 반복문을 사용해서 값을 넣어줄겁니다.
		// 반복하는 개수를 세어주는 변수를 만들어서 값을 채워주면 
		// 1~25까지 1씩 증가하면서 값을 채워줄 수 있겠죠?
		int cnt = 1;
		
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				array[j][i]=cnt++;
			}
		}
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();
		}	
		

	}

}
