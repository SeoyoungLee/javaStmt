package algoArray;

import java.util.Scanner;

/**
 * @file:MatrixChange.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열12.행렬 변환 p.206
 */
public class MatrixChange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int[][] A = new int[row][col];
		int[][] B = new int[col][row];
		int k=0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				k=k+1;
				A[i-1][j-1]=k;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*int l = 1;
		int m = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				m = m+1;
				
			}
		}*/
	}
}
