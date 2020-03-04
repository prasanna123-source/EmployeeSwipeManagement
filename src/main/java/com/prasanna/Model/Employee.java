package com.prasanna.Model;

import java.util.Date;

public class Employee {
	private Integer empID;
	private String ename;
	private Date swipeIn;
	private Date swipeout;
	private String locationName;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getSwipeIn() {
		return swipeIn;
	}
	public void setSwipeIn(Date swipeIn) {
		this.swipeIn = swipeIn;
	}
	public Date getSwipeout() {
		return swipeout;
	}
	public void setSwipeout(Date swipeout) {
		this.swipeout = swipeout;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", ename=" + ename + ", swipeIn=" + swipeIn + ", swipeout=" + swipeout
				+ ", locationName=" + locationName + "]";
	}
	public Employee(Integer empID, String ename, Date swipeIn, Date swipeout, String locationName) {
		
		this.empID = empID;
		this.ename = ename;
		this.swipeIn = swipeIn;
		this.swipeout = swipeout;
		this.locationName = locationName;
	}
	public Employee() {
		
	}

}
