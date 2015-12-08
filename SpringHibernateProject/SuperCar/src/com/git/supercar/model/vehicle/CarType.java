package com.git.supercar.model.vehicle;

public class CarType {

	private int cartypeid;
	private String cartypename;
	private String cartypedesc;
	
	public CarType() {
		// TODO Auto-generated constructor stub
	}

	public CarType(int cartypeid, String cartypename, String cartypedesc) {
		super();
		this.cartypeid = cartypeid;
		this.cartypename = cartypename;
		this.cartypedesc = cartypedesc;
	}

	public int getCartypeid() {
		return cartypeid;
	}

	public void setCartypeid(int cartypeid) {
		this.cartypeid = cartypeid;
	}

	public String getCartypename() {
		return cartypename;
	}

	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}

	public String getCartypedesc() {
		return cartypedesc;
	}

	public void setCartypedesc(String cartypedesc) {
		this.cartypedesc = cartypedesc;
	}
	
	
	
}
