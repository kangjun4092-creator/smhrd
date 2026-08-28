package ex02연산자;

import java.util.Scanner;

public class Ex01산술연산자예제 {

	public static void main(String[] args) {

		//1. Scanner 도구 필요 -> import
		Scanner sc  = new Scanner(System.in);
		
		
		
		//2. sc기능을 사용하여 데이터 입력받기 + 데이터 저장(변수)
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		
		//3. 백의 자리수 구하기
//		int result = (num / 100) * 100;
//		System.out.println(result);
		
		//4. 나머지 구하기
//		int result = num % 100;
//		System.out.println("결과 값 : " + (num - result));
		
		
		//5. 문자열 더하기
		int result = num/100;
		System.out.println(result + "00");
		
		
//		int result = ((num / 100) % 10) * 100;
//		System.out.println("결과 값 : " + result);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
