package bank;

import java.util.Vector;

public class BankServiceImpl implements BankService{
	private AccountBean account;
	Vector<AccountBean> accountList;
	
	public BankServiceImpl() {
		accountList = new Vector<AccountBean>();
	}

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		account = new AccountBean(name, password);
		accountList.add(account);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		// 입금
		account.setMoney(account.getMoney()+money);
		account.getMoney();
		return account.toString();
	}

	@Override
	public String withdraw(int money) {
		// 출금
		account.setMoney(account.getMoney()-money);
		account.getMoney();
		return account.toString();
	}

	@Override
	public String findMoney() {
		System.out.println("현재 잔액 : " + account.getMoney());
		return null;
	
	}
}
