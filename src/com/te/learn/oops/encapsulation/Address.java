package com.te.learn.oops.encapsulation;

public class Address {
	private int houseNumber;
	private String street;
	private String city;
	private String state;

	public Address(int houseNumber, String street, String city, String state) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getHumanHouseNumber() {
		return houseNumber;
	}

	public void setHumanHouseNumber(int humanHouseNumber) {
		this.houseNumber = humanHouseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

}
