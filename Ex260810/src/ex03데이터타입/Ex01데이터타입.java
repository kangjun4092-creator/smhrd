package ex03데이터타입;

public class Ex01데이터타입 {

	public static void main(String[] args) {

		//데이터 타입
		
		//1. 정수형
		
		//2. 문자형(' ' => 작은 따옴포)
		char grade = 'A';
		
		//2-1. 문자열(" " => 큰 따옴표)
		String smart = "스마트";
		
		//3. 실수형
		double height = 164.4;
		float n = 164.4f;
		
		//4. 논리형(true or false)
		boolean isCold = false;
		
		
		//자동 형 변환 : 작은 데이터 -> 큰 데이터 이사
		int a = 3;
		double b = a;
		System.out.println(b);
		
		
		//강제 형 변환 : 큰 데이터 -> 작은 데이터 이사
		double c = 72.6;  
		int d = (int) c;    //정수형으로 강제 형변환시 소숫점 소멸 ( 반올림, 내림 없음 )
		System.out.println(d);
		
		
		
		
		
		
		
		
		
	}

}
