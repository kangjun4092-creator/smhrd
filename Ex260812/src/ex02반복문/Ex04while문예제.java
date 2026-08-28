package ex02반복문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {

		int now, goal, kg;
		int week = 1;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		goal = sc.nextInt();
		
		while(now > goal){
			System.out.print(week + "주차 감량 몸무게 :");
			kg = sc.nextInt();
			
			now -= kg;
			week++;
			
			if(now <= goal){
				System.out.println(now + "kg  달성!! 축하합니다");
				break;
			}
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
