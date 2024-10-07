package array;

public class Ex02_배열예제1 {

	public static void main(String[] args) {
		// 배열 선언 및 생성
		// 자료형 [] 변수명 = new 자료형[배열의 크기];
		
		// 10칸짜리 배열을 생성
		
		// 배열의 초기값을 미리 지정해서 생성하는 방법 : {}(중괄호)를 이용한다.
		// 이때, 배열의 크기는 입력한 초기값의 갯수와 같다.
		// 배열의 크기확인하는 방법: .length
		int [] num = {13,5,7,1,3,32,55,65,8,99};
		System.out.println("배열의 크기 : "+num.length);
		int[] num1 = new int[10];
		num1[0]=13;
		num1[1]=5;
		//.......
				
		
		// for문을 이용해서 출력
		// 배열의 크기 출력 .length
		System.out.println(num.length);
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}

	}

}
