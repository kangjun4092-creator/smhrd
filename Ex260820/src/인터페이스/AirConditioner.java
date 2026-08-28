package 인터페이스;

public class AirConditioner implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("에어컨을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 끈다.");
	}

	
	
}
