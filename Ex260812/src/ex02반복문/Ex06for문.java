package ex02반복문;

public class Ex06for문 {

	public static void main(String[] args) {

		// for문
		// 반복 횟수가 정해져 있을 때 사용
		
//		for(초기화 구문; 검사조건; 반복 후 작업) {
//			
//		}
		
		//1. "반복문 만들기" 문장 4번 출력하기
		
//		for(int i = 1; i<=4; i++) {
//			System.out.println("반복문 만들기");
//		}
		
		
		// 73부터 시작해서 96까지 하나씩 커지면서 반복해주세요
		// i 출력
		
		for(int i = 73; i <= 96; i++){
			System.out.print(i+" ");
		}
		
		System.out.println();
		// 96부터 시작해서 73까지 하나씩 작아지면서 반복해주세요
		// j 출력
		
		for(int j = 96; j >= 73; j--) {
			System.out.print(j+" ");
		}
		
		
		
	}

}
