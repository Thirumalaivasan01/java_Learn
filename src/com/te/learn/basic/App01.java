package com.te.learn;
/*
 * This is a normal demo java class*/
public class App01 {
/*	This is a main method*/
public static void main(String[] args) {
	// i=10;
	float f=10.123f;
	double d=12.123d;
	long l=12345l;
	//double res=i+f+d+l;
	//This cannot be int, float, long because the type which hold all of the data is hold on only by double 
	
	//double a=5.0d;
	int h=2;
	//double res=a/h;
	//System.out.print("result is:"+res);
	boolean b1=false;
	boolean b2=true;
	//char a='a';
	char b='b';
	//int res=a+b;
	//System.out.println(res);
	//System.out.println((char)(a+b));
	
	byte z1=1;
	byte z2=2;
	int z3=z1+z2;
	//System.out.println(z3);
	
	char aa='A';
	char bb='B';
	//char res_=(char)(aa+bb);
	//System.out.println(res_);
	
	int i=20,j=10;
	int res=i++ + ++j;
	int res_=i-- + --j;
	//System.out.println(res +" and "+ res_);
	
	int a=11;
	
	boolean res2=(a<=10)? true:false;
	if(res2) {
		System.out.println(a+" is less than or equal to 10");
	}
	else {
		System.out.println(a+" is greater than to 10");
	}
}
}
