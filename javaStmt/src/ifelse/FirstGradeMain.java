package ifelse;

import java.util.Scanner;

/**
 * @file:FirstGradeMain.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGradeMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FirstGrade fg = new FirstGrade();
		System.out.println("3명의 이름과 점수를 입력하세요.(이름, 점수 순)");
		fg.setInfo(s.next(), s.nextInt(), s.next(), s.nextInt(), s.next(), s.nextInt());
		fg.setBig();
		fg.setName();
		System.out.println(fg.toString());

	}

}
