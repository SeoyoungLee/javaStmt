package algoArray;

/**
 * @file:Rotation90.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열8. 90도 회전하기 p.193
 */
public class Rotation90 {
	public static void main(String[] args) {
		int[][] A = new int[5][5]; 
		int[][] B = new int[5][5]; //배열 A를 90도 회전해서 저장할 배열
		int k=0;
		
		for (int i = 5; i >= 1; i--) {
			for (int j =i; j <= 5; j++) {
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
		
		System.out.println();
		System.out.println();
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				B[j-1][5-i] = A[i-1][j-1]; //B[0][4] = A[0][0]
			}
		}
		
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
