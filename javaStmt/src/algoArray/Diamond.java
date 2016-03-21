package algoArray;

/**
 * @file:Diamond.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열4. 다이아몬드 만들기 p.183
 */
public class Diamond {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int k=0,s=3,e=3;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = s-1; j <= e-1; j++) {
				k+=1;
				A[i-1][j]=k;
			}
			
			if(i>=3){
				s=s+1;
				e=e-1;
			}else{
				s=s-1;
				e=e+1;
			}
			
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
