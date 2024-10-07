package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.MemberVO;

public class Main {

	public static void main(String[] args) {
		
		// view : 사용자가 사용하며, 시각적인 작업을 진행 할 수 있는 곳
		//        필요한 데이터나 정보에 대해서 단순히 표시만 할 뿐
		//        특별한 기능은 수행하지 않는다!!!!
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]가입 [2]로그인 [3]수정 [4]탈퇴 [5]전체회원정보 [6]종료");
			int choice = sc.nextInt();
			
			if(choice ==1){
				System.out.print("아이디를 입력하세요 : ");
				String id =sc.next();
				System.out.print("비밀번호를 입력하세요 : ");
				String pw = sc.next();
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.println("나이를 입력하세요 : ");
				int age = sc.nextInt();
				System.out.println("점수를 입력하세요 : ");
				int score = sc.nextInt();
				
				MemberVO vo = new MemberVO(id, pw, name, age, score);
				
				Controller cont = new Controller();
				int result = cont.contInsert(vo);
				
				if(result >0) {
					System.out.println("회원가입 성공!");
					System.out.println("축하드립니다~!");
				}else {
					System.out.println("회원가입 실패....");
				}
				
			}else if(choice ==2) {
				System.out.print("아이디 >> ");
				String id = sc.next();
				System.out.print("비밀번호 >> ");
				String pw = sc.next();
				
				MemberVO vo = new MemberVO(id,pw);
				Controller cont = new Controller();
				String strId =cont.contSelect(vo);
				
				if(strId != null) {
					System.out.println("로그인 성공!!");
					System.out.println(strId + "님 환영합니다!");
				}else {
					System.out.println("로그인 실패...");
					System.out.println("아이디와 비밀번호를 다시 확인해주세요!");
				}
				
			}else if(choice == 3) {
				System.out.print("아이디 >>");
				String id = sc.next();
				System.out.print("비밀번호 >>");
				String pw = sc.next();
				System.out.print("점수 입력 >>");
				int score = sc.nextInt();
				
				MemberVO vo = new MemberVO(id, pw,score);
				Controller cont = new Controller();
				int result =cont.contUpdate(vo);
				
				if(result>0) {
					System.out.println("점수 수정 성공!!");
				}else {
					System.out.println("점수 수정 실패..");
				}
			}else if(choice ==4) {
				System.out.print("아이디 >> ");
				String id = sc.next();
				System.out.print("비밀번호 >> ");
				String pw = sc.next();
				
				MemberVO vo = new MemberVO(id,pw);
				Controller cont = new Controller();
				int result =cont.contDelete(vo);
				
				if(result>0) {
					System.out.println("회원탈퇴 성공....");
				}else {
					System.out.println("회원탈퇴 실패!!!");
				}
				
			}else if (choice == 5) {
				System.out.println("====== 전체 회원 리스트 ======");
				
				MemberVO vo = new MemberVO();
				Controller cont = new Controller();
				ArrayList<MemberVO> array=cont.contSelectAll();
				for(MemberVO x : array) {
					System.out.println("ID : "+x.getId()+ ", PW : "+x.getPw()+", 이름 : "+x.getName()+ ", 나이 : "+x.getAge() + ", 점수 : "+x.getScore());
				}
				
			}else if (choice==6) {
				System.out.println("프로그램 종료~!");
				break;
			}else {
				System.out.println("6이하의 숫자를 입력해주세요!!!!!!");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
