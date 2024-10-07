package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01Team {

	// 1. 변수 및 객체들을 모아두는 곳,.
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {

		// List<String> names2 = new ArrayList<String>();
		// String[] names3 = new String[5];

		// ArrayList는 데이터를 꺼낼때, 그냥 print해도 전체가 다 출력된다.
		// System.out.println(names);
		input();
		print();
		delete();
		print();
		update();
		print();
	
	}

	public static void input() {
		// 2. 사용자의 입력을 받아서 ArrayList에 저장하는 곳.
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			names.add(sc.next());
		}
	}
	
	public static void print() {
		// 3. 팀원 출력하는 곳.
		System.out.print("팀원은 ");
		for (String x : names) {
			System.out.print(x + " ");
		}
		System.out.println("입니다.");
	}
	public static void delete() {
		// 4. 팀원 삭제하는 곳.
		System.out.print("삭제할 이름을 입력 : ");
		String inData = sc.next();
		names.remove(inData);
		System.out.println(inData + " 팀원 삭제");

		System.out.println(names);
	}
	
	public static void update() {
		//5. 팀원변경
		System.out.print("변경할 사람은 누구?");
		String inData = sc.next();
		System.out.print("무엇으로 변경?");
		String Data = sc.next();
		
		for(int i=0; i<names.size();i++) {
			if(names.get(i).equals(inData)) {
				names.set(i,Data);
			}
		}
	}

}
