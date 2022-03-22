package com.te.learn.basic.Assignments;

import java.util.Arrays;

public class ReverseOfWords {
	public static void main(String[] args) {
		String s="Hello Java Programming Hello Programming";
		String[] sa=s.split(" ");
		for(int i=sa.length-1;i>=0;i--) {
			System.out.print(sa[i]+" ");
		}
		Arrays.sort(sa);
		System.out.println();
		for(int i=0;i<sa.length-1;i++) {
			if(sa[i].equals(sa[i+1]))
				System.out.println(sa[i]);
				
		}
		
		
	}
}
