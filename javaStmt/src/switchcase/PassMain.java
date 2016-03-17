package switchcase;

import java.util.Scanner;

/**
 * @file:Pass.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 과목 점수를 입력하면 총점과 평균이 나오고 이를 통해 합격 여부를 통지하는 프로그램(스위치케이스 처리) 
 * [결과]
 * **************************************
 * 학생	자바	JSP	SQL	스프링		총점	평균	합격여부
 * ---------------------------------------
 * 홍길동	80	40	60	70		250	62.5  합격
 * **************************************
 */
public class PassMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름과 자바,jsp,sql,스프링의 점수를 입력하세요.");
		Pass p = new Pass(s.next(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
		p.setSum();
		p.setAvg();
		
		System.out.println("**************************************************************");
		System.out.println("학생"+"\t"+"자바"+"\t"+"JSP"+"\t"+"SQL"+"\t"+"스프링"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
		System.out.println(p.setPass());
		System.out.println("**************************************************************");
		
	

	}

}
