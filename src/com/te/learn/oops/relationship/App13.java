package com.te.learn.oops.relationship;

public class App13 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());
		System.out.println("==============");
		A a = new B();// up casting
		System.out.println(a.getA());
		System.out.println(a.getB());
		System.out.println("==============");
		// B bb=new (B) A();// Down casting //ClassCastException
		System.out.println("==============");
		A aa = new B();// up casting
		B bb = (B) aa;// down casting ==> B b=new B();
		System.out.println(bb.getA());
		System.out.println(bb.getB());
		System.out.println(bb.getD());
		System.out.println(bb.getC());
		System.out.println("==============");
		A aaa = new B();
		C cc = (C) aaa; // Class cast exception
		System.out.println(cc.getA());

		A aac = new C();
		C ccc = (C) aac;
		System.out.println(ccc.getA());

	}
}
