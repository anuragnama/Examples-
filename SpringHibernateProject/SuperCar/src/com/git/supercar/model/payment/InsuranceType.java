package com.git.supercar.model.payment;

public class InsuranceType {

	private int insurancetypeid;
	private String insurance_descr;
	
	public InsuranceType() {
		// TODO Auto-generated constructor stub
	}

	public InsuranceType(int insurancetypeid, String insurance_descr) {
		super();
		this.insurancetypeid = insurancetypeid;
		this.insurance_descr = insurance_descr;
	}

	public int getInsurancetypeid() {
		return insurancetypeid;
	}

	public void setInsurancetypeid(int insurancetypeid) {
		this.insurancetypeid = insurancetypeid;
	}

	public String getInsurance_descr() {
		return insurance_descr;
	}

	public void setInsurance_descr(String insurance_descr) {
		this.insurance_descr = insurance_descr;
	}
	
	
	
}
