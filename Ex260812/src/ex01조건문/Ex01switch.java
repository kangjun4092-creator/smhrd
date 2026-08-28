package ex01조건문;

import java.util.Scanner;

public class Ex01switch {

	public static void main(String[] args) {

		// switch-case 문
		// 식과 데이터 값을 비교
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		
		
		switch (totalScore) {
		case 90 :
			System.out.println("A학점 입니다.");
			break;   // case문을 빠져나갈 수 있는 키워드
		
		case 80 :
			System.out.println("B학점 입니다.");
			break;
			
		case 70 :
			System.out.println("C학점 입니다.");
			break;
			
		default :  // else와 비슷한 기능
			System.out.println("D학점 입니다.");
			break;
		}
		
		
		
		
		
		
		
	}

}
