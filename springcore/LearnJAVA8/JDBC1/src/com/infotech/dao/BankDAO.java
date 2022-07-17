package com.infotech.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.infotech.exception.AccountNotFoundException;
import com.infotech.exception.InsufficientBalanceException;
import com.infotech.model.Account;

public interface BankDAO {

	public void withdraw(Connection connection,Account fromAccount,Account toAccount,Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException;
	public void deposit(Connection connection,Account fromAccount,Account toAccount,Double amount)throws SQLException, AccountNotFoundException;
}