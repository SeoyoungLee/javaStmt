package algoArray;

/**
 * @file:Snail.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열9.달팽이 p.197
 */
public class Snail {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int k = 0; // 배열에 저장될 변수
		int c = 1; // 증감 여부
		int i = 1; // 행
		int j = 0; // 열
		int f = 5; // 수행횟수
		while (true) {

			for (int n = 1; n <= f; n++) { //행고정 열증감
				k = k + 1;
				j = j + c;
				A[i - 1][j - 1] = k;
				System.out.println(f+"번 회전"+"["+ (i-1) + "," + (j-1) + "] = " + k);
			}

			f--; //수행횟수--

			if (f > 0) {
				for (int n = 1; n <= f; n++) { //열고정 행증감
					k = k + 1;
					i = i + c;
					A[i - 1][j - 1] = k;
				}

			} else {
				break;
			}
			c = c * (-1); //행과 열의 증감 결정
		}

		//출력
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
