package ifelse;

import java.util.Scanner;

/**
 * @file:FirstGrade.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 이름과 점수를 입력하세요.");
		String aName = scanner.next();
		int aScore = scanner.nextInt();

		String bName = scanner.next();
		int bScore = scanner.nextInt();

		String cName = scanner.next();
		int cScore = scanner.nextInt();
		
		String name="";
		int big = 0;
		
		if (aScore > big) {
			big = aScore;
		}
		if(bScore > big){
			big=bScore;
		}
		if(cScore > big){
			big=cScore;
		}
		
		
		if (big==aScore) {
			name = aName;
		} else if(big==bScore){
			name = bName;
		}else if(big == cScore){
			name = cName;
		}
		

		System.out.println("1등은 "+name+", "+big+"점 입니다.");

	}

}
