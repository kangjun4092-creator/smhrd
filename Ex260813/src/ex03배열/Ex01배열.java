package ex03배열;

public class Ex01배열 {

	public static void main(String[] args) {

		// 배열 [] : 동일한 타입의 데이터를 관리하는 것!

		// 1. 배열 선언하기
//		int[] array;
//		
//		// 2. 배열 생성하기
//		array = new int[3];  
		
		// 3. 배열 선언과 동시에 생성하기
		int[] array = new int[3]; 
		
		// 4. 배열 출력하기
//		System.out.println(array);  // 배열이 저장된 위치(주소) 값
		
		// 5. 배열에 데이터 저장하기
		// 	  배열의 칸을 지정하는 이름 -> 인덱스(0번 부터 시작)
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
//		System.out.println(array[0]);
		
		// 6. 배열의 데이터 값 변경
//		array[0] = 5;
//		System.out.println(array[0]);
		
		// 7. for문으로 array 데이터들 출력하기
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	
		
		// 8. 배열의 크기(길이)를 한번에 알아오는 방법
		
		System.out.println(array.length);
		
		
		// 9. 배열 초기화해서 생성
		int[] array2 = {1,2,3};
		
		System.out.println(array2[0]);
		
	}

}
