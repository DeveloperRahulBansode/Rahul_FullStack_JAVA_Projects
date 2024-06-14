package twoDArray.study;

import java.util.Scanner;

public class MatrixAddition {
	public static void matrixAdd(int[][] matrix, Scanner scanner) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Enter Values For Row:" + (i + 1));
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter Values For column:" + (j + 1));
				matrix[i][j]=scanner.nextInt();
			}
		}

	}

}
