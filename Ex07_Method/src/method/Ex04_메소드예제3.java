package method;

public class Ex04_메소드예제3 {

	public static void main(String[] args) {

		System.out.println(pn(0));

	}
	
	public static String pn(int num) {
		
		if(num>0) {
			return "양수입니다";
		}else if(num<0) {
			return "음수입니다";
		}else {
			return "0입니다.";
		}
	}

}
