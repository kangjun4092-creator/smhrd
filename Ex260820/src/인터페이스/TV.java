package 인터페이스;

// 인터페이스를 상속받을 때 쓰는 키워드 -> implements(구현하다)
public class TV implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

	
	
	
	
	
	
	
	
	
}
