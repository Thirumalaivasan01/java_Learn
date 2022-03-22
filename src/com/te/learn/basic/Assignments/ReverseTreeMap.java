package com.te.learn.basic.Assignments;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ReverseTreeMap {
	public static void main(String[] args) {
		Comparator c = (o1, o2) -> {
			Integer s1 = (Integer) o1;
			Integer s2 = (Integer) o2;
			if (s1 < s2)
				return 1;
			else if (s1 > s2)
				return -1;
			return 0;
		};
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(c);
		treeMap.put(4, 10);
		treeMap.put(3, 20);
		treeMap.put(1, 50);
		treeMap.put(6, 40);
		
		for (Map.Entry<Integer, Integer> i : treeMap.entrySet()) {
			// System.out.println(i.getKey()+" "+i);
			System.out.println(i);
		}

	}
}
