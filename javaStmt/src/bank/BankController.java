package bank;

import java.util.Scanner;

public class BankController {
	public static void main(String[] args) {
		BankServiceImpl service = new BankServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 1.계좌개설 2.입금 3.출금 4.잔액조회 0.종료");
			switch (s.nextInt()) {
			case 1: 
				System.out.println("이름과 비밀번호를 입력하세요.");
				System.out.println(service.openAccount(s.next(), s.nextInt()));
				break;
			case 2: 
				System.out.println("계좌번호와 입금액을 입력하세요.");
				System.out.println(service.deposit(s.nextInt(), s.nextInt()));
				break;
			case 3: 
				System.out.println("계좌번호와 출금액을 입력하세요.");
				System.out.println(service.withdraw(s.nextInt(), s.nextInt()));
				break;
			case 4: 
				System.out.println("조회할 계좌번호를 입력하세요");
				System.out.println(service.findMoney(s.nextInt()));
				break;
			case 0: 
				System.out.println("종료합니다.");
				return;

			default:
				return;
			}
		}
	}
}
