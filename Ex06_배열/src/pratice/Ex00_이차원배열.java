package pratice;

public class Ex00_이차원배열 {

	public static void main(String[] args) {
		// 1차원 배열과 2차원 배열의 차이를 알아볼겁니다.
		
		// 1차원 배열
		
		int [] array1 = new int[10];
		// 10칸짜리 그냥 1차원 배열
		// 각각 인덱스에 숫자를 채워볼겁니다
		
		for(int i =0; i<10;i++) {
			array1[i]=i;
		}
		
//		for(int i =0; i<10;i++) {
//			System.out.println(array1[i]);
//		}
		
		// 2차원 배열
		
		int [][] array2 = new int [5][5];
		// 2차원이기 때문에 5*5 = 25칸짜리 배열이 만들어짐
		
//		System.out.println(array2);
//		// 5칸짜리 첫 번째 배열이 들어있는 주소
//		System.out.println(array2[0]);
//		// 또 다시 주소가 저장되어있음
		// 이제 이차원배열에 숫자를 채워볼건데
		// 0 0
		// 0 1
		// 0 2
		// 0 3
		// 0 4
		// 1 0
		// .
		// 5 5
		// 아까 1차원 배열에서 숫자를 채웠던 코드 복사해서 가져오기
		
		for(int j=0;j<5;j++) {
			for(int i =0; i<5;i++) {
				array2[j][i]=i;
			}			
		}
		
		for(int j=0;j<5;j++) {
			for(int i =0; i<5;i++) {
				System.out.print(array2[j][i]);
			}
			System.out.println();	
		}
		
	}

}
