package ex02반복문;

public class Ex04별찍기 {

	public static void main(String[] args) {

		
		// 큰 반복문(라인을 의미)
		// 작은 반복문(별 갯수)
		
		// *        -->(1) 1개
		// **		-->(2) 2개
		// ***		-->(3) 3개
		// ****		-->(4) 4개
		// *****	-->(5) 5개
		
		for(int i=1;i<6;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
