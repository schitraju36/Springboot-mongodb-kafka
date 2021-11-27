package com.example.mongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Caterer
 */
@Document(collection = "caterers")
public class Caterer {

	@Id
	int caterId;
	String name;
	Location location;
	Capacity capacity;
	ContactInfo contactInfo;

	public Caterer() {
	}

	public Caterer(int caterId, String name, Location location, Capacity capacity, ContactInfo contactInfo) {
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

	@Override
	public String toString() {
		return "Caterer [caterId=" + caterId + ", name=" + name + ", location=" + location + ", capacity=" + capacity
				+ ", contactInfo=" + contactInfo + "]";
	}

}
