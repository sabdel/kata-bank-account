package com.cgi.bank.bo;

import java.util.UUID;

public class Client {
	
	
	 private UUID  id;
	 
	 private String username;
	 
	public Client(String username) {
		super();
		this.id = UUID.randomUUID();
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public UUID getId() {
		return id;
	}
	
	
}
