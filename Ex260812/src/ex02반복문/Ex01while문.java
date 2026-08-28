package ex02반복문;

import java.util.Scanner;

public class Ex01while문 {

	public static void main(String[] args) {

		//while문
		//while문의 종료조건 -> break
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt(); 
		
			// 입력한 num이 10보다 큰 수 인지 아닌지 판단!
			if(num > 10) {
				//System.out.println("프로그램 종료");
				break;
			}
			
			
			
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
	}

}
