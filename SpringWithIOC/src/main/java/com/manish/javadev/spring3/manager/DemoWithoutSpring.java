package com.manish.javadev.spring3.manager;

import com.manish.javadev.spring3.ioc.FirstClass;
import com.manish.javadev.spring3.ioc.FirstSecond;
import com.manish.javadev.spring3.ioc.SecondClass;

public class DemoWithoutSpring {
	public static void main(String[] args) {

		// Without Spring Java developer did manually
		// FirstClass object created
		System.out.println("Without Spring Container");
		FirstClass firstClass = new FirstClass();

		// FirstClass object initialization
		firstClass.setName("Manish");
		firstClass.setNumber(101);

		// SecondClass object created and initialized with constructor
		SecondClass secondClass = new SecondClass(100, "Manish");

		// FirstSecond object created and initialized with constructor and setter
		FirstSecond firstSecond = new FirstSecond(secondClass);
		firstSecond.setFirstClass(firstClass);
		firstSecond.display();
	}

}
