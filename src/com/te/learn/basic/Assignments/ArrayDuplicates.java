package com.te.learn.basic.Assignments;

import java.util.Arrays;

public class ArrayDuplicates {
public static void main(String[] args) {
	int a[]= {1,2,2,3,3,3,4,5,5,5,5,7};
	int n=a.length;
	Arrays.sort(a);
	for(int i=0;i<n-1;i++) {
	
		if(a[i]!=a[i+1])
			//continue;
			
			System.out.println(a[i]);
		else
			continue;
			//System.out.println(a[i]);
	}
	System.out.println(a[n-1]);
	
}
}
