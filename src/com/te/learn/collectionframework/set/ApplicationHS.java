package com.te.learn.collectionframework.set;

import java.util.HashSet;

public class ApplicationHS {
	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(10);
		hashSet.add(5);
		hashSet.add(15);
		hashSet.add(25);
		hashSet.add(60);
		hashSet.add(33);

		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
	}
}
