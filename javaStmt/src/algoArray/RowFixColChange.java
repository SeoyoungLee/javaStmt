package algoArray;

/**
 * @file:RowFixColChange.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열1. 행고정 열변화 p.170
 */
public class RowFixColChange {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int k = 0;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				k=k+1;
				A[i-1][j-1]=k;
				System.out.println("["+ (i-1) + "," + (j-1) + "] = " + k);
			}
		}
		for (int  i= 0;  i< 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
