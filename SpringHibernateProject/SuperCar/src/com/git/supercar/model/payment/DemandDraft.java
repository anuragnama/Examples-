package com.git.supercar.model.payment;

import java.util.Date;

public class DemandDraft {

	
	private String ddnumber;
	private String bankname;
	private String branch;
	private double amount;
	private Date deposit_date;
	private Date expire_date;
	private Payment payment;//many to one 
	
	public DemandDraft() {
		// TODO Auto-generated constructor stub
	}

	

	public DemandDraft(String ddnumber, String bankname, String branch,
			double amount, Date deposit_date, Date expire_date, Payment payment) {
		super();
		this.ddnumber = ddnumber;
		this.bankname = bankname;
		this.branch = branch;
		this.amount = amount;
		this.deposit_date = deposit_date;
		this.expire_date = expire_date;
		this.payment = payment;
	}



	public String getDdnumber() {
		return ddnumber;
	}



	public void setDdnumber(String ddnumber) {
		this.ddnumber = ddnumber;
	}



	public String getBankname() {
		return bankname;
	}



	public void setBankname(String bankname) {
		this.bankname = bankname;
	}



	public String getBrnach() {
		return branch;
	}



	public void setBrnach(String brnach) {
		this.branch = brnach;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public Date getDeposit_date() {
		return deposit_date;
	}



	public void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}



	public Date getExpire_date() {
		return expire_date;
	}



	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}



	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}



}