package com.te.learn.collectionframework.set;

import java.util.HashSet;

public class ApplicationHS2 {
	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<Student>();

		hashSet.add(new Student(1, "Name1", 20));
		hashSet.add(new Student(2, "Name2", 25));
		hashSet.add(new Student(2, "Name2", 25));
		hashSet.add(new Student(3, "Name3", 30));

		for (Student student : hashSet) {
			System.out.println(student);

		}
	}
}
