package ex01복습;

public class Ex01복습 {

	public static void main(String[] args) {

		// 이중 for문
		// for(초기화; 조건식; 증감식)
		// 바깥 for문 1번 실행될때 안쪽 for문이 모두 실행됨
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println("*");
			}
		}
		
		// 2. 배열
		// 같은 자료형의 데이터를 여러 개 저장
		// 배열의 번호(인덱스)는 0부터 시작
		
		int[] array = {1,2,3};
		int[] array2 = new int[3];
		
		array[0] = 1;
		
		// 배열 + for문
		// 배열의 크기 : 배열이름.length
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	
	
		
		
		
		
		
		
	}

}
