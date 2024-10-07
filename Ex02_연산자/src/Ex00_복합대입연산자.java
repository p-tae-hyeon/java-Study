
public class Ex00_복합대입연산자 {

	public static void main(String[] args) {
		// 대입연산자
		// A= A+3
		// 대입연산자는 대입 연산자 뒤에있는 식이 먼저 실행이 된다.
		int num =10;
		num=num+10;
		System.out.println(num);
		// 복합대입 연산자
		// A+=3
		int num1 =10;
		num1 += 10;
		System.out.println(num1);
		num1 -= 10;
		System.out.println(num1);
		num1 *= 10;
		System.out.println(num1);
		num1 /= 10;
		System.out.println(num1);
		

	}

}
