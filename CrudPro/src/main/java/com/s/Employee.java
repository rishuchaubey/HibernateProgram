package com.s;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id@GeneratedValue

	private int Emp_id;
	private String Emp_name;
	public int getEmp_id() {
		return Emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	

}
