package method;

public class Ex02_메소드예제1 {

	public static void main(String[] args) {

		System.out.println(plus(10, 10));
		int plus = plus(10, 10);
		System.out.println(plus);
		System.out.println(minus(10, 5));
		System.out.println(mul(10, 10));
		System.out.println(div(10, 2));

		String snack = Ex01_메소드맛보기.snack();
		System.out.println(snack);
		
//		System.out.println(cal(10,10,"+"));
//		System.out.println(cal(10,5,"-"));
//		System.out.println(cal(10,10,"*"));
//		System.out.println(cal(10,2,"/"));
		cal(10,10,"+");
		cal(10,5,"-");
		cal(10,10,"*");
		cal(10,2,"/");
		
		
		
	}// 메소드 만들 떄는 메소드 밖에!!!
	
	public static void cal(int num1,int num2, String oper) {
		int result = 0;
		
		if(oper.equals("+")) {
			result = num1+num2;
		}else if(oper.equals("-")){
			result = num1-num2;
		}else if(oper.equals("*")) {
			result = num1*num2;
		}else if(oper.equals("/")) {
			result = num1/num2;
		}
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

}// 클래스 안에 만들어야 합니다!!!
