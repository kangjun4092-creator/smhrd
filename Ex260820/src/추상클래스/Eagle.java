package 추상클래스;

public class Eagle extends WildAnimal{
	
	
	// 상위클래스(추상클래스)에 있는추상 메소드는 무조건 구현(오버라이딩)해야함
	// -> 내(상위클래스) 자식(하위클래스)이라면 hunt() 반드시 구현
	@Override
	public void hunt() {
		System.out.println("날아서 사냥");
	}
	
	
	
	
	
}
