package com.cgi.bank.bo;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;

public class AccountOperation {

	   private UUID  id;
	   private Date date;
	   private BigDecimal ammount;
	   private Currency currency;
	
	   
	public AccountOperation(Date date, BigDecimal ammount, Currency currency) {
		super();
		this.date = date;
		this.ammount = ammount;
		this.currency = currency;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getAmmount() {
		return ammount;
	}
	public void setAmmount(BigDecimal ammount) {
		this.ammount = ammount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public UUID getId() {
		return id;
	}
	
		 
	   
	   
	   
}
