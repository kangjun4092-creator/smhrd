package 추상클래스;

public abstract class WildAnimal {
	
	
	// 상위클래스에 정의된 hunt()를 만들었지만
	// Lion, Eagle, Wolf 마다 사냥방법이 다름
	// 결국 부모의 hunt()는 자식들이 반드시 가져야하는 기능임을
	// 알려만 주고 구체적인 내용은 자식들이 작성하게 만들고 싶음
	
	/* 추상메소드
	 실제 { 바디 } 부분은 가지지 않고 선언만 함
	 -> "이런 메소드는 무조건 구현해야해!" 라고만 정의
	 이 추상클래스를 상속받은 하위클래스는 무조건 이 메소드를 오버라이딩해야함
	 추상메소드임을 알려주는 키워드 -> abstract
	 추상메소드를 하나라도 포함하고 있으면 이 클래스는 무조건 추상클래스
	 -> 클래스에도 "나는 추상클래스야" 라고 알려주기 위해 abstract 추가 */
	public abstract void hunt();
	
	// 일반 메소드도 만들 수 있음
	public void sleep() {
		System.out.println("쿨쿨 잠자기");
	}
	
	
	
	
	
	
	
}
