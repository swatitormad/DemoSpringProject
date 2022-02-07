package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreMain {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("Core.xml");
		Student s =  (Student)ctx.getBean("s3");
		System.out.println(s);
		
		

	}

}
