package com.te.learn.collectionframework.set;

import java.util.LinkedHashSet;

public class ApplicationLHS {
	public static void main(String[] args) {

		LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<Student>();

		linkedHashSet.add(new Student(1, "Name1", 20));
		linkedHashSet.add(new Student(2, "Name2", 25));
		linkedHashSet.add(new Student(2, "Name2", 25));
		linkedHashSet.add(new Student(3, "Name3", 30));

		for (Student student : linkedHashSet) {
			System.out.println(student);
		}
	}
}
