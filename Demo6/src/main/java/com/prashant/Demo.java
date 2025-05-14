package com.prashant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prashant.service.OwnerService;

@ComponentScan
@Configuration
public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);
		OwnerService ownerService = context.getBean("specialService", OwnerService.class);
		System.out.println(ownerService.findOwner());
		((AnnotationConfigApplicationContext) context).close();
	}
}
