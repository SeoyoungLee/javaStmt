package algoArray;

/**
 * @file:Zigzag.java
 * @author lsy
 * @date 2016. 3. 19.
 * @story 배열3. ㄹ 자로 채우기 p.180
 */
public class Zigzag {
	public static void main(String[] args) {
		int[][] A = new int[5][5];
		int k=0; //배열에 저장될 변수
		int l=1; //시작위치
		int m=5; //끝위치
		int n=1; //증가 값
		int p=0; //시작과 끝 바꿀 임시 변수
		
		for (int i = 1; i <=5; i++) {
			for (n = l; n <=m; n++) {
				System.out.println("i = "+ i + " n = "+ n);
				k=k+1;
				A[i-1][n-1]=k;
				
			}
			
			p=l;
			l=m;
			m=p;
			n=n*(-1);
			
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
