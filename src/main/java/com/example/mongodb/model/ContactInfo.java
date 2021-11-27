package com.example.mongodb.model;

import lombok.Data;

@Data
public class ContactInfo {

	private String phone_number;
	private String mobie_number;
	private String email;

	public ContactInfo() {

	}

	public ContactInfo(String phone_number, String mobie_number, String email) {
		super();
		this.phone_number = phone_number;
		this.mobie_number = mobie_number;
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getMobie_number() {
		return mobie_number;
	}

	public void setMobie_number(String mobie_number) {
		this.mobie_number = mobie_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactInfo [phone_number=" + phone_number + ", mobie_number=" + mobie_number + ", email=" + email
				+ "]";
	}

}
