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
	public AccountBean deposit(int accountNo,int money) {
		// 입금
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo()==accountNo){
				accountList.get(i).setMoney(accountList.get(i).getMoney()+money);
				return accountList.get(i);
			}
		}
		return null;
	}

	@Override
	public AccountBean withdraw(int accountNo,int money) {
		// 출금
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo()==accountNo){
				accountList.get(i).setMoney(accountList.get(i).getMoney()-money);
				return accountList.get(i);
			}
		}
		return null;
	}

	@Override
	public String findMoney(int accountNo) {
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo()==accountNo){
				return "현재잔액 : "+ accountList.get(i).getMoney();
			}
		}
		return null;
	
	}
}
