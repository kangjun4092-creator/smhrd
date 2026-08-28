package ex02연산자;

import java.util.Scanner;

public class Ex03삼항연산자 {

	public static void main(String[] args) {

		
		//삼항 연산자
		//조건식 ? 참: 거짓
		 
		//1. Scanner 불러오기
		Scanner sc = new Scanner(System.in);
		
		//2. 정수를 입력받기
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//3. 입력받은 숫자를 가지고 홀수/짝수 판단(삼항연산자 사용)
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		
		//4. 결과 출력하기
		
		System.out.println(num+"는(은)"+result+"입니다.");
		
		sc.close();
		
		
		
		
		
	}

}
