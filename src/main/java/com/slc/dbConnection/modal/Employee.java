package com.slc.dbConnection.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@Column
	private String empName;
	@Column
	private String email;
	@Column
	private String mobileNUmber;
	
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNUmber() {
		return mobileNUmber;
	}
	public void setMobileNUmber(String mobileNUmber) {
		this.mobileNUmber = mobileNUmber;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", mobileNUmber="
				+ mobileNUmber + "]";
	}
	public Employee(String empName, String email, String mobileNUmber) {
		super();
		this.empName = empName;
		this.email = email;
		this.mobileNUmber = mobileNUmber;
	}
	public Employee() {
		super();
	}
	
	
	
	
	
	
}
