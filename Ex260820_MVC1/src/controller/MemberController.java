package controller;

import model.Member;
import view.MemberView;

// Controller
// Model 과 View 사이를 연결하고
// 전체적인 데이터의 흐름을 제어
public class MemberController {

	MemberView view = new MemberView(); // view [패키지]의 Memberview 클래스 참조 (객체생성)
	
	public void run() {
		
		// View 에게 회원 정보 입력 요청
		Member member = view.inputMember(); // view 필드 (MemberView)의 inpuMember() 메서드 호출
											// 반환 받은 Member 객체를 저장
		// View 에게 회원정보 출력 요청
		view.printMember(member);  // view 필드(MemberView)의 printMember() 메서드 호출
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
