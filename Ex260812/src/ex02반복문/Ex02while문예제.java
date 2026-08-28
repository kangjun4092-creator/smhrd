package ex02반복문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		int sum = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt(); 
			
			// 입력받은 num 누적하기
			sum += num ;  
			System.out.println("누적결과 : " + sum);
			
			if (num == -1) {
				
				break;
			}
			
		}
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
	}

}
