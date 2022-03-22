package com.te.learn.basic.Assignments;

public class ThirdMaxMin {
public static void main(String[] args) {
	int a[]= {300,1,150,100,30,19,20,15,8,90,70} ;
	int fmax=Integer.MIN_VALUE,smax=0,tmax=0;
	int fmin=Integer.MAX_VALUE,smin=Integer.MAX_VALUE,tmin=Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>=fmax) {
			tmax=smax;
			smax=fmax;
			fmax=a[i];
		}
		else if(a[i]>=smax) {
			tmax=smax;
			smax=a[i];
		}
		else if(a[i]>=tmax)
			tmax=a[i];
		
//		if(a[i]>=fmax) {
//			fmax=a[i];
//		}
//		
//		else if(a[i]<fmax && a[i]>=smax)
//			smax=a[i];
//		else if(a[i]<smax && a[i]>=tmax)
//			tmax=a[i];
		
	
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]<=fmin) {
			tmin=smin;
			smin=fmin;
			fmin=a[i];
		}
		
		else if(a[i]<=smin) {
			tmin=smin;
			smin=a[i];
			
		}
		else if( a[i]<=tmin)
			tmin=a[i];
		
		//if(a[i])
	}
	
	System.out.println(fmax+" "+smax+" "+tmax);
	System.out.println(fmin+" "+smin+" "+tmin);
}
}
