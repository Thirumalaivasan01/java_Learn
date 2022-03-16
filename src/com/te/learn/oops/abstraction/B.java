package com.te.learn.oops.abstraction;

public class B extends A {
	public int c, d;
	{
		System.out.println("non static initializer of B class is executed");

	}
	static {
		System.out.println("static initializer of B class is executed");
	}

	public B(int a, int b) {
		this();
		this.c = a;
		this.d = b;
		System.out.println("B class argumented constructor is executed");
		// TODO Auto-generated constructor stub
	}

	public B() {
		super(30, 40);
		System.out.println("B class constructor is executed");
		// TODO Auto-generated constructor stub
	}

}
