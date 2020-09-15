package com.promineotech.lawClientProject.entity;

import java.util.Set;

import com.promineotech.lawClientProject.entity.CaseMatter;

public class Client {
	
	private Long id; 
	private String firstName; 
	private String lastName; 
	private String streetAddress;
	private String city; 
	private String state; 
	private String zipCode;
	private String phoneNumber;
	private String email;
	private Set<CaseMatter> CaseMatter;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<CaseMatter> getCaseMatter() {
		return CaseMatter;
	}

	public void setCaseMatter(Set<CaseMatter> caseMatter) {
		CaseMatter = caseMatter;
	}
	
	

}
