package com.te.learn.basic.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ReverseTreeSet {
	public static void main(String[] args) {
		Comparator reverse = (o1, o2) -> {
			Integer integer = (Integer) o1;
			Integer integer2 = (Integer) o2;
			if (integer < integer2)
				return 1;
			else if (integer > integer2)
				return -1;
			return 0;

		};
		TreeSet<Integer> treeSet = new TreeSet<Integer>(reverse);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(20);
		treeSet.add(5);
		treeSet.add(10);
		for (Integer integer : treeSet) {
			System.out.println(integer);
		}
		System.out.println("==========================");
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(8);
		hashSet.add(34);
		hashSet.add(5);
		hashSet.add(18);
		hashSet.add(10);
		List<Integer> list = new ArrayList<Integer>(hashSet);

		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("==========================");
		Collections.reverse(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("==========================");
		Collections.sort(list);

		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("==========================");
		Collections.reverse(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
