package 상속1;

public class Main {

	public static void main(String[] args) {

		
		// Mouse -> rightClick(), leftClick(), drag()
		// WheelMouse -> scroll()
		// ErgonomicMouse -> fatigue()
		
		
		WheelMouse wheel= new WheelMouse();
		ErgonomicMouse Er = new ErgonomicMouse();

		wheel.leftClick();
		wheel.leftClick(5);
		
		wheel.rightClick();
		wheel.drag();
		wheel.scroll();
		
		Er.leftClick();
		Er.rightClick();
		Er.drag();
		Er.fatigue();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
