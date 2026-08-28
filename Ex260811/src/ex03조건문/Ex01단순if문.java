package ex03조건문;

import java.util.Scanner;

public class Ex01단순if문 {

	public static void main(String[] args) {

		// 1. Scanner 가져오기
		Scanner sc = new Scanner(System.in);
		
		
		// 2. 나이를 입력받기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		
		// 3. if문 사용해서 저장된 값이 20 보다 크거나 같은지 판단!
		if (age >= 20) {
			System.out.println("성인입니다");
		}
		
		
		// 4. 삼항연산자로 해보기 (복습)
		
//		String result = age >= 20 ? "성인입니다":"" ;
//		System.out.println(result);
		
		
		
		sc.close();
		
		
		
		
	} //main 끝

} // class 끝
