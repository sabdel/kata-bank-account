package com.cgi.bank;

import static org.junit.Assert.assertEquals;

import com.cgi.bank.bo.Account;
import com.cgi.bank.bo.Client;
import com.cgi.bank.services.AccountService;
import com.cgi.bank.services.AccountServiceImpl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountStepDefinitions {

	private Client client;
	private Account account;
	private AccountService accountService = new AccountServiceImpl();
	
	@Given("^an existing client named \"([^\"]*)\"$")
	public void an_existing_client_named(String username) throws Throwable {
              
		client = new Client(username);
	}

	@When("^he opens a bank account$")
	public void he_opens_a_bank_account() throws Throwable {
		account = accountService.createAccount(client);
	}

	@Then("^the initial balance is (\\d+)\\.(\\d+) EUR$")
	public void the_initial_balance_is_EUR(int arg1, int arg2) throws Throwable {
		String expectedBalance = arg1+"."+arg2;
	    assertEquals(0,Double.compare(accountService.checkBalance(account).get().doubleValue(), Double.parseDouble(expectedBalance)));;
	}

}
