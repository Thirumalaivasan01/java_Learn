package com.te.learn.basic.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ArrayToList {
	public static void main(String[] args) {
		String arr[] = { "aaa", "bbb" };
		String arr1[]=new String[4];
		List<String> list1=new ArrayList<String>();
		List<String> list= Arrays.asList(arr);
//		
		for (String string : arr) {
			list1.add(string);
		}
		System.out.println(list);
		System.out.println(list1);
		Collections.addAll(list1, arr);
		System.out.println(list1);
		
		
	}

}
