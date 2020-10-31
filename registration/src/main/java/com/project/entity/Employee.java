package com.project.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String name;
	private String email;
	private String phoneNumber;

	public Employee() {
	}

	public String getName() {
		return this.name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "{" + " name='" + getName() + "'" + ", email='" + getEmail() + "'" + ", phoneNumber='" + getPhoneNumber()
				+ "'" + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) o;
		return Objects.equals(name, employee.name) && Objects.equals(email, employee.email)
				&& Objects.equals(phoneNumber, employee.phoneNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, email, phoneNumber);
	}

}
