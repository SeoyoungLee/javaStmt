package algoArray;

/**
 * @file:Diagonal.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열10.대각선으로 채우기 p.200
 */
public class Diagonal {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int l = 0; // 배열에 저장될 변수

		for (int i = 2; i <= 10; i++) { // 회전수
			for (int j = 1; j <= 5; j++) { // 행
				System.out.println("\t"+(i-1)+","+(j-1));
				int k = i - j; // 열
				if (k < 1) {
					break;
				} else {
					if (k > 5) {
						break;
					} else {
						l = l + 1;
						A[j - 1][k - 1] = l;
					}
				}
				System.out.println((i-1)+"회전"+" [" + (j - 1) + "," + (k - 1) + "] = " + l);
			}
		}

		//출력
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
