package com.infotech.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.infotech.dao.BankDAO;
import com.infotech.dao.impl.BankDAOImpl;
import com.infotech.exception.AccountNotFoundException;
import com.infotech.exception.InsufficientBalanceException;
import com.infotech.model.Account;
import com.infotech.util.DBUtil;

public class BankServiceImpl implements BankService{

	BankDAO bankDAO = new BankDAOImpl();
	@Override
	public void fundTransfer(Account fromAccount, Account toAccount, Double amount) throws SQLException {
		Connection connection = DBUtil.getConnection();
		connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		try{
			connection.setAutoCommit(false);
			
			bankDAO.withdraw(connection,fromAccount, toAccount, amount);
			bankDAO.deposit(connection,fromAccount, toAccount, amount);
			
			connection.commit();

		} catch (Exception e) {
			if(connection != null){
				connection.rollback();
			}
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			if(connection != null){
				connection.close();
			}
		}
	}

	
	//Without handling transaction
/*	@Override
	public void fundTransfer(Account fromAccount, Account toAccount, Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException {
		Connection connection = DBUtil.getConnection();
		bankDAO.withdraw(connection, fromAccount, toAccount, amount);
		bankDAO.deposit(connection, fromAccount, toAccount, amount);
	}*/
}