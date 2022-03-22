package com.te.learn.basic.String;

public class StringExamples {
	public static void main(StringExamples[] args) {
		String s = "Hello";
		StringBuilder sbl = new StringBuilder(s);
		StringBuffer sbf = new StringBuffer(s);
		sbl.append("World");
		sbf.append("World");
		System.out.println(sbl);

	}
}
