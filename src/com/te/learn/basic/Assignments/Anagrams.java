package com.te.learn.basic.Assignments;

import java.util.Arrays;

public class Anagrams {
public static void main(String[] args) {
	String s1="vijay ";
	String s2="jiVay";
	s1=s1.replaceAll("\\s","");
	s2=s2.replaceAll("\\s","");
	
	char s1arr[]=s1.toLowerCase().toCharArray();
	char s2arr[]=s2.toLowerCase().toCharArray();
	Arrays.sort(s1arr);
	Arrays.sort(s2arr);
	if(Arrays.equals(s1arr, s2arr))
		System.out.println("Yes");
	else
		System.out.println("No");
	for (char c : s1arr) {
		System.out.print(c);
	}
	System.out.println();
	for (char c : s2arr) {
		System.out.print(c);
	}
	//System.out.println(s1arr +""+s2arr);
	
}
}
