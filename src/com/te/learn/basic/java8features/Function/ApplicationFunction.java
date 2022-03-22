package com.te.learn.basic.java8features.Function;

import java.util.function.Function;

public class ApplicationFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i * i;
		System.out.println("The Square is: " + function.apply(10));
	}
}
