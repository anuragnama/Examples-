package com.git.supercar.model.vehicle;

public class FualType {

	
	private int fualtypeid;
	private String fualtype_name;
	private String fualtype_desc;
	
	public FualType() {
		// TODO Auto-generated constructor stub
	}

	public FualType(int fualtypeid, String fualtype_name, String fualtype_desc) {
		super();
		this.fualtypeid = fualtypeid;
		this.fualtype_name = fualtype_name;
		this.fualtype_desc = fualtype_desc;
	}

	public int getFualtypeid() {
		return fualtypeid;
	}

	public void setFualtypeid(int fualtypeid) {
		this.fualtypeid = fualtypeid;
	}

	public String getFualtype_name() {
		return fualtype_name;
	}

	public void setFualtype_name(String fualtype_name) {
		this.fualtype_name = fualtype_name;
	}

	public String getFualtype_desc() {
		return fualtype_desc;
	}

	public void setFualtype_desc(String fualtype_desc) {
		this.fualtype_desc = fualtype_desc;
	}
	
	
}
