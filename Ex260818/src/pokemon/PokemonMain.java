package pokemon;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {
		
		
		
		
		// 파이리 객체
		Pokemon p1 = new Pokemon("파이리","불",39,52,"불");
		
	
		// 꼬부기 객체
		Pokemon p2 = new Pokemon("꼬부기","물",44,48,"물대포");
		
		
		
		// 2. 파이리 혹은 꼬부기 포켓몬 선택하기(입력받기)
		// -> 1번 입력 했을때 파이리
		// -> 2번 입력 했을때 꼬부기
		// -> 입력받은 값은 input이라는 변수에 저장
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
		System.out.print("[1]파이리  [2]꼬부기>>>");
		int input = sc.nextInt();
		
		
		
		// 3. 만약에 파이리(1번)을 입력했을때 공격패턴 선택하기(입력받기)
		if(input == 1) {
			// -> 1번 입력 했을때 일반공격
			// -> 2번 입력 했을때 스킬공격(일반공격*1.5)
			System.out.print("[1]일반공격  [2]스킬공격>>>");
			// -> 입력받을 값은 input2라는 변수에 저장
			int input2 = sc.nextInt();
			// 4. 만약에 일반공격(1번) 입력했을때 꼬부기 생명력 = 꼬부기생명력 - 파이리 공격력
			//   --> 꼬부기 생명력 출력하기
			if(input2 == 1) {
				p2.hp = p2.hp - p1.atk;
				System.out.println(p2.hp);
			}else {
				//    스킬공격(2번) 입력했을때 꼬부기 생명력 = 꼬부기 생명력 - 파이리공격력 *1.5
				//   --> 꼬부기 생명력 출력하기
				p2.hp = (int) (p2.hp - (p1.atk*1.5)); 
				System.out.println(p2.hp);
			}
		}
			//자동 정렬 : ctrl + shift + f
		else if(input == 2) {
			System.out.print("[1]일반공격  [2]스킬공격>>>");
			int input2 = sc.nextInt();
		
			if(input2 == 1) {
				p1.hp = p1.hp - p2.atk;
				System.out.println(p1.hp);
			}else {
				p1.hp = (int) (p1.hp - (p2.atk*1.5)); 
				System.out.println(p1.hp);
			}
			
			
				
		}//게임 종료 조건
		// 포켓몬 두 마리 중 한마리라도 생명력이 0보다 작거나 같을때 종료
		if(p1.hp <= 0 || p2.hp <= 0) {
			System.out.println("사망");
			break;
		}
		
	}//while 끝
	}

}
