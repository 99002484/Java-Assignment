package com.collections;

public class Emp implements Comparable<Emp>{
	private String uname;
	private String ucity;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String uname, String ucity, Integer empId) {
		super();
		this.uname = uname;
		this.ucity = ucity;
		this.uempId = uempId;
	}
	@Override
	public String toString() {
		return "Emp [uname=" + uname + ", ucity=" + ucity + ", empId=" + empId + "]";
	}
	private Integer empId;
	public String getName() {
		return uname;
	}
	public void setName(String name) {
		this.uname = uname;
	}
	public String getCity() {
		return ucity;
	}
	public void setCity(String ucity) {
		this.ucity = ucity;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId; 
	}
	@Override
	public int compareTo(Emp employee) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(employee.getName());
	}
}
