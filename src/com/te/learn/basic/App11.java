package com.te.learn.basic;

public class App11 {
	public static void main(String[] args) {
		Human human = new Human();
		human.setHumanAge(-30);
		human.setHumanHeight(-89);
		human.setHumanName("Name01");
		human.setHumanWeight(20);
		System.out.println(human.getHumanAge());
		System.out.println(human.getHumanHeight());
		System.out.println(human.getHumanName());
		System.out.println(human.getHumanWeight());
	}
}
