package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Member;

// View
// 사용자가 입력 -> Scanner
// 결과를 출력 -> syso
public class MemberView {

	
	Scanner sc = new Scanner(System.in);
	
	
	// 메뉴 출력 화면
	public int printMenu() {
		
		System.out.println("====회원관리 프로그램====");
		System.out.println("1. 회원 등록");
		System.out.println("2. 전체 회원 조회");
		System.out.println("3. 회원 검색");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 >> ");
		int menu = sc.nextInt();
		
		return menu;
		
	}
	// 회원 등록 시 필요한 정보 입력하는 화면
	public Member insertMember() {
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		Member member = new Member(id, name, age);
		
		return member;
	}
	
	// 전체 회원 조회
	public void printAll(ArrayList<Member> members) {
		System.out.println("====전체 회원 목록====");
		
		// 회원이 없는 경우
		if(members.size() == 0) {
			System.out.println("등록된 회원이 없습니다");
		}else {
			// ArrayList에 저장된 Member 객체를 하나씩 출력
			for(Member m : members) {
				System.out.println(m.getId() + "/" + m.getName() + "/" + m.getAge());
			}
		}
		
		
	}
	
	// 조회할 회원 아이디 입력 화면
	public String inputId() {
		
		System.out.print("검색할 아이디 입력 : ");
		String id = sc.next();
		return id;
		
	}
	
	// 조회한 한명의 회원 정보 출력 화면
	 public void printMember(Member member) {
		
		System.out.println("====회원 검색 결과===="); 
		System.out.println("아이디 : " + member.getId());
		System.out.println("이름 : " + member.getName());
		System.out.println("나이 : " + member.getAge());
		
		
	 }
	
	
	
	// 메세지 출력 화면
	public void printMessage(String message) {
		
		System.out.println(message);
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
