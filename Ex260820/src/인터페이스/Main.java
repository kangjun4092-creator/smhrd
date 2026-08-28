package 인터페이스;

public class Main {

	public static void main(String[] args) {

		
		// 인터페이스는 객체 생성이 불가능
		// RemoteControl rc = new ReomoteControl();
		
		// 자료형으로는 사용 가능
		RemoteControl rc1 = new TV();
		RemoteControl rc2 = new AirConditioner();
		
		RemoteControl rc3 = new SmartTV();
		SmartTV rc4 = new SmartTV();
		
		rc1.turnOn();
		rc1.turnOff();

		rc2.turnOn();
		rc2.turnOff();
		
		rc3.turnOn();
		rc3.turnOff();
		
		rc4.connectInternet();
		
		// 인터페이스 정리
		// 객체생성 : 불가능
		// 메소드 : 기본적으로 추상메소드
		// 변수 : public static final 상수
		// 구현 : 자식클래스에서 implements 사용하여 직접 구현
		// 구현 의무 : 추상메소드니 반드시 오버라이딩
		// 다형성 : 인터페이스 타입으로 여러 구현 객체 관리 가능
		
		
		// 추상클래스 VS 인터페이스
		// 추상클래스 : 공통된 속성이나 기능을 물려주기 위한 클래스
		// 인터페이스 : 특정 기능을 반드시 구현하도록 규칙을 정하는 곳
		
		
		
		
		
	}

}
