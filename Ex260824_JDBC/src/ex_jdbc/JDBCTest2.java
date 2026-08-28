package ex_jdbc;

import java.util.ArrayList;
import java.util.Scanner;

import ex_jdbc.model.T_Member;
import ex_jdbc.model.T_MemberDAO;

public class JDBCTest2 {

	public static void main(String[] args) {

	
		
		T_MemberDAO dao = new T_MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		
		// 회원관리 프로그램 choice
		System.out.println("[회원관리 프로그램]");
		System.out.println("1)회원등록 2)전체조회 3)정보수정 4)회원삭제 >>");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {  // 회원 등록
			System.out.println("아이디입력: ");
			String m_id = sc.next();
			
			System.out.println("이름입력: ");
			String m_name = sc.next();
			
			System.out.println("나이입력: ");
			int m_age = sc.nextInt();
			
			// 데이터 저장 기능 호출
			int cnt = dao.insert(m_id, m_name, m_age);
		
			if(cnt > 0) {
				System.out.println("회원정보 저장 성공!");
			}else {
				System.out.println("회원정보 저장 실패..");
			}
		}else if(choice == 2) { // 회원 조회
			System.out.println("================");
			System.out.println("회원 목록 조회");
		
			ArrayList<T_Member> mlist = dao.selectAll();
			
			
			for(T_Member m : mlist) {
				System.out.println(m);
			}
		}else if(choice == 3) {
			
			System.out.println("================");
			
			System.out.println("수정할 아이디: ");
			String id = sc.next();
			
			System.out.println("수정할 이름: ");
			String updateNm = sc.next();
			
			System.out.println("수정할 나이:");
			int updateAge = sc.nextInt();
			
			T_Member updateMember = new T_Member(id, updateNm, updateAge);
			
			int cnt = dao.update(updateMember); 
			
			if (cnt > 0) {
				System.out.println("정보수정 성공!");
			}else {
				System.out.println("정보수정 실패..");
			}
			
			
			
		}else if(choice == 4) {
			
			System.out.println("================");
			System.out.println("삭제할 아이디: ");
			String id = sc.next();
			
			int cnt = dao.delete(id);
			
			if ( cnt > 0 ) {
				System.out.println("정보삭제 완료!");
			}else {
				System.out.println("정보삭제 실패..");
			}
			
		}
		
		
		
	
		
		
	
	}
	
	
	
}
