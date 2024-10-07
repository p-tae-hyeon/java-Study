package method;

public class Ex07_메소드예제6 {

	public static void main(String[] args) {
		// 1000이하의 완전수 찾기
		for(int i =1 ; i<=1000;i++) {
			if(perfectNum(i)) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		// 100이하 소수찾기 
		for(int i =1 ; i<=100 ; i++) {
			if(primeNum(i)) {
				System.out.print(i+"\t");
			}
		}
	}
	
	// 완전수 찾기
	public static boolean perfectNum(int num) {
		int sum =0;
		
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
		
	}
	
	// 소수찾기
	public static boolean primeNum(int num) {
		// 약수가 1과 자신만 있는 수
		int cnt =0;
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		
		
		return cnt==1;
		
	}
	
	
	

}
