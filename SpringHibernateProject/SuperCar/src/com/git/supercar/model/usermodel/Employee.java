package com.git.supercar.model.usermodel;

import java.util.Date;

import com.git.supercar.model.places.Branch;

public class Employee extends User  {

	
	private String role;
	private Branch branch;
	private Date joindate;
	
	public Date getJoindate() {
		return joindate;
	}
	
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public Branch getBranch() {
		return branch;
	}
	
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
