package 인터페이스;

// 인터페이스
// 하위클래스가 반드시(강제성) 구현해야 할 기능의 규칙을 정의
public interface RemoteControl {

	// 인터페이스에서의 변수 -> 무조건 상수
	// public static final 생략가능
	// final : 상수 라서 변수명을 대문자로
	public static final int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	
	// 바디가 없는 추상메소드 로만 구성
	public abstract void turnOn();
	
	// interface 에서는 어차피 추상메소드만 정의가 가능하기에
	// public abstract 생략 가능
	void turnOff();
	
	
	
	
}
