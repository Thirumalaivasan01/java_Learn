package com.te.learn.oops.encapsulation;

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

	public Human(String humanName, int humanAge, int humanHeight, double humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
	}

	@Override
	public String toString() {
		return "[HumanName=" + humanName + ", HumanAge" + humanAge + ", HumanHeight" + humanHeight + ", HumanWeight"
				+ humanWeight + "]";
	}

	@Override
	public boolean equals(Object arg0) {
		Human human = (Human) arg0;
		// TODO Auto-generated method stub
		// return super.equals(arg0);
		if (this.humanAge == human.humanAge && this.humanName == human.humanName
				&& this.humanHeight == human.humanHeight && this.humanWeight == human.humanWeight) {
			return true;
		}
		return false;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

}
