package com.example.mongodb.to;

import com.example.mongodb.model.Capacity;
import com.example.mongodb.model.ContactInfo;
import com.example.mongodb.model.Location;

public class CatererDetailsTo {

	int caterId;
	String name;
	Location location;
	Capacity capacity;
	ContactInfo contactInfo;

	public CatererDetailsTo() {
	}

	public CatererDetailsTo(int caterId, String name, Location location, Capacity capacity, ContactInfo contactInfo) {
		super();
		this.caterId = caterId;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.contactInfo = contactInfo;
	}

	public int getCaterId() {
		return caterId;
	}

	public void setCaterId(int caterId) {
		this.caterId = caterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Capacity getCapacity() {
		return capacity;
	}

	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

}
