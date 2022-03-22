package com.te.learn.basic.Assignments;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char ch1, ch2;
		String repeated = "";
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = 0; j < s.length() ; j++) {
				ch1 = s.charAt(i);
				ch2 = s.charAt(j);
				if (ch1 == ch2 && i != j && (repeated.indexOf(ch1) == -1))
					repeated = repeated + ch1;

			}
		}
		System.out.println(repeated);
	}
}
