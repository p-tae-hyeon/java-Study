package method;

public class Ex06_메소드예제5 {

	public static void main(String[] args) {

		System.out.println(findNearTen( 9 , 14));

	}

	public static int findNearTen(int num1, int num2) {

		int result1 = 10 - num1;
		int result2 = 10 - num2;
		
		if(result1<0) {
			result1*=-1;
		}
		if(result2<0) {
			result2*=-1;
		}
		if(result1>result2) {
			return num2;
		}else if(result1<result2) {
			return num1;
		}else {
			return 0;
		}
	}

}
