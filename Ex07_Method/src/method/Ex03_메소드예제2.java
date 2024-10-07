package method;

public class Ex03_메소드예제2 {

	public static void main(String[] args) {


		System.out.println(bigNum(1,1));

	}

	
	public static int bigNum(int num1, int num2) {
		
		if(num1>num2) {
			return num1;
		} else if(num2>num1) {
			return num2;
		}else {
			return 0;
		}
		
	}
	
	
	
	
	
	
}
