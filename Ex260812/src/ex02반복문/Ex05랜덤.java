package ex02반복문;

import java.util.Random;
import java.util.Scanner;

public class Ex05랜덤 {

	public static void main(String[] args) {

		while(true) {
		      //랜덤수 2개 사용해서 문제 출제!
		      // ex) 3+4 =
		      Random rd = new Random();
		      int num1 = rd.nextInt(10)+1; // 1~10
		      int num2 = rd.nextInt(10)+1; // 1~10
		      
		      System.out.print(num1 + "+" + num2 +"=");
		      // 정답을 입력할수 있도록 구조 생성
		      Scanner sc = new Scanner(System.in);
		      int sum = sc.nextInt();
		      
		      //정답 입력시 성공(Success)/실패(Fail) 여부를 판단하여 출력
		      if(sum ==num1+num2) {
		         System.out.println("Success");
		      }else {
		         System.out.println("Fail");
		         System.out.print("게임을 계속 진행하겠습니까? >>");
		         String yn =sc.next();
		         
		         //System.out.println(yn);
		         
		         // 내가 입력한 yn이 "Y"와 같은지 판단!
		         if(yn.equals("N") || yn.equals("n")) {
		            System.out.println("프로그램 종료");
		            break;
		         }
		         }
		         
		         }// while 종료
		
		// 0 ~ 9 정수 10개
		// (Math.random()*개수) + 시작값
//		int num3 = (int)(Math.random()*10);
//		
//		int num4 = (int)(Math.random()*21)-10;
//		System.out.println(num4);
		
		
	
		
		
		
	}

}
