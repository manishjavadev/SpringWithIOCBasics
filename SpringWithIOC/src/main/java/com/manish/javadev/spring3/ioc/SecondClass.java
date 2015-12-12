package com.manish.javadev.spring3.ioc;

public class SecondClass {
	private int number;
	private String name;

	public SecondClass(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public void display() {
		System.out.println(number);
		System.out.println(name);
	}
}
