package com.te.learn.basic;

public class App4 {
	static {
		System.out.println("static multiline intializer got executed");
		App4 app = new App4();
		int a = app.returnMeInt();
		System.out.println("Value received is " + a);
	}
	
	static int a = 10;
	
	public int returnMeInt() {
		return 10;
	}

	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() method got executed");

	}

	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod() method got executed");
	}

	public static void main(String[] args) {
		System.out.println("main(String[]args method got executed");
		demoStaticMethod();
		App4 app4 = new App4();
		app4.demoNonStaticMethod();
	}
}
