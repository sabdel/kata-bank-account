package com.cgi.bank.services;

import java.util.Optional;

import com.cgi.bank.bo.Account;
import com.cgi.bank.bo.Client;

public class AccountServiceImpl implements AccountService {

	@Override
	public Account createAccount(Client client) {
		return new Account(client);
	}

	@Override
	public Optional<Double> checkBalance(Account account) {
		
		return Optional.of(account.getBalance());
	}

	

	

}
