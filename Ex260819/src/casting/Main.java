package casting;

public class Main {

	public static void main(String[] args) {

		
		// Dog 객체와 Cat객체 만들기
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		// 업캐스팅 : 하위클래스를 상위클래스로 형변환(자동 형변환)
		// a는 Animal 객체지만 실제로는 Cat객체의 주소값이 들어있다.
		Animal a = c;
		
		// 다운캐스팅 : 상위클래스를 하위클래스로 형변환(강제 형변환)
		// Cat c2 = (Cat)new Animal();
		// System.out.println(c2);
		// 메모리적으로는 불가능! -> 고양이는 동물이다 OK  ,  동물은 고양이다 XX
		
		// 본래 객체로 변환시켜주는 것!
		Cat c2 = (Cat)a;
		System.out.println(c2);
		
		a.eat();
		
		
		
		
		
		
		
		
	}

}
