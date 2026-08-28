package view;

import java.util.Scanner;

import model.Member;

// View
// 사용자에게 데이터를 입력받거나 
// 사용자에게 결과를 출력하는 역할

public class MemberView {

	
	Scanner sc = new Scanner(System.in);
	
	// 회원 정보 입력 화면
	public Member inputMember() { 
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		
		return new Member(id, name, age); //model[패키지]의 Member 클래스 참조(객체생성)
										  //(생성된 Member 객체를 Controller로 반환)
	}
	
	// 회원 정보 출력
	public void printMember(Member member) {
		
		System.out.println("====회원 정보====");
		System.out.println("아이디 : " + member.getId());
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
	}   // model [패키지]의 Member 클래스의 getter 메서드 참조 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
