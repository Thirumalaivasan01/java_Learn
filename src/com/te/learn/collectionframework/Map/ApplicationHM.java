package com.te.learn.collectionframework.Map;

import java.util.HashMap;
import java.util.Map;

public class ApplicationHM {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(7, "A");
		hashMap.put(5, "c");
		hashMap.put(4, "f");
		hashMap.put(2, "h");
		hashMap.put(3, "j");

		for (Map.Entry<Integer, String> entrySet : hashMap.entrySet()) {
			System.out.println("Key: " + entrySet.getKey() + " Value: " + entrySet.getValue());
		}

	}
}
