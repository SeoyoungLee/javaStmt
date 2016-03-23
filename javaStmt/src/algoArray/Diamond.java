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
		int k=0; //배열에 저장할 변수
		int s=3; //열의 시작 위치
		int e=3; //열의 끝 위치
		
		for (int i = 1; i <= 5; i++) {
			for (int j = s; j <= e; j++) {
				k+=1;
				A[i-1][j-1]=k;
				System.out.println("["+ (i-1) + "," + (j-1) + "] = " + k);
			}
			if(i>=3){ //i가 3~5인 행은 시작위치++ 끝위치--
				s++;
				e--;
			}else{ //i가 1~3인 행은 시작위치-- 끝위치++
				s--;
				e++;
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
