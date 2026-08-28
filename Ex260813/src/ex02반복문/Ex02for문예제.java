package ex02반복문;

public class Ex02for문예제 {

	public static void main(String[] args) {

		
		
		// (77*1) + (77*2) + ...... (1*77)
		int a = 77;
		int sum = 0;
		
		for (int i=1;i<78;i++) {
			sum += a*i;
			a--;
			 
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
