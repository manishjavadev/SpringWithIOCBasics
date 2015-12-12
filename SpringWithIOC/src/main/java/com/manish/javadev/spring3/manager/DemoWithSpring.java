package com.manish.javadev.spring3.manager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.manish.javadev.spring3.ioc.FirstSecond;

public class DemoWithSpring {
	public static void main(String[] args) {

	ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	FirstSecond firstSecondObj = (FirstSecond) ctx.getBean("firstSecond");
	firstSecondObj.display();
}
}