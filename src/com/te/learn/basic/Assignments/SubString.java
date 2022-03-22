package com.te.learn.basic.Assignments;

public class SubString {
	public static void main(String[] args) {
		String s = "Hello";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i ; j < s.length(); j++) {
				System.out.println(s.substring(i, j+1));
			}
		}
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)>91) {
//				s.replace(s.charAt(i), (s.charAt(i)+31));
//			}
//		}
	}
}
