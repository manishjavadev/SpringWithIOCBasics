package com.manish.javadev.spring3.ioc;

public class FirstClass {
	private int number;
	private String name;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(number);
		System.out.println(name);
	}
}
