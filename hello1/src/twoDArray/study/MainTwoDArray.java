package twoDArray.study;

import java.util.Arrays;
import java.util.Scanner;

public class MainTwoDArray {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		TwoDArray.print2DArray(matrix);
		
		int[][] matrix2=new int[3][3];
		matrix2[0]=new int[] {11,12,13};
		matrix2[1]=new int[] {14,15,16};
		matrix2[2]=new int[] {17,18,19};
		System.out.println();
		TwoDArray.print2DArray(matrix2);

		// ADDITION OF TWO MATRIX
		Scanner scanner=new Scanner(System.in);
		int[][] matrix3=new int[3][3];
		int[][] matrix4=new int[3][3];
		int[][] result=new int[3][3];
		
		System.out.println("Get Values For Matrix1:");
		MatrixAddition.matrixAdd(matrix3, scanner);
		System.out.println("Get Values For Matrix2:");
		MatrixAddition.matrixAdd(matrix4, scanner);
		
		//Addition of Matrix
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				result[i][j]=matrix3[i][j]+matrix4[i][j];
			}
		}
		System.out.println(Arrays.deepToString(matrix3));
		System.out.println(Arrays.deepToString(matrix4));
		System.out.println(Arrays.deepToString(result));



		

		
	}
}
