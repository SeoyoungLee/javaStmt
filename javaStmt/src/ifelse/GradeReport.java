package ifelse;

import java.util.Scanner;

/**
 * @file:GradeReport.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라 A~F까지 학점부여)
 * [결과]
 * ****************
 * 이름	과목	점수	학점
 * -----------------
 * 홍길동	영어	89	D
 * *****************
 * 
 * 90점 이상 A
 * 80점 이상 B
 * 70점 이상 C
 * 60점 이상 D
 * 50점 이상 E
 * 50점 미만 F
 * 만약, 입력한 점수가 100점 초과하거나 0점 미만이면
 * 잘못 입력했습니다 라고 메세지 주기
 */
public class GradeReport {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 과목, 점수를 입력하세요.");
		String name=scanner.next(), subject=scanner.next(), grade="";
		int score=scanner.nextInt();
		
		if(score>=90){
			grade="A";
		}else if(score>=80){
			grade="B";
		}else if(score>=70){
			grade="C";
		}else if(score>=60){
			grade="D";
		}else if(score>=50){
			grade="E";
		}else if(score<50){
			grade="F";
		}
		
		System.out.println("***************************");
		System.out.println("이름"+"\t"+"과목"+"\t"+"점수"+"\t"+"학점");
		System.out.println(name+"\t"+subject+"\t"+score+"\t"+grade);
		System.out.println("***************************");
		
	}
}
