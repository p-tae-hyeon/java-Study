
public class Ex00논리연산자 {

	public static void main(String[] args) {
		
		//비트논리연산
		// 종류 : ~,|,&,^
		// 정의 : 각 비트를 비교하는 연산자.
		int num1 =0;
		int num2 = ~num1;
		System.out.println(num2);
		//num1 -> 00000000 00000000 0000000 00000000;
		//num2 -> 11111111 11111111 11111111 11111111;
		
		// | 모든 비트를 OR한다.
		// & 모든 비트를 AND한다.
		int num3 = 10;//1010
		int num4 = 12;//1100
		
		System.out.println(num3|num4);
		System.out.println(num3&num4);

	}

}
