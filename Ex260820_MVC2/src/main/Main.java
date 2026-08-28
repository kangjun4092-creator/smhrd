package main;

import controller.MemberController;

public class Main {

	public static void main(String[] args) {

		
		MemberController controller = new MemberController();
		
		controller.run();
		
	
/*
 
 [ 데이터 흐름도 ]
  
1.  Main → Controller        (Main.java:10 → MemberController.java:13)   new MemberController() 생성, 필드 초기화 시작
2.  Controller → View        (MemberController.java:13 → MemberView.java 클래스)  생성자 안에서 new MemberView() 실행
3.  Main → Controller        (Main.java:12 → MemberController.java:18)   controller.run() 호출
4.  Controller → View        (MemberController.java:23 → MemberView.java:18)   view.printMenu() 호출
5.  View 내부 처리            (MemberView.java:18~26)                     화면 출력 + sc.nextInt()로 메뉴 입력받음
6.  View → Controller         (MemberView.java:28 → MemberController.java:23)   return menu (int 값 반환)

──── 여기서부터 menu 값에 따라 분기 (한 번의 루프에서 하나만 실행) ────

[menu == 1]
7.  Controller → View        (MemberController.java:27 → MemberView.java:32)   view.insertMember() 호출
8.  View 내부 처리            (MemberView.java:34~41)                     아이디/이름/나이 입력받음
9.  View → Model              (MemberView.java:43 → Member.java:12)       new Member(id, name, age) 생성
10. Model 내부 처리           (Member.java:12~17)                        생성자에서 필드 초기화
11. Model → View              (Member.java 생성자 → MemberView.java:43)   member 인스턴스 반환
12. View → Controller         (MemberView.java:45 → MemberController.java:27)   return member
13. Controller 내부 처리      (MemberController.java:30)                 members.add(member) — 리스트에 저장
14. Controller → View        (MemberController.java:33 → MemberView.java:88)   view.printMessage("회원 등록 성공")

[menu == 2]
15. Controller → View        (MemberController.java:37 → MemberView.java:49)   view.printAll(members) 호출
16. View 내부 처리            (MemberView.java:49~60)    for(m : members)로 목록 출력 (내부에서 Member.getId/getName/getAge 호출)

[menu == 3]
17. Controller → View    (MemberController.java:42 → MemberView.java:66)   view.inputId() 호출
18. View → Controller     (MemberView.java:70 → MemberController.java:42)   return id
19. Controller 내부 처리     (MemberController.java:47~59)    for(m : members)로 id 일치하는 회원 직접 탐색 (Member.getId() 호출)
20a. [못 찾은 경우] Controller → View  (MemberController.java:63 → MemberView.java:88)   view.printMessage("해당 회원이 없습니다.")
20b. [찾은 경우] Controller → View     (MemberController.java:66 → MemberView.java:75)   view.printMember(mem) 호출 (내부에서 Member.getId/getName/getAge 호출)

[menu == 4]
21. Controller → View        (MemberController.java:73 → MemberView.java:88)   view.printMessage("프로그램 종료")
22. Controller 내부 처리      (MemberController.java:74)    break → while(true) 탈출

[그 외 값]
23. Controller → View        (MemberController.java:76 → MemberView.java:88)   view.printMessage("메뉴를 다시 골라주세요.")

──── 분기 끝, break 아니면 4번으로 돌아가 반복 ────

24. Controller → Main         (MemberController.java:82 → Main.java:12)   run() 종료, 반환값 없이 리턴 → 프로그램 종료


 */
		

		
		
		
		
		
		
		
		
		
		
	}

}
