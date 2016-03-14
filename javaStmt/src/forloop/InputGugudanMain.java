package forloop;

import java.util.Scanner;

/**
 * @file:InputGugudan.java
 * @author lsy
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기 예를 들면 2를 입력하면 2단 출력 109단을 입력하면 109*2~109*9까지 출력 다만,
 *        0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력
 */
public class InputGugudanMain {
	public static void main(String[] args) {
		System.out.println("입력받은 정수의 구구단 구하기 " + "예를 들면 2를 입력하면 2단 출력" + " 109단을 입력하면 109*2~109*9까지 출력"
				+ "다만, 0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력" + "정수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);

		InputGugudan ig = new InputGugudan();
		ig.setNum(scanner.nextInt());
		ig.getGugudan();
		
		/*if (num > 0) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + num * i);
			}

		} else {
			System.out.println("정수를 입력하세요.");
		}*/

	}

}
