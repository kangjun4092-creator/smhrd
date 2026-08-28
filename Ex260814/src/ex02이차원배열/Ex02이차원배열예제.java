package ex02이차원배열;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		
		int num = 1;
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				array[i][j] = num;
				num++;
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
