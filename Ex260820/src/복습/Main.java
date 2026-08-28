package 복습;

public class Main {

	public static void main(String[] args) {

		
		// 객체 생성
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.climb();
		cat.sound();
		
		dog.ball();
		dog.sound();
		
		// 업캐스팅
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		
		// 업캐스팅을 하면 같은 배열에 타입이 달라도 가능함
		Animal[] animals = {a1, a2};
		
		// 반복문으로 모든 동물을 관리
		for(Animal a : animals) {
			// 실제 객체에 따라
			// Dog면 멍멍!
			// Cat이면 야옹~
			
			a.sound();
		}
		
		
		
		
		
		
		
		
		
	}

}
