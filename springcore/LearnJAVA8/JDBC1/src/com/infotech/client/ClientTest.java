package com.infotech.client;


import java.sql.SQLException;

import com.infotech.exception.AccountNotFoundException;
import com.infotech.exception.InsufficientBalanceException;
import com.infotech.model.Account;
import com.infotech.service.BankService;
import com.infotech.service.BankServiceImpl;

public class ClientTest {

	public static void main(String[] args) {
		
		BankService bankService = new BankServiceImpl();
		
		Double transferAmout = 1000.00;
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(9876835861L);
		
		Account toAccount = new Account();
		toAccount.setAccountNumber(9876598795L);
		
		try {
			bankService.fundTransfer(fromAccount, toAccount, transferAmout);
		} catch (SQLException | AccountNotFoundException | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}