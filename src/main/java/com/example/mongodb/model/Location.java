package com.example.mongodb.model;

import lombok.Data;

@Data
public class Location {

	private String city;
	private String street;
	private String postal_code;

	public Location() {

	}

	public Location(String city, String street, String postal_code) {
		super();
		this.city = city;
		this.street = street;
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", street=" + street + ", postal_code=" + postal_code + "]";
	}

}
