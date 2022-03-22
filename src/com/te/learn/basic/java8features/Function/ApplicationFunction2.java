package com.te.learn.basic.java8features.Function;

import java.util.function.Function;

public class ApplicationFunction2 {
	public static void main(String[] args) {
		Function<String, Boolean> function = str1 -> {
			int flag = 0;
			
			str1 = str1.toLowerCase();
			for (int i = 0, j = str1.length() - 1; i < str1.length() && j > 0; i++, j--) {
				if (str1.charAt(i) != str1.charAt(j))
					flag = 1;
			}
			if (flag == 0)
				return true;
			return false;
		};
		System.out.println("The Given String is Palindrome: " + function.apply("Malayalam"));
	}
}
