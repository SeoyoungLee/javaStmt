package array;

import java.util.Scanner;

/**
 * @file:MaxValue.java
 * @author lsy
 * @date 2016. 3. 14.
 * @story 배열(버스)의 요소(승객) 중 가장 큰 값 출력
 */
public class MaxValueMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		/*int[] arr1 = new int[3];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;*/
		
		int[] arr = {32,25,56,48,29,18};
		MaxValue mv = new MaxValue();
		//mv.getMax(arr);
		System.out.println("배열중에서 가장 큰 값은"+mv.getMax(arr)+"입니다.");
	}
	

}

