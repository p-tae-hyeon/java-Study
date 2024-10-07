package array;

import java.util.Scanner;

public class Ex08DataSerch {

	public static void main(String[] args) {
		// 1. 5개의 String 데이터를 저장할 수 있는 names 배열을 생성하고,
		// 우리팀원의 이름으로 초기화하기.

		String[] names = { "송승호", "송찬호", "송은호", "김별", "박태현" };

		// 2. 이름을 입력받아서, 몇번째 위치에 있는지 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력 : ");
		String inputName = sc.next();

		boolean check = true; // 만약에 같은 타입의 데이터가 있으면 false로 바꿀거야. 아니면 true 그대로.
		// 2-1. for문을 이용해서 names에 있는 데이터가 무엇인지 하나씩 확인하기.
		for (int i = 0; i < names.length; i++) {
			// System.out.println(names[i]);
			// 2-2. 입력한 이름과 배열의 이름이 같은지 확인하기.
			if (names[i].equals(inputName)) {
				System.out.println(i + "번째와 같아용");
				check = false;
			} else {
				check = true;
			}

		}
		if (check) {
			System.out.println("존재하지 않습니다.");
		}

	}

}
