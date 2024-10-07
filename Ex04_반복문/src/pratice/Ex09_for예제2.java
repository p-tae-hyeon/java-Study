package pratice;

public class Ex09_for예제2 {

	public static void main(String[] args) {
		
		// 1부터 100까지 더한 값 출력
		
		int result = 0;
		
//		for(int num = 1;num<=100;num++) {
//			result= result + num;
//			// result += num;
//		}
//		System.out.println(result);
//		
//		// 1부터 100까지 홀수는 더하고 짝수는 뺀 값
//		
//		result=0;
		
//		for(int num = 1;num<=100;num++) {
//			if(num%2==0) {
//				result-=num;
//			}else {
//				result+=num;
//			}
//			System.out.println(result + " "+ num);
//		}
//		
//		System.out.println(result);
		
		// (77 *1) + (76*2) + (75*3)....... (1* 77)
		
		// (78- 1)* 1
		
		for(int num = 5;num>=1;num--) {
			result += num*(6-num);
			System.out.println(num +"*"+(6-num));
			System.out.println(result);
		}
		
		
		
		
		

	}

}
