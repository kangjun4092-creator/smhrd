package 인터페이스;

public class SmartTV implements RemoteControl, InternetConnect{

	// 인터페이스는 다중상속(다중구현)이 가능하다
	// -> 어차피 바디가 없는 추상메소드만 정의되기 때문
	
	@Override
	public void connectInternet() {
		System.out.println("인터넷에 연결");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV를 끈다.");
	}

	
	
	
	
}
