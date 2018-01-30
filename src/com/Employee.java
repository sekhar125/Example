package com;

public class Employee {
	String id;
	String fname;
	String lname;
	Double sal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+""+fname+""+lname+""+sal;
	}
	//@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return this.id.equals(((Employee)arg0).getId());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
