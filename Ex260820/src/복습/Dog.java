package 복습;

//자식, 서브, 하위클래스
public class Dog extends Animal{

	// 상위클래스의 메소드 오버라이딩
	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
	
	// Dog 만의 기능
	public void ball() {
		System.out.println("공을 가져옵니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
}
