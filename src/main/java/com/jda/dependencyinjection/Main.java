package com.jda.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jda/dependencyinjection/Spring-bean.xml");
     HelloWorld hellowrld=(HelloWorld) context.getBean("helloworld");
     System.out.println(hellowrld.getString());
	}

}
