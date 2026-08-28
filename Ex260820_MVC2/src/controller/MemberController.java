package controller;

import java.util.ArrayList;

import model.Member;
import view.MemberView;

// Controller
// view 의 메소드를 호출
public class MemberController {
	
	
	MemberView view = new MemberView();
	
	ArrayList<Member> members = new ArrayList<Member>();
	
	
	public void run() {
		
		while(true) {
			
			// View 에게 메뉴 출력 화면 요청
			int menu = view.printMenu();
			
			if(menu == 1) {
				// 회원 등록
				Member member = view.insertMember();
				
				// member(id, name, age)
				members.add(member);
				
				// 사용자에게 등록 성공 여부 알려주기
				view.printMessage("회원 등록 성공");
				
			}else if(menu == 2) {
				// 전체 회원 조회
				view.printAll(members);
				
				
			}else if(menu == 3) {
				// 회원 검색 기능
				String id = view.inputId();
				
				// 리턴할 Member 객체 선언
				Member mem = null;
				
				for(Member m : members) {
					
					if(m.getId().equals(id)) {
						
						// 해당 회원 객체를 저장
						mem = m;
						
						// 원하는 회원을 찾으면 반복문 탈출
						break;
						
					}
					
				}
				
				// 회원을 찾지 못하는 경우
				if(mem == null) {
					view.printMessage("> 해당 회원이 없습니다.");
				}else {
					// 찾은 Member 객체를 View에 전달
					view.printMember(mem);
					
				}
				
				
			}else if(menu == 4) {
				// 종료
				view.printMessage("> 프로그램 종료");
				break;
			}else {
				view.printMessage("> 메뉴를 다시 골라주세요.");
			}
			
		}
		
		
	}
	
	
	
	
	
	
}
