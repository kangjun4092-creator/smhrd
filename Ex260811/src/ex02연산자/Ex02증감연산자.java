package ex02연산자;

public class Ex02증감연산자 {

	public static void main(String[] args) {

		// 증감 연산자 : 변수에 저장된 값을 1증가 혹은 1감소
		// ++(증가 연산자), --(감소 연산자)
		
		// ★연산자 위치 중요★
		// ++변수 : 먼저 +1 증가
		// 변수++ : 나중에 +1 증가
		
		int num = 3;
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
	}

}
