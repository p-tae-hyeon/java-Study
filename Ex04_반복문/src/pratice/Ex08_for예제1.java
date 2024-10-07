package pratice;

public class Ex08_for예제1 {

	public static void main(String[] args) {
		// 10부터 72까지 2씩 증가하며 출력
		for (int i =10;i<=72;i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 94 부터 3까지 1씩 감소
		for (int i=94;i>=3;i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		// 21부터 57까지 짝수만 출력하기
		
		for (int i =21;i<=57;i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
			}
		}
	}

}
