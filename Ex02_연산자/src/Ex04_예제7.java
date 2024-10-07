import java.util.Scanner;

public class Ex04_예제7 {

	public static void main(String[] args) {
		// 나이를 숫자 하나를 입력받아서
		Scanner sc =new Scanner(System.in);
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		// 그 나이가 10보다 작으면 어린이 출력
		// 20보다 작으면 학생
		// 나머지는 성인
		System.out.println(age<10?"어린이":(age<20?"학생":"성인"));

	}

}
