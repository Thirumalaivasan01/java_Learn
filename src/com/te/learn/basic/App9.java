package com.te.learn.basic;

public class App9 {
	int a = 10;
	int b = 10;
	{
		System.out.println("Non static multiline initalizer got executed");

	}

	App9() {
		// 1.Non static member got loaded into the object
		// (Loading variable with default values+method references)
		// 2.Non static initializer will get executed
		// 3.Program written instruction got executed
		System.out.println("Programmer written instruction! app9() got executed");

	}

	App9(int a) {
		this();
		this.a = a;
		System.out.println("Programmer written instruction app9(int a) got executed");
	}

	App9(int a, int b) {
		this(a);
		this.b = b;
		
		System.out.println("Programmer written instruction app9(int a,int b) got executed");
	}

	public static void main(String[] args) {
		System.out.println("main method got executed");
		App9 app9 = new App9(20,40);
		System.out.println(app9.a);
		System.out.println(app9.b);
	}

}
