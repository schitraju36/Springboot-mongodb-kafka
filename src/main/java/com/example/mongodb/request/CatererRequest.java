package com.example.mongodb.request;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.mongodb.model.Capacity;
import com.example.mongodb.model.ContactInfo;
import com.example.mongodb.model.Location;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Caterer
 */
public class CatererRequest {
	@JsonProperty("caterId")
	int caterId;
	@JsonProperty("name")
	String name;
	@JsonProperty("location")
	Location location;
	@JsonProperty("capacity")
	Capacity capacity;
	@JsonProperty("contactInfo")
	ContactInfo contactInfo;

	public CatererRequest() {

	}

	public CatererRequest(int caterId, String name, Location location, Capacity capacity, ContactInfo contactInfo) {
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
		return "CatererRequest [caterId=" + caterId + ", name=" + name + ", location=" + location + ", capacity="
				+ capacity + ", contactInfo=" + contactInfo + "]";
	}

}
