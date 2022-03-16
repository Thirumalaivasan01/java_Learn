package com.te.learn.oops.abstraction.interfaces;

public class Impl implements Left, Right {

	@Override
	public void m1() {
		Left.super.m1();
	}

}
