package ifelse;

import java.util.Scanner;

public class TrinomialMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 국어, 영어, 수학 점수 입력");
		
		Trinomial t = new Trinomial();
		t.setName(scanner.next());
		t.setAvg(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		t.setResult();
		System.out.println(t.toString());
	}
}
