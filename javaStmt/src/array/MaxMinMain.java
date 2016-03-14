package array;

/**
 * @file:MaxMinMain.java
 * @author lsy
 * @date 2016. 3. 14.
 * @story 배열의 최대값, 최소값 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
		int[] arr = {100,80,94,46,33,76,19,84,66};

		MaxMin mm = new MaxMin();
		mm.setMaxMin(arr);
		
		System.out.println(mm.toString());
	}
}

