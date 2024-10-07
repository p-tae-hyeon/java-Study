package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//3명의 학생 이름과 성적을 저장하고 출력하는 프로그램 작성.
		Scanner sc =new Scanner(System.in);
		ArrayList<StudentVO> students = new ArrayList<StudentVO>(); //객체 ArrayList
		StudentVO[] students2 = new StudentVO[3]; //객체 배열
		
		// 객체 배열
		System.out.println("=======성적입력=======");

		for(int i=0;i<3;i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("성적을 입력하세요 : ");
			int score = sc.nextInt();
			StudentVO temp = new StudentVO(name, score);
			students.add(temp); 
			
			
		}
		
		System.out.println(students.get(0).getName());
		
	}
}
