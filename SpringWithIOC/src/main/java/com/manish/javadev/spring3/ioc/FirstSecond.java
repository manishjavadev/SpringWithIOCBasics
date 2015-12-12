package com.manish.javadev.spring3.ioc;

public class FirstSecond {
	private FirstClass firstClass;
	private SecondClass secondClass;

	public void setFirstClass(FirstClass firstClass) {
		this.firstClass = firstClass;
	}

	public FirstSecond(SecondClass secondClass) {
		this.secondClass = secondClass;
	}

	public void display() {
		firstClass.display();
		secondClass.display();
	}

}
