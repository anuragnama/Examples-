package com.git.supercar.model.transaction;

import com.git.supercar.model.payment.Payment;

public class Confirmation {

	
	private int ccrid;
	private BookingRecord bookingRecord;
	private Payment payment;
	private byte ccr_flag; //3flag r hereb 1 for cnfrm, 2 for cncl 3 for retrn
	
	public Confirmation() {
		// TODO Auto-generated constructor stub
	}

	public Confirmation(int ccrid, BookingRecord bookingRecord,
			Payment payment, byte ccr_flag) {
		super();
		this.ccrid = ccrid;
		this.bookingRecord = bookingRecord;
		this.payment = payment;
		this.ccr_flag = ccr_flag;
	}

	public int getCcrid() {
		return ccrid;
	}
	
 
	public void setCcrid(int ccrid) {
		this.ccrid = ccrid;
	}

	public BookingRecord getBookingRecord() {
		return bookingRecord;
	}

	public void setBookingRecord(BookingRecord bookingRecord) {
		this.bookingRecord = bookingRecord;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public byte getCcr_flag() {
		return ccr_flag;
	}

	public void setCcr_flag(byte ccr_flag) {
		this.ccr_flag = ccr_flag;
	}
	
	
	
}
