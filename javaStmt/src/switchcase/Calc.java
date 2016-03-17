package switchcase;

public class Calc {
	private int num1, num2, result, mok, nmg;
	private String opcode, msg;

	public Calc(int num1, String opcode, int num2) {
		this.num1 = num1;
		this.opcode = opcode;
		this.num2 = num2;
	}

	public String setCal() {

		switch (opcode) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 == 0) {
				return msg = "0으로 나눌 수 없습니다.";
			}
			mok = num1 / num2;
			nmg = num1 % num2;

			return msg = "몫 : " + mok + " 나머지: " + nmg;

		default:
			return msg = "연산기호를 잘못 입력";
		}
		return msg = num1 + opcode + num2 + "=" + result;
	}

}
