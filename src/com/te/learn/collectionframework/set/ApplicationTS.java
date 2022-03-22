package com.te.learn.collectionframework.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ApplicationTS {
	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<Student>();

		System.out.println("=============using comparable interface");

		treeSet.add(new Student(01, "Name1", 20));
		treeSet.add(new Student(02, "Name2", 25));
		treeSet.add(new Student(03, "Name3", 22));
		treeSet.add(new Student(04, "Name4", 30));

		for (Student student : treeSet) {
			System.out.println(student);

		}
		System.out.println("=============using Comparator interface-sort by age");
		Comparator byAge = (o1, o2) -> {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			if (student1.getsAge() < student2.getsAge()) {
				return -1;
			} else if (student1.getsAge() > student2.getsAge()) {
				return 1;
			}
			return 0;

		};
		TreeSet<Student> treeSet1 = new TreeSet<Student>(byAge);

		treeSet1.add(new Student(01, "Name1", 20));
		treeSet1.add(new Student(02, "Name2", 25));
		treeSet1.add(new Student(02, "Name2", 25));
		treeSet1.add(new Student(03, "Name3", 22));
		treeSet1.add(new Student(04, "Name4", 30));

		for (Student student : treeSet1) {
			System.out.println(student);
		}
		System.out.println("=============using Comparator interface-sort by id");

		Comparator byId = (o1, o2) -> {
			Student student1 = (Student) o1;
			Student student2 = (Student) o2;
			if (student1.getsId() < student2.getsId()) {
				return -1;
			} else if (student1.getsId() > student2.getsId()) {
				return 1;
			}
			return 0;

		};

		TreeSet<Student> treeSet2 = new TreeSet<Student>(byId);

		treeSet2.add(new Student(01, "Name1", 20));
		treeSet2.add(new Student(02, "Name2", 25));
		treeSet2.add(new Student(02, "Name2", 25));
		treeSet2.add(new Student(03, "Name3", 22));
		treeSet2.add(new Student(04, "Name4", 30));

		for (Student student : treeSet2) {
			System.out.println(student);
		}
	}
}
