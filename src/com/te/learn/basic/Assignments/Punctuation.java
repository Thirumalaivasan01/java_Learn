package com.te.learn.basic.Assignments;

public class Punctuation {
public static void main(String[] args) {
	String s="gde@^*(km;gs";
	s=s.replaceAll("[a-z A-Z]", "");
	System.out.println(s);
}
}
