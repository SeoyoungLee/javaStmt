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
		int row = s.nextInt(), col = s.nextInt(); // row=5, col=3 입력
		int[][] A = new int[row][col];
		int[][] B = new int[col][row];
		int k = 0; // 누적 변수

		for (int i = 1; i <= row; i++) { // 1~5
			for (int j = 1; j <= col; j++) { // 1~3
				k = k + 1;
				A[i - 1][j - 1] = k;
			}
		}

		// 배열A 출력
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		int l = 1; // 배열B의 행
		int m = 0; // 배열B의 열

		for (int i = 1; i <= row; i++) { // 1~3
			for (int j = 1; j <= col; j++) { // 1~5
				m = m + 1; // B의 시작 열
				B[l - 1][m - 1] = A[i - 1][j - 1];

				if (m >= row) {
					l = l + 1;
					m = 0; // 배열B의 열을 다시 1부터 시작시키기 위해
				}
			}
		}

		// 배열B 출력
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(B[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
