package ex02반복문;

import java.util.Scanner;

public class Ex05for문예제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		for (int i=num;i<=num2;i++) {
			System.out.println(i);
			sum += i; 
			
		}
		System.out.print("합: "+sum);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
