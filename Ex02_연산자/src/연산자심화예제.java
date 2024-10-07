import java.util.Scanner;

public class 연산자심화예제 {

	public static void main(String[] args) {
		//문제 : 사용자의 입력을 받아서, 10↓어린이, 20↓청소년, 30↓청년 나머지 중장년
		
		//1. 사용자 입력받기.
		Scanner sc = new Scanner(System.in);//도구 만들기.
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		//2. 값 만들기.
		String result = age<10?"어린이":age<20?"청소년":age<35?"청년":"중장년";
		System.out.println(age+"살은 "+result+"입니다.");
	}

}
