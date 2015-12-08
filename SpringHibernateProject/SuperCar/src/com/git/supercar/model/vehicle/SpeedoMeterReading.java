package com.git.supercar.model.vehicle;

import java.util.Date;

public class SpeedoMeterReading {

	
	
	private int speedometerid;
	private Date readingdate;
	private Date readingtime;
	private int reading;
	private int version;
	private Car car;
	
	public SpeedoMeterReading() {
		// TODO Auto-generated constructor stub
	}

	public SpeedoMeterReading(int speedometerid, Date readingdate,
			Date readingtime, int reading, int version, Car car) {
		super();
		this.speedometerid = speedometerid;
		this.readingdate = readingdate;
		this.readingtime = readingtime;
		this.reading = reading;
		this.version = version;
		this.car = car;
	}

	public int getSpeedometerid() {
		return speedometerid;
	}

	public void setSpeedometerid(int speedometerid) {
		this.speedometerid = speedometerid;
	}

	public Date getReadingdate() {
		return readingdate;
	}

	public void setReadingdate(Date readingdate) {
		this.readingdate = readingdate;
	}

	public Date getReadingtime() {
		return readingtime;
	}

	public void setReadingtime(Date readingtime) {
		this.readingtime = readingtime;
	}

	public int getReading() {
		return reading;
	}

	public void setReading(int reading) {
		this.reading = reading;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
