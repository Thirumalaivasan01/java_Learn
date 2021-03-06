package com.te.learn.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ApplicationLL {
	public static void main(String[] args) {
		LinkedList<Student> linkedList = new LinkedList<Student>();
		linkedList.add(new Student(05, "Name05", 30));
		linkedList.add(new Student(06, "Name06", 26));
		linkedList.add(new Student(07, "Name07", 30));
		linkedList.add(new Student(8, "Name08", 26));

		System.out.println(linkedList);

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));

		}

		for (Object list : linkedList) {
			System.out.println(list);
		}

		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ListIterator listIterator = linkedList.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
