package whileloop;

import java.util.Scanner;

/**
 * @file:InfiniteLoop.java
 * @author lsy
 * @date 2016. 3. 14.
 * @story 
 */
public class InfiniteLoopMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result=0;
		while (true) {
			System.out.println("1. 정수 입력  2. 종료"); //메뉴
			int key=scanner.nextInt();
			switch (key) {
			case 1:	
				System.out.println("출력할 정수값 입력");
				result = scanner.nextInt();
				break;
			case 2:	
				System.out.println("종료합니다."); return;
			

			default: System.out.println("잘못된값");
				return;
			}
			System.out.println(result);
		}
		
	}

}
