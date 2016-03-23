package algoArray;

import java.util.Scanner;

/**
 * @file:IsoscelesTriangle.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열7. 이등변 삼각형 만들기 p.191
 */
public class IsoscelesTriangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int col = s.nextInt(); // 열 입력(4)
		int row = (col * 2) - 1; // 행
		int[][] a = new int[row][col];
		int k = 0; // 배열에 저장할 변수

		for (int j = 1; j <= col; j++) {// 열
			int l = (col + 1) - j; // 열이 증가할 때마다 시작행 -1
			int e = j + (col - 1); // 열이 증가할 때마다 끝행 +1

			for (int i = l; i <= e; i++) {
				k = k + 1;
				a[i - 1][j - 1] = k;
				System.out.println("["+ (i-1) + "," + (j-1) + "] = " + k);
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
