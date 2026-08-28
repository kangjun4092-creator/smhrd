package arraylist;

import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {

		// 1. 선언 방법
		// 배열
		int[] arr = new int[5];
		
		// arr랑 arrlist 차이점 : arr는 데이터값을 바로 넣을수 있고,  arrlist는 메서드를 통해 데이터를 넣음(import 필요)
		
		// ArrayList(가변리스트) : `메서드`를 활용해서 데이터를 넣음 (import필요함)
		// 제네릭기법->  <데이터타입>
		// ArrList는 import해야함 !! => 클래스 안에 있는 메소드를 활용해서 데이터를 추가, 삭제 해야하기 떄문
		// ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입`생략가능>();
		// () : 메서드를 사용해서 ArrayList를 생성
		// 데이터타입 : 객체타입으로 존재, int의 객체타입은 Integer
		// 생성 시 크기를 지정하지 않는다 (가변리스트)
		
		// ArrayList import
		ArrayList<Integer> arrList = new ArrayList<>();    // 앞쪽에 타입이 명시되어있으면 뒤쪽은 생략가능함.
		
		// 2. 값 추가
		// 배열
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// ArrayList
		// 변수명.add(데이터);  -> 마지막에 추가
		// 변수명.add(인덱스,데이터);   -> 원하는 위치에 추가
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		
		// 3. 크기 조회
		System.out.println("배열의 크기 : " + arr.length);
		System.out.println("ArrayList크기 : " + arrList.size());
		
		// 4. 값 조회
		// 배열
		System.out.println("배열의 1번 인덱스 : " + arr[1]);
		
		// ArrayList 값 조회
		// 변수명.get(인덱스번호)
		System.out.println("ArrayList 2번 인덱스 : " + arrList.get(2));
		
		
		// for문 활용해서 ArrayList 값 전체 조회
		for (int i = 0;i<arrList.size();i++) {
			System.out.print(arrList.get(i)+" ");
		}
		
		System.out.println();
		
		// 확장 for 문
		// for( 데이터 선언 : 배열 or 리스트 ){
		//	실행구문;
		// }
		for (int i : arrList) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 5. 값 삭제
		// 원하는 위치의 값 삭제 : 변수명.remove(인덱스);
		// 모든 값 삭제 : 변수명.clear();
		arrList.remove(0);
		System.out.println("삭제 후 ArrayList크기 : " + arrList.size());
		
		arrList.clear();
		System.out.println("전체 삭제 후 ArrayList크기 : " + arrList.size());
		
		
		
	}//

}
