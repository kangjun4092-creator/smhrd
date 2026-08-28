package 복습;

// 자식, 서브, 하위클래스
public class Cat extends Animal{

	// 상위클래스를 상속받고 싶을 때 쓰는 키워드 -> extends (확장하다)
	
	// 오버라이딩 조건
	// 메소드 이름, 매개변수의 개수와 타입, 리턴타입 동일
	
	// 상위클래스의 메소드 재정의
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
	
	// Cat 만의 기능
	public void climb() {
		System.out.println("나무를 올라탑니다.");
	}
	
	
	
	
	
	
	
	
}
