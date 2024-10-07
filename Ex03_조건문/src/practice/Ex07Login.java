package practice;

import java.util.Scanner;

public class Ex07Login {

	public static void main(String[] args) {
		// 문제 : 로그인 프로그램. ID가 user이고 비밀번호가 pass이면 로그인성공.
		
		//1. 사용자 입력받기.
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.println("PW : ");
		String pw = sc.next();
		
		//1-1. 비교할 값 미리 만들어두기.
		final String ID="user";
		final String PW="pass";
		
		//2. ID가 user이고 비밀번호가 pass인 경우
		if(id.equals(ID) && pw.equals(PW)) {
			System.out.println("로그인에 성공했습니다.");
		//3. ID가 user가 아닌경우
		}else if(!id.equals(ID)) {
			System.out.println("아이디가 일치하지 않습니다.");
		//4. 비밀번호가 pass가 아닌경우
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		

	}

}
