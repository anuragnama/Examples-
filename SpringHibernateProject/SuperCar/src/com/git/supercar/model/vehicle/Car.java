package com.git.supercar.model.vehicle;

import java.util.Date;

import com.git.supercar.model.payment.VehicleCharges;
import com.git.supercar.model.places.Branch;

public class Car {

	private int carid;
	private String carname;
	private String reg_number;
	
	private Date dateofadded;
	private Date modelyear;
	private CarType cartype;
	private FualType fualtype;
	private byte  availability_flag;
	private Branch branch;
	
	




	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Car(int carid, String carname, String reg_number, Date dateofadded,
			Date modelyear, CarType cartype, FualType fualtype,
			byte availability_flag, Branch branch) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.reg_number = reg_number;
		this.dateofadded = dateofadded;
		this.modelyear = modelyear;
		this.cartype = cartype;
		this.fualtype = fualtype;
		this.availability_flag = availability_flag;
		this.branch = branch;
	}





	public int getCarid() {
		return carid;
	}


	public void setCarid(int carid) {
		this.carid = carid;
	}


	public String getCarname() {
		return carname;
	}


	public void setCarname(String carname) {
		this.carname = carname;
	}


	public String getReg_number() {
		return reg_number;
	}


	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}


	public Date getDateofadded() {
		return dateofadded;
	}


	public void setDateofadded(Date dateofadded) {
		this.dateofadded = dateofadded;
	}


	public Date getModelyear() {
		return modelyear;
	}


	public void setModelyear(Date modelyear) {
		this.modelyear = modelyear;
	}


	public CarType getCartype() {
		return cartype;
	}


	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}


	public FualType getFualtype() {
		return fualtype;
	}


	public void setFualtype(FualType fualtype) {
		this.fualtype = fualtype;
	}


	public byte getAvailability_flag() {
		return availability_flag;
	}


	public void setAvailability_flag(byte availability_flag) {
		this.availability_flag = availability_flag;
	}
	
	
	
	public Branch getBranch() {
		return branch;
	}





	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	
	
}
