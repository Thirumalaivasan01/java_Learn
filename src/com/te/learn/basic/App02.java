package com.te.learn.basic;
import java.util.Scanner;
public class App02 {
	public static void main(String[] args) {
		int a=10;
		int b=11;
		int c=12;
		int d=13;
		int e=14;
		/*Logic to find greatest of 5 numbers using ternary operator*/
		int res=(a>b && a>c && a>d && a>e)?
				a:(b>c && b>d && b>e)?
						b:(c>d && c>e)?
								c:(d>e)?
										d:e;
		System.out.println("Result:"+ res);
		System.out.println("java"+20+30);
		System.out.println(20+30+"java");
		System.out.println(20+"java"+30);
		Scanner sc=new Scanner(System.in);
		int nextInt = sc.nextInt();
		System.out.println("Entered number"+ nextInt);
	}
}
