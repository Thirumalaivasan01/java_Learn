package com.te.learn.basic;

public class App8 {
	//Single line Non static initializer
	int a=18;
	//Multiline non static initializer
	{
		System.out.println("Non satic multiline initializer got executed");
	}
	static int b=10;
	static {
		System.out.println("static multiline intializer got executed");
	}
	
public static void main(String[] args) {
	System.out.println("Main(System[] args) function is get executed");
	System.out.println("Now I am going to creat a object");
	App8 app8=new App8();
}
}
