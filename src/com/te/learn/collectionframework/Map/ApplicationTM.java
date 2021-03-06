package com.te.learn.collectionframework.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ApplicationTM {
	public static void main(String[] args) {

		Comparator comparator = (o1, o2) -> {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			if (i1 < i2)
				return 1;
			else if (i1 > i2)
				return -1;
			return 0;

		};

		TreeMap<Integer, Student> treeMap = new TreeMap<Integer, Student>(comparator);

		treeMap.put(1, new Student(1, "A", 22));
		treeMap.put(2, new Student(3, "W", 22));
		treeMap.put(5, new Student(10, "Z", 22));
		treeMap.put(9, new Student(6, "K", 22));

		for (Map.Entry<Integer, Student> entry : treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

	}
}
