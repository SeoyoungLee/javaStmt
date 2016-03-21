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
		int col = s.nextInt();
		int row = (col*2)-1;
		int[][] a = new int[row][col];
		int k=0;
		
		for (int j = 1; j <= col; j++) {
			int l = col;
			int e =0;
			
			for (int i = l; i <= e; i++) {
				k = k+1;
				a[i-1][j-1] = k;
			}
		}
		
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=7; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
