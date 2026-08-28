package ex03조건문;

import java.util.Scanner;

public class Ex03ifelse문 {

	public static void main(String[] args) {

		// if - else문
		// true 이면 if 문 안에 있는 문장 실행
		// false 이면 else문 안에 있는 문장 실행
		
		
//		int money = 10000;
//		
//		if(money > 10000) {
//			System.out.println("택시타자");
//		}else {
//			System.out.println("버스타자");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		if (grade >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
