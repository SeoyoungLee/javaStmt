package forloop;

import java.util.Scanner;

/**
 * @file:Tax.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 이름과 연봉을 입력받아서 다음과 같은 결과물이 나오도록 출력하시오 세율은 10% [결과] 연봉***을 받으시는 **님께서
 *        이번달 납부할 세금은 ***만원입니다.
 */
public class TaxMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 연봉을 입력하세요.");
		Tax t = new Tax();
		t.setName(scanner.next());
		t.setNum(scanner.nextInt());
		t.setTax();
		System.out.println(t.toString());
	}
	
}
