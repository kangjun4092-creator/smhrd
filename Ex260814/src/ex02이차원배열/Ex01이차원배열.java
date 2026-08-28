package ex02이차원배열;

public class Ex01이차원배열 {

	public static void main(String[] args) {

		
		// 이차원 배열 : 1차원 배열[] 안에 또 다른 배열이 들어가 있는 구조
		
		int[][] array = new int[3][2];
		
		// 이차원 배열 데이터 저장
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[1][0] = 3;
//		array[1][1] = 4;
//		array[2][0] = 5;
//		array[2][1] = 6;
		
		
		// 이중 for문 사용해서 데이터 출력하기
		// 배열의 크기 : array.length
		// 한 행의 열 : array[].length
		
		
		int num = 1;
		for (int i=0;i<array.length;i++) {
			
			for (int j=0;j<array[i].length;j++ ) {
				array[i][j] = num;
				num++;
				System.out.print(array[i][j]+" ");
				
			}System.out.println();
		}
		
		
		
		
		int[][] array2 = {{1,2},{1,2}};
		
		
		
		
	}

}
