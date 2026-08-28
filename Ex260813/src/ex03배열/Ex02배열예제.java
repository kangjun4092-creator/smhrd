package ex03배열;

import java.util.Random;

public class Ex02배열예제 {

	public static void main(String[] args) {

		
		Random rd = new Random();
		
		// 1. 정수형 데이터 5개 저장할 수 있는 배열 생성
		int[] array = new int[5];
		
		
		// 2. 배열의 각 방마다 랜덤수 저장!
		// 	랜덤의 범위 : 1~100
		// 예)array[0] = rd.nextInt(100)+1;
		
		array[0] = rd.nextInt(100)+1;
		array[1] = rd.nextInt(100)+1;
		array[2] = rd.nextInt(100)+1;
		array[3] = rd.nextInt(100)+1;
		array[4] = rd.nextInt(100)+1;
		
		// 3. 홀수의 갯수를 셀 수 있는 변수 생성
		
		int cnt = 0;
		
		// 4. 반복문 [i]번째 방에 있는 데이터 값이 홀수인지 판단
		
		System.out.print("array에 들어있는 홀수는");
		for (int i=0;i<array.length;i++) {
			if(array[i] % 2 ==1) {
				//홀수만 출력
				cnt++;
				System.out.print(array[i]+" ");
			}
				
			
		}
		
		// 5. 홀수만 출력 & 총 홀수 갯수 출력
		System.out.println("이며, 총"+cnt+"개 입니다.");
		
		
	
		
		
		
	}

}
