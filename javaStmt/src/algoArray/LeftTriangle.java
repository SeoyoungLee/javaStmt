package algoArray;

/**
 * @file:LeftTriangle.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열2. 왼쪽 직각 삼각형 만들기 p.174
 */
public class LeftTriangle {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int k = 0;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				k = k + 1;
				A[i - 1][j - 1] = k;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
