package com.git.supercar.model.transaction;

import java.sql.Timestamp;
import java.util.Date;

public class Timesheet {

	private int timesheetid;
	private Date fromtime; 
	private Date totime; 
	private Date fromdate;
	private Date todate; 
	public Timesheet() {
		// TODO Auto-generated constructor stub
	}
	public Timesheet(int timesheetid, Date fromtime, Date totime,
			Date fromdate, Date todate) {
		super();
		this.timesheetid = timesheetid;
		this.fromtime = fromtime;
		this.totime = totime;
		this.fromdate = fromdate;
		this.todate = todate;
	}
	public int getTimesheetid() {
		return timesheetid;
	}
	public void setTimesheetid(int timesheetid) {
		this.timesheetid = timesheetid;
	}
	public Date getFromtime() {
		return fromtime;
	}
	public void setFromtime(Date fromtime) {
		this.fromtime = fromtime;
	}
	public Date getTotime() {
		return totime;
	}
	public void setTotime(Date totime) {
		this.totime = totime;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	
	
	
}
