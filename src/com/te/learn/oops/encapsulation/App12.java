package com.te.learn.oops.encapsulation;

public class App12 {
	public static void main(String[] args) {
		Human human = new Human();
		human.setHumanName("Name01");
		human.setHumanHeight(180);
		human.setHumanAge(20);

	//	human.setAddress(human.createAddressObject());

		System.out.println(human.getHumanName());
		System.out.println(human.getHumanHeight());
		System.out.println(human.getHumanAge());
		System.out.println(human.getAddress());
		
	}
}
