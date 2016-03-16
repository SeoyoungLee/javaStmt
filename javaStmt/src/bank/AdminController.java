package bank;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		
		AdminService service = new AdminServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 1.개설 2.목록 3.조회(계좌번호) 4.조회(이름) 5.계좌수 6.해지 0.종료 ");
			switch (s.nextInt()) {
			case 1: 
				System.out.println("이름과 비밀번호를 입력하세요.");
				service.openAccount(s.next(), s.nextInt());
				break;
			case 2: 
				System.out.println(service.getList());
				break;
			case 3: 
				System.out.println("계좌번호를 입력하세요.");
				System.out.println(service.findAccountByAccountNo(s.nextInt()));
				
				break;
			case 4: 
				System.out.println("이름을 입력하세요.");
				System.out.println(service.findAccountsByName(s.next()));
				break;
			case 5: 
				System.out.println(service.countAll());
				break;
			
			case 6: 
				System.out.println("해지할 계좌번호를 입력하세요.");
				System.out.println(service.closeAccount(s.nextInt()));
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
