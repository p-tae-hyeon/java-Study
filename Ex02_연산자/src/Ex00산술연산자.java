
public class Ex00산술연산자 {

	public static void main(String[] args) {
		//자동형변환
		
		System.out.println(1+2+"3");
		System.out.println("1"+2+3);
		System.out.println(1+"2"+3);
		System.out.println();
		
		// 비트연산자
		// 10 2진수 -> 1010
		
		int num = 10;
		System.out.println(num<<1); // 1010 -> 10100
		System.out.println(num>>1); // 1010 -> 101 
	}

}
