package com.cgi.bank.bo;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Account {

	private UUID  id;
	private Client client;
	private double balance;
	private Set<AccountOperation> operations;
	public Account(Client client) {
		super();
		this.id= UUID.randomUUID();
		this.client = client;
		this.balance = 0;
		this.operations = new HashSet<>();
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Set<AccountOperation> getOperations() {
		return operations;
	}
	public void setOperations(Set<AccountOperation> operations) {
		this.operations = operations;
	}
	
	
}
