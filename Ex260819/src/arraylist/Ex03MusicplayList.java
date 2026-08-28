package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicplayList {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> mList = new ArrayList<String>(); 
		
		
		System.out.println("======Music Play List=====");
		
		while(true) {
			
			System.out.print("[1]노래추가 [2]노래조회 [3]노래삭제 [4]종료 >>");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				// 노래 추가
				System.out.print("[1]원하는 위치에 추가  [2]마지막 위치에 추가 >> ");
				int num = sc.nextInt();
				if(num == 1) {
					System.out.print("추가할 번호 입력 : ");
					int index = sc.nextInt();
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					mList.add(index-1, title); // 실제로 입력값은 1인데 0번인덱스가 ArrayList의 첫번째이기 때문에
					System.out.println("추가가 완료 되었습니다.");
					
				}else if(num == 2){    // [2]마지막 위치에 추가  : 2번 선택
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					mList.add(title);
					System.out.println("추가가 완료 되었습니다.");	
					
				}else {
					System.out.print("다시 선택해주세요");
					
				}
				
				
			}else if(menu == 2) {
				// 노래 조회
				if(mList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				}else {
					// 노래 전체 조회
					System.out.println("===== 현재 재생 목록 =====");
					for(int i= 0;i< mList.size();i++){
						System.out.println(i+1+". "+mList.get(i));
					}
					
				}
				
				
			}else if(menu == 3) {
				// 노래 삭제
				System.out.println("=============");
				System.out.print("[1] 선택삭제 [2] 전체삭제 >> ");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					System.out.print("삭제 할 노래 번호 선택 >> ");
					int index = sc.nextInt();
					mList.remove(index-1);
					System.out.println("노래가 삭제 되었습니다.");
				}else if(num2 == 2) {
					mList.clear();
					System.out.println("전체 삭제되었습니다.");
				}else {
					System.out.println("다시 번호를 입력해주세요.");
				}
				
				
				
			
				
				
			}else if(menu == 4) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("menu를 다시 선택해주세요!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
	}//

}
