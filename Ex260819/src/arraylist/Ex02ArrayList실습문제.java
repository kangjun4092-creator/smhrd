package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02ArrayList실습문제 {

	public static void main(String[] args) {

		// 각 팀원의 이름을 입력 받아서 ArrayList에 저장하여 출력하기
		
		// 1.Scanner 클래스 생성
		
				
		Scanner sc = new Scanner(System.in);
		
		
		
		// 2. ArrayList 생성 -> 변수명 : team
		ArrayList<String> team = new ArrayList<>();
		
	
		
		// 3. for문 활용해서 팀원 수만큼 문자열(String) 입력받아서 ArrayList에 저장
		
		for (int i = 0;i<5;i++) {
			
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
			team.add(i,name);
		}System.out.print("내손을JAVA의 팀원은"+" ");
		
		// 4. 마지막 팀원을 입력받고 엔터를 치는 순간 for문 활용해서 전체 팀원 출력하기
		for (int i = 0;i<team.size();i++) {
			System.out.print(team.get(i)+" ");
		}System.out.print(" "+"입니다");
		
		System.out.println();
		
		// 삭제 기능 추가
		
		System.out.print("삭제할 팀원 이름 입력 : ");
		String delete = sc.next();
		
		for (int i=0;i<team.size();i++) {
			
			if (delete.equals(team.get(i))) {
				team.remove(i);
			}
		}System.out.print("내손을JAVA의 팀원은"+" ");
		
		for (int i = 0;i<team.size();i++) {
			System.out.print(team.get(i)+" ");
		}System.out.print(" "+"입니다");
		
		
		
		
		
		
		
	sc.close();	
	}

}
