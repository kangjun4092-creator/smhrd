package ex03배열;

import java.util.Random;

public class Ex03배열예제2 {

	public static void main(String[] args) {

		
		Random rd = new Random();
		
		
		int[] array = new int[5];
		array[0] = rd.nextInt(10)+1;
		array[1] = rd.nextInt(10)+1;
		array[2] = rd.nextInt(10)+1;
		array[3] = rd.nextInt(10)+1;
		array[4] = rd.nextInt(10)+1;
		
		int max = array[0];
		
		System.out.print("배열 안에 들어있는 값 :[");
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+(i < 4 ? ",":""));
			
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("]");
		System.out.println("가장 큰 값은 "+max+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
