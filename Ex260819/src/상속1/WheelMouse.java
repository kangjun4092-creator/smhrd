package 상속1;

// extends
public class WheelMouse extends Mouse{

	
	public void scroll() {
		System.out.println("스크롤하기~!");
	}
	
	// @Override(주석) : 상위클래스의 메소드를 올바르게 오버라이딩 하고 있는지 체크할 때 사용
	public void leftClick(int cnt) {
		System.out.println("신나게 좌클릭하기!!");
	}
	
	
	
	
}
