package 추상클래스;

public class Main {

	public static void main(String[] args) {

		
		// 추상클래스 객체 생성 불가능
		// WildAnimal animal = new WildAnimal() ;
		// 객체생성이 불가능한 이유
		// -> WildAnimal 안에 아직 구현되지 않은 추상메소드가 있기 때문
		// -> 실제 WildAnimal 객체를 직접만든게 아닌
		// -> 익명으로 자식클래스를 즉석에서 만든 것

		// 하지만 자료형으로는 사용 가능
		// 즉, 추상클래스라고해서 부모타입 못 쓰는게 아님
		WildAnimal a1 = new Eagle();
		WildAnimal a2 = new Lion();
		WildAnimal a3 = new Wolf();

		// 부모에게 물려받은 일반메소드
		a1.sleep();
		
		// 실제 자식 객체가 구현한 메소드
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// 정리
		// 추상메소드 : 구현부 {} 없이 선언만 한 메소드
		// 추상클래스 : abstract로 선언된 클래스이며 객체 생성이 불가한 클래스
		// 목적 : 자식 클래스들이 공통적으로 가져야 할 기능을 정하고, 구체적인 구현은 자식에게 맡긴다.
		// -> "추상 = 대충만든 클래스"가 아닌 자식들이 따라야 할 규칙을 정하는 부모다!
		
		
		
		
		
		
		
		
	}

}
