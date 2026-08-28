package ex02입출력;

import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {

		// 출력문
		// 한줄 복사 : ctrl + alt + 방향키
		System.out.println("안녕하세요");
		System.out.println("이름 : 강준");
		
		//입력문
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름을 입력받기
		System.out.println("이름: ");
		
		// 2. 입력받은 이름을 문자열로 리턴
		String name = sc.next();
		
		// 3. 이름 출력하기
		System.out.println(name);
		
		
		
		
		//1. 나이를 입력받기
		System.out.print("나이: ");
		
		
		//2. 입력받은 나이를 정수형으로 리턴 (nextInt())
		int age = sc.nextInt();
		
		//3. 나이 출력하기
		System.out.println(age);
		
		sc.close();
	}

}
