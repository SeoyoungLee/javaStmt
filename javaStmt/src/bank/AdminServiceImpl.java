package bank;

import java.util.Vector;

public class AdminServiceImpl implements AdminService{
	
	private AccountBean account;
	Vector<AccountBean> accountList;
	int count;
	
	public AdminServiceImpl() {
		accountList = new Vector<AccountBean>();
	}

	@Override
	public String openAccount(String name, int password) {
		//  계좌 개설
		account = new AccountBean(name, password);
		accountList.add(account);
		count++;
		return account.toString();
		
	}

	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌 목록 출력
		return accountList;
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo()==accountNo){
				return accountList.get(i);
			}
		}
		return null;
	}

	@Override
	public Vector<AccountBean> findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getName()==name){
				
			}
		}		
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return count;
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		return 0;
	}

}
