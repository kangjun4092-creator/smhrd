package 업캐스팅실습;

public class Main {

	public static void main(String[] args) {

		
		//WildAnimal 배열을 만들어서 각 하위클래스 객체를 담은 후
		
		
//		Lion lion = new Lion();
//		Eagle eagle =new Eagle();
//		Wolf wolf = new Wolf();
		
		
		// WildAnimal 배열을 만들어서 각 하위클래스 객체를 담은 후
		WildAnimal l = new Lion();
		WildAnimal e = new Eagle();
		WildAnimal w = new Wolf();
		
		
		// 반복문을 통해 각 객체의 hunt() 호출해보기
		// 변수의 타입은 WildAnimal로 동일하지만
		// 실제 생성된 객체에 따라 오버라이딩 된 메소드가 호출됨-> 다형성
		WildAnimal[] wa = {l,e,w};
		
		for (WildAnimal a : wa) {
			a.hunt();
		}
		
		
		
		
		
	}

}
