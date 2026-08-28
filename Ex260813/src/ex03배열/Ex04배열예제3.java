package ex03배열;

import java.util.Random;

public class Ex04배열예제3 {

	public static void main(String[] args) {

		
		int[] array = new int[6];
		
				
		Random rd = new Random();
		
		array[0] = rd.nextInt(45)+1;
		array[1] = rd.nextInt(45)+1;
		array[2] = rd.nextInt(45)+1;
		array[3] = rd.nextInt(45)+1;
		array[4] = rd.nextInt(45)+1;
		array[5] = rd.nextInt(45)+1;
		
		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요....!!두구두구두구!!!!");
		
		int num = 0;
		
		for(int i=0; i<array.length; i++) {
			
			num = array[i];
			System.out.print(num+" ");
			if(num == array[i]) {
				array[i] = array[5] = rd.nextInt(45)+1;
			}
		
		}
		
		
		
		
		
		
		
		
		
	}

}
