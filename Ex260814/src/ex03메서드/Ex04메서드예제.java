package ex03메서드;

import java.util.Scanner;

public class Ex04메서드예제 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : "+result);
		
		sc.close();
	}
	public static int close10(int num1, int num2) {
		
		// 삼항 연산자
		int diff1 = num1>10 ? num1 - 10 : 10 - num1;
		int diff2 = num2>10 ? num2 - 10 : 10 - num2;
		
		if (diff1 < diff2) {
			return num1;
		}else if (diff1 > diff2) {
			return num2;
		}else {
			return 0;
		}
		
		
	}
	

	
	
	
	
	
	
	
	
}
