package com.te.learn.basic.java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationStream {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "A", 22));
		arrayList.add(new Student(6, "N", 28));
		arrayList.add(new Student(10, "T", 23));
		arrayList.add(new Student(8, "Q", 21));

		List<Student> res = new ArrayList<Student>();

		for (Student student : arrayList) {
			if (student.getsAge() <= 25) {
				res.add(student);
			}

		}

		System.out.println("====================");
		System.out.println(res);

		res = arrayList.stream().filter(s -> s.getsAge() <= 25).collect(Collectors.toList());
		System.out.println("====================");
		System.out.println(res);
		Comparator<Student> comparator = (o1, o2) -> {
			if (o1.getsAge() < o2.getsAge()) {
				return -1;
			} else if (o1.getsAge() > o2.getsAge()) {
				return 1; 
			}
			return 0;

		};
		res = arrayList.stream().sorted(comparator).collect(Collectors.toList());
		System.out.println("====================");
		System.out.println(res);

	}
}
