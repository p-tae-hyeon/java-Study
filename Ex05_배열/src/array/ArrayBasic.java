package array;

public class ArrayBasic {

	public static void main(String[] args) {
		// 팀원들 이름 작성할 수 있는 변수 만들기.
//		String name1 ="송승호";
//		String name2 ="조용현";
//		//배열 : 배열은 같은 data타입을 담을 수 있는 연속된 공간.
		
		String[] names = new String[5];
		
		names[0] = "강인훈";
		names[1] = "송승호";
		names[2] = "박지승";
		names[3] = "임영주";
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
//		for(int i=0;i<5;i++) {
//			System.out.println(names[i]);
//		}
//		
//		for(String x:names) {
//			System.out.println(x);
//		}
		System.out.println(names);
		
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[5];
		
		System.out.println(numbers1);
		System.out.println(numbers2);
	}

}
