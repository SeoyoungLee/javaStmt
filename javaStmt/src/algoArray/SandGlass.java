package algoArray;

import java.util.Scanner;

/**
 * @file:SandGlass.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열5. 모래시계 만들기 p.186
 */
public class SandGlass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); // 배열의 크기 입력 5
		int[][] A = new int[x][x];
		int k=0;  //배열에 저장될 변수
		int l=x+1; //행(i)의 시작위치
		int m=(x/2)+1; // 행의 중간 번호(중간 번호를 중심으로 행의 시작위치 증가)
		
		for (int i = 1; i <=m; i++) {
			l=l-1; //중간 행까지 i가 증가될 때마다 행의 시작위치 -1씩 감소
			for (int j = i; j <=l; j++) {
				k=k+1;
				A[i-1][j-1] = k;
				System.out.println("["+ (i-1) + "," + (j-1) + "] = " + k);
			}
		}
		for (int i = m+1; i <=5; i++) {
			l=l-1;
			for (int j = l; j <=i; j++) {
				k=k+1;
				A[i-1][j-1] = k;
				System.out.println("["+ (i-1) + "," + (j-1) + "] = " + k);
			}
		}
		
		//출력
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
