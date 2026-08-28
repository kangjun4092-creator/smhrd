package ex01복습;

import java.util.Scanner;

public class Ex01복습 {

	public static void main(String[] args) {

		
		// 1. 변수 : 데이터를 저장하는 공간
		// 자료형 변수명 = 데이터 값;
		int age = 20;
		
		// 2. 데이터 타입
		// float
		float f = 20.3f;
		// char
		// double
		// String
		// int
		// boolean
		
		
		// 3. 출력문
		System.out.println();  // 출력 후 줄바꿈
		System.out.print(""); // 출력 후 줄바꿈x 
		
		// 4. 입력문
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();   // 문자열 입력
		int b = sc.nextInt();  // 정수 입력
		
		// 5. 형변환
		// 자동 형변환
		int num = 10;
		double result = num;
		// 강제 형변환
		double num2 = 10.5;
		int result2 = (int) num2;
		
		sc.close();
		
		
		
		
		
		
		
	}

}
