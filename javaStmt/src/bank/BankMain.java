package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		//지역변수 영역
		Scanner scan = new Scanner(System.in);
		//AdminServiceImpl service = new AdminServiceImpl();
		BankServiceImpl bservice = new BankServiceImpl();
		AdminServiceImpl admin = new AdminServiceImpl(100);
		
		//연산영역
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("1.계좌개설 2.입금 3.출금 4.잔액조회 5.종료");
		int num = scan.nextInt();
		
		System.out.println("이름, 비밀번호를 입력하세요.");
		System.out.println(bservice.openAccount(scan.next(), scan.nextInt()));
		System.out.println("입금액을 입력하세요.");
		System.out.println(bservice.deposit(scan.nextInt()));
		System.out.println("출금액을 입력하세요.");
		System.out.println(bservice.withdraw(scan.nextInt()));
		bservice.findMoney();
		
		
		/*if(num==1){
			System.out.println("이름, 비밀번호를 입력하세요.");
			System.out.println(bservice.openAccount(scan.next(), scan.nextInt()));
		}else if(num==2){
			System.out.println("입금액을 입력하세요.");
			System.out.println(bservice.deposit(scan.nextInt()));
		}else if(num==3){
			System.out.println("출금액을 입력하세요.");
			System.out.println(bservice.withdraw(scan.nextInt()));
		}else if(num==4){
			bservice.findMoney();
		}else if(num==5){
			System.exit(0);
		}*/
		
		
	}
}
