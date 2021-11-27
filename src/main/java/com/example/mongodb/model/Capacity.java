package com.example.mongodb.model;

import lombok.Data;

@Data
public class Capacity {

	private int minimum_guests;
	private int maximum_guests;

	public Capacity() {

	}

	public Capacity(int minimum_guests, int maximum_guests) {
		super();
		this.minimum_guests = minimum_guests;
		this.maximum_guests = maximum_guests;
	}

	public int getMinimum_guests() {
		return minimum_guests;
	}

	public void setMinimum_guests(int minimum_guests) {
		this.minimum_guests = minimum_guests;
	}

	public int getMaximum_guests() {
		return maximum_guests;
	}

	public void setMaximum_guests(int maximum_guests) {
		this.maximum_guests = maximum_guests;
	}

	@Override
	public String toString() {
		return "Capacity [minimum_guests=" + minimum_guests + ", maximum_guests=" + maximum_guests + "]";
	}

}
