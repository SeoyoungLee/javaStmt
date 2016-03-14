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
public class Pass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 자바,jsp,sql,스프링의 점수를 입력하세요.");
		String name=scanner.next(), pass="";
		int java=scanner.nextInt(), jsp=scanner.nextInt(), sql=scanner.nextInt(), spring=scanner.nextInt(), sum=0, avg=0;
		
		sum=java+jsp+sql+spring;
		avg=sum/4;
		

		switch (avg/10) {
		case 10: case 9:case 8:case 7:case 6:
			pass="합격";
			break;
		case 5:case 4:case 3:case 2:case 1:case 0:
			pass="불합격";
			break;
		default:
			break;
		}
		
		
		System.out.println("**************************************************************");
		System.out.println("학생"+"\t"+"자바"+"\t"+"JSP"+"\t"+"SQL"+"\t"+"스프링"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
		System.out.println(name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+spring+"\t"+sum+"\t"+avg+"\t"+pass);
		System.out.println("**************************************************************");
		
	

	}

}
