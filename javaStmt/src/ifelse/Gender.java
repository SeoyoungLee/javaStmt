package ifelse;

import java.util.Scanner;

/**
 * @file:Gender.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별반별하는 로직
 */
public class Gender {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.println("주민번호를 입력하세요");
		
		String name=scanner.next(), ssn = scanner.next();
		char flag = ssn.charAt(7);
		String gender="";
		/**
		 * 800101-1234567 일때
		 * charAt(인덱스값)은 인덱스에 해당하는 한 글자를 반환
		 * 단, 인덱스는 0부터 시작한다.
		 * 1,3 이면 남자 if(flag=1 || flag=3)
		 * 2,4 이면 여자
		 * 5,6 이면 외국인
		 * 다른값이면 잘못된 주민번호입니다.
		 * */
		
		if(flag=='1'||flag=='3'){
			gender="남자";
		}else if(flag=='2'||flag=='4'){
			gender="여자";
			
		}else if(flag=='5'||flag=='6'){
			gender="외국인";
		}
		
		System.out.println(name+"님은 "+gender+"입니다.");
	}

}
