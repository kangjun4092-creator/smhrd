package ex02반복문;

import java.util.Scanner;

public class Ex03dowhile문 {

	public static void main(String[] args) {

		// do-while문
		// 입력된 수가 10보다 크면 종료되는 반복문 만들기
		
//		do {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("정수 입력 : ");
//			int num = sc.nextInt();
//			
//			if(num>10) {
//				break;
//			}
//			
//		}while(true);
		
		//1. 숫자를 입력받기
		Scanner sc = new Scanner(System.in);
		//2. 입력받은 숫자가 0이 아니라면 계속 반복
		//0이면 종료
		//do-while문 
		
		int num ;
		
		do {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();
		}while(num != 0);
		
		
		
		
		
		
		
		
		
		
	}

}
