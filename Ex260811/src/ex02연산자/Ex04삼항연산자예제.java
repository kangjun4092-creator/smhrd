package ex02연산자;

import java.util.Scanner;

public class Ex04삼항연산자예제 {

	public static void main(String[] args) {

		// 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 결과 값을 출력하는 프로그램을 만들어보자!
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 정수 입력 : ");
		int num = sc.nextInt();
		
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num > num2 ? (num - num2) :(num2 - num);
		System.out.println("두 수의 차 : "+result);
		
		
		sc.close();
		
		
		
		
	}

}
