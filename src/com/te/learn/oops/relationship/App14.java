package com.te.learn.oops.relationship;

public class App14 extends Child {
	public static void main(String[] args) {
		Child ch = new Child(20);
		Parent p = new Parent();
		Parent pp = new Child();
		// System.out.println(ch.b);
		boolean b = pp instanceof Child;
		System.out.println(b);
	}
}
