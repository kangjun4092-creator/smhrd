package ex03조건문;

import java.util.Scanner;

public class Ex04다중if문 {

	public static void main(String[] args) {

		
		// 다중 if문
		// 조건식이 여러개 일때 사용
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		System.out.print("카페 메뉴를 고르세요 : ");
		int menu = sc.nextInt();
		
		// (1) 아이스아메리카노 (2) 카페라떼 (3) 블루베리스무디
		// 해당하는게 없으면 물
		
		if (menu == 1) {
			System.out.println("아이스아메리카노");
		}else if(menu == 2) {
			System.out.println("카페라떼");
		}else if(menu == 3) {
			System.out.println("블루베리스무디");
		}else {
			System.out.println("물");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
