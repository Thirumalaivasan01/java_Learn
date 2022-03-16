package com.te.learn.basic.finalkeyword;

import com.te.learn.oops.relationship.Address;

public class Human {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {

		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		if (humanAge <= 0) {
			System.out.println("The age entered is not correct");
		} else {
			this.humanAge = humanAge;
		}
	}

	public int getHumanHeight() {
		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight < 30) {
			System.out.println("Height entered is not correct");
		} else {
			this.humanHeight = humanHeight;
		}
	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(double humanWeight) {
		if (humanWeight < 5) {
			System.out.println("Weight entered is not correct");
		} else {
			this.humanWeight = humanWeight;
		}
	}

	public Address createAddressObject() {
		// return new Address(houseNumber, street, city,state);
		return new Address();
	}

	public Human(String humanName, int humanAge, int humanHeight, double humanWeight, Address address) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
		this.address = address;
	}

}