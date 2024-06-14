package twoDArray.study;

import java.util.Arrays;

public class TwoDArray {
	
	public static void print2DArray(int matrix[][]) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}

			System.out.println();
		}
		System.out.println();
		System.out.print(Arrays.deepToString(matrix));

	}

}
