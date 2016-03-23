package algoArray;

import java.util.Scanner;

/**
 * @file:BlankTriangle.java
 * @author Administrator
 * @date 2016. 3. 19.
 * @story 배열6. 오른쪽 빈 삼각형 만들기 p.189
 */
public class BlankTriangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); //7입력
		int[][] A = new int[x][x];
		int k = 0; //배열에 저장될 변수
		int m = (x / 2) + 1; //배열의 중간 행
		int l = 0; //열의 끝 위치
		
		for (int i = 1; i <= x; i++) {
			if (i < m) { //열이 중간행(4)보다 작으면
				l = (x + 1) - i; //열 = 8-i
			} else { // 열이 4~7
				l = i;
			}
			for (int j = 1; j <= l; j++) {
				k = k + 1;
				A[i - 1][j - 1] = k;
				
				System.out.println("["+ (i-1) + "," + (j-1) + "] = " + k);
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
