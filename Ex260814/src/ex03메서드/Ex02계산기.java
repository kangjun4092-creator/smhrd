package ex03메서드;

public class Ex02계산기 {

	public static void main(String[] args) {

		
		// 1. 메서드 호출
		
		System.out.println(add(1,1));
		System.out.println(aa(1,1));
		System.out.println(bb(2,2));
		System.out.println(cc(4,2));
		
		
	}
	
	// 1. 덧셈 메서드
	public static int add(int a, int b) {
		return a + b ; 
	}
	
	// 2. 뺄셈 메서드
	public static int aa(int a, int b) {
		return a - b ;
	}
	
	// 3. 곱셉 메서드
	public static int bb(int a, int b) {
		return a * b ;
	}
	
	// 4. 나눗셈(몫) 메서드
	public static int cc(int a, int b) {
		return a / b ;
	}
	
	
	
	
	
}
