import java.util.Scanner;

public class Ex02_입출력 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		int num;
		System.out.println("이름을 입력해주세요.");
		a=sc.next();
		System.out.println("나이를 입력해주세요.");
		num=sc.nextInt();
		
		
		System.out.println(a);
		System.out.println(num);
	}

}
