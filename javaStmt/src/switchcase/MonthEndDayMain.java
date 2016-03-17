package switchcase;

import java.util.Scanner;

/**
 * @file:MonthEndDay.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 해당 월의 말일을 출력함 
 * 예를 들면 1월이면 31일 출력
 */
public class MonthEndDayMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MonthEndDay med = new MonthEndDay();
		System.out.println("월을 입력하세요.");
		System.out.println(med.findEndDay(scanner.nextInt()));
		
		
	}
}
