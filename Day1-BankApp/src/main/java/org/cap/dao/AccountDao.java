package org.cap.dao;

import org.cap.dto.Account;
import org.cap.dto.Customer;

public interface AccountDao {
	/*new comments*/
	public boolean createAccount(Account account);
	
	public Account findAccountById(int accountNo);
	

}
