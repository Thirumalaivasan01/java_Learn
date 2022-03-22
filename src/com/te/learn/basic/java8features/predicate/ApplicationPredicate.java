package com.te.learn.basic.java8features.predicate;

import java.util.function.Predicate;

import javax.print.attribute.IntegerSyntax;

public class ApplicationPredicate {
	public static void main(String[] args) {
		int m = 9;
		// Using lambda function!
		Predicate<Integer> predicate = i -> {
			if (i % 2 == 0)
				return true;
			return false;

		};
		// Using anonymous class!
		Predicate<Integer> predicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				if (t % 2 == 0)
					return true;
				return false;
			}

		};
		// Using lambda expression, but better!
		Predicate<Integer> predicate3 = i -> i % 2 == 0;
		System.out.println("Given number is Even: " + predicate3.test(m));
	}
}
