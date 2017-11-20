package com.cgi.bank.services;

import java.util.Optional;

import com.cgi.bank.bo.Account;
import com.cgi.bank.bo.Client;

public interface AccountService {
	
         Account createAccount(Client client);
         
         Optional<Double> checkBalance(Account account);
         
         
}
