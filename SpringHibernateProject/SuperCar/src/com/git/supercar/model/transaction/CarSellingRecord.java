package com.git.supercar.model.transaction;

import java.util.Date;

import com.git.supercar.model.payment.Payment;
import com.git.supercar.model.usermodel.User;

public class CarSellingRecord {

	private int carsellid;
	private User user;
	private Payment payment;
	private Date dateofsale;
	private CarForSaleRecord carForSaleRecord;
	
	
	public CarSellingRecord() {
		
	}
	
	
	
	public CarSellingRecord(int carsellid, User user, Payment payment,
			Date dateofsale, CarForSaleRecord carForSaleRecord) {
		super();
		this.carsellid = carsellid;
		this.user = user;
		this.payment = payment;
		this.dateofsale = dateofsale;
		this.carForSaleRecord = carForSaleRecord;
	}



	public int getCarsellid() {
		return carsellid;
	}
	public void setCarsellid(int carsellid) {
		this.carsellid = carsellid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Date getDateofsale() {
		return dateofsale;
	}
	public void setDateofsale(Date dateofsale) {
		this.dateofsale = dateofsale;
	}
	public CarForSaleRecord getCarForSaleRecord() {
		return carForSaleRecord;
	}
	public void setCarForSaleRecord(CarForSaleRecord carForSaleRecord) {
		this.carForSaleRecord = carForSaleRecord;
	}
	
	
	
}
