package algoArray;

/**
 * @file:MagicSquare.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열11.마방진 p.203 마방진 : 가로의 합 = 세로의 합 = 대각선의 합
 */
public class MagicSquare {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int i = 1; // 행의 위치
		int j = (5 / 2) + 1; // 가운데 열 번호

		for (int k = 1; k <= 25; k++) { // 배열에 저장되는 값
			A[i - 1][j - 1] = k;
			int nmg = k - (k / 5) * 5; // 5의 배수인지 확인

			System.out.println("[" + (i - 1) + "," + (j - 1) + "] = " + k);

			if (nmg == 0) {
				i = i + 1; // 나머지가 0이면 5의 배수 -> 행++
			} else {
				i = i - 1; // 행--
				j = j + 1; // 열++

				if (i < 1) {
					i = 5; // 행이 1보다 작으면 행=5
				}

				if (j > 5) {
					j = 1; // 열이 5보다 크면 열=1
				}
			}
		}

		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
