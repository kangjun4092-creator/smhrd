package ex03조건문;

import java.util.Scanner;

public class Ex02단순if문예제 {

	public static void main(String[] args) {
		
		
		// 1. Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		
		// 2. 정수 입력받기
		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();
		
		
		// 3. 입력받은 수 판단 -> 조건문(if)
				// 3의 배수인지 ? 3으로 나눈 나머지 0
				// 5의 배수인지 ? 5로 나눈 나머지 0
				// 두 조건 모두 만족하기 AND 연산자 &&
		
		if (num % 3 == 0 && num % 5 == 0){
			  System.out.println("3과 5의 배수입니다");
			}
		
		
//		if , else if 문 사용
		
//		if (num % 3 == 0) {
//			System.out.println("3과 5의 배수입니다");
//		}
//		
//		else if (num % 5 ==0) {
//			System.out.println("3과 5의 배수입니다");
//		}
//		
//		else {
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
