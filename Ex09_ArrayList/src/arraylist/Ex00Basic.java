package arraylist;

import java.util.ArrayList;

public class Ex00Basic {

	public static void main(String[] args) {
		
		//ArrayList 만들기.
		//ctrl + shift+ o : import가 필요한 모든 요소를 다 import
		ArrayList<String> array = new ArrayList<>();
		//객체를 만들때 <>는 변수의 데이터 타입을 따라간다.
		// 즉 생략 가능하다.
		
		//데이터 넣기
		array.add("제육덮밥");
		//데이터 넣기2
		array.add(1, "볶음밥");
		array.add("김치찌개");
		//데이터 꺼내기
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		
		//ArrayList의 크기 구하기
		System.out.println("리스트의 크기는 : "+array.size());
		
		//ArrayList의 데이터 삭제하기
		array.remove(0);
		//ArrayList 데이터 삭제2
		array.remove("볶음밥");
		
//		for(int i=0;i<array.size();i++) {
//			System.out.println(array.get(i));
//		}
		
		for(String x:array) {
			System.out.println(x);
		}
		
		//리스트 내용물 전부 지우기
		array.clear();
		
		//isEmpty 사용해보기
		System.out.println("비었니?"+array.isEmpty());
		
		
		
	}

}
