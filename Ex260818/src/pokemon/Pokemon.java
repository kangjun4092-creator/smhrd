package pokemon;

public class Pokemon {

	// 캐릭터 2종류 선택해서 필드 작성
	// 파이리, 불, 39, 52, 불
	// 꼬부기, 물, 44, 48, 물대포
	
	// 이름 name
	// 타입 type
	// 생명력 hp
	// 공격력 atk
	// 스킬 skill
	
	//클래스에는 필드와 메서드가 꼭 한개씩은 들어가야함
	
	// 1. 필드(데이터 값)
	 String name;
	 String type;
	 int hp;
	 int atk;
	 String skill;
	
	// 2. 메서드(객체의 행위,기능)
	public Pokemon(String name, String type, int hp, int atk, String skill) {
//		super();
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
	}
	
	
	
	
	
	
	
	
	
	
	
}
