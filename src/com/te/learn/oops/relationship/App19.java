package com.te.learn.oops.relationship;

public class App19 {
	public static void main(String[] args) {
		Human address1 = new Human("Name01", 22, 123, 78);
		Human address2 = new Human("Name01", 22, 123, 78);
		System.out.println(address1.equals(address2));
		System.out.println(address1 == address2);
	}
}
