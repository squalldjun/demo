package com.joya.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
	@Id
	Integer employeeId;
	String role;
	String grade;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "EmployeeRole [employeeId=" + employeeId + ", role=" + role + ", grade=" + grade + "]";
	}
	
	
}
