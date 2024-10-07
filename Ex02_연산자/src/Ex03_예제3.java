import java.util.Scanner;

public class Ex03_예제3 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 =sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 =sc.nextInt();
		// 두 수의 더하기
		int result = num1+num2;
		System.out.println("두 수의 더하기 : "+(num1+num2));
		System.out.println("두 수의 더하기 : "+result);
		// 두 수의 빼기
		int result1 = num1-num2;
		System.out.println("두 수의 빼기 : "+(num1-num2));
		System.out.println("두 수의 빼기 : "+result1);
		// 곱하기
		System.out.println("두 수의 곱하기 : "+ num1*num2);
		// 나누기
		System.out.println("두 수의 나누기(몫) : "+num1/num2);

	}

}
