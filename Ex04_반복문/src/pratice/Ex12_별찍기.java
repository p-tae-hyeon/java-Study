package pratice;

public class Ex12_별찍기 {

	public static void main(String[] args) {
		// 3행 3열 별찍기
		
		// 3번 반복하는 반복문 안에
		// System.out.print("*");
		// 이 코드가 실행문으로 들어가면 
		// 3번 반복해서 별을 찍을 수 있습니다.
		
		// 3번 반복하는 반복문 만들어보기
		for(int w=1;w<=3;w++) {
			for(int num = 1;num<=3;num++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
