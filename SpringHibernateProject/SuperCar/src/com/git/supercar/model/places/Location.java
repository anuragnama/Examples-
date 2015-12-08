package com.git.supercar.model.places;

public class Location {

	
	private int locationid;
	private String street;
	private String city;
	private String state;
	private String pin;
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(int locationid, String street, String city, String state,
			String pin) {
		super();
		this.locationid = locationid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	
}
