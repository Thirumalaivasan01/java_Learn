package com.te.learn.collectionframework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Map.Entry;

public class ApplicationLHM {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "A");
		linkedHashMap.put(5, "c");
		linkedHashMap.put(4, "f");
		linkedHashMap.put(8, "h");
		linkedHashMap.put(2, "j");

		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

		}
	}
}
