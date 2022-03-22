package com.te.learn.basic.Assignments;

import java.util.Scanner;

public class XylemPhloem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double number = sc.nextDouble();
		double copy = number;
		int extreme = 0, mean = 0;
		while (number > 0) {
			if (number == copy)
				extreme += (number % 10);

			else if (number < 10)
				extreme += (number % 10);
			else
				mean += (number % 10);
			number = number / 10;
		}
		if (extreme == mean)
			System.out.println("Given number is Xylem");
		else
			System.out.println("Given number is Phloem");
	}
}
