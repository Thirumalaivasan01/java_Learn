package com.te.learn.oops.relationship;

public class B extends A {
	private int c = 30;
	private int d = 40;

	public B(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
