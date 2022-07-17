package com.infotech.service;


import java.sql.SQLException;

import com.infotech.exception.AccountNotFoundException;
import com.infotech.exception.InsufficientBalanceException;
import com.infotech.model.Account;

public interface BankService {

	public void fundTransfer(Account fromAccount,Account toAccount,Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException;
}