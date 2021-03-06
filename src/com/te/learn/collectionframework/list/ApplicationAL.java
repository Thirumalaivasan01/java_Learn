package com.te.learn.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ApplicationAL {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList();
		arrayList.add(new Student(01, "Name01", 20));
		arrayList.add(new Student(02, "Name02", 21));
		arrayList.add(new Student(03, "Name03", 22));
		arrayList.add(new Student(04, "Name04", 25));
		System.out.println("#1============ Normal println");
		System.out.println(arrayList);
		System.out.println("#2============ Using for loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("#3============Using for each loop");
		for (Object student : arrayList) {
			System.out.println(student);

		}

		System.out.println("#4============ Using Iterator");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("#5============ Using List Iterator");
		ListIterator listIterator = arrayList.listIterator();
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());

		System.out.println("#6============ Using List Iterator");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

	}
}
