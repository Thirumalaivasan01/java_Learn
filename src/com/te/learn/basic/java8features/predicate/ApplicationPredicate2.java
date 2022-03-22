package com.te.learn.basic.java8features.predicate;

import java.util.function.Predicate;

public class ApplicationPredicate2 {
	public static void main(String[] args) {
		String string = "Hello";
		Predicate<String> predicate = str -> {
			if (str.length() > 5)
				return true;
			return false;

		};
		System.out.println("The Given string have more than 5 character: " + predicate.test(string));
	}
}
