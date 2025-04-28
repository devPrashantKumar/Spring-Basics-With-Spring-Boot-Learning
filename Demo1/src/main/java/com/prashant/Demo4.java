package com.prashant;

import com.prashant.config.SpringConfig;
import com.prashant.service.OwnerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.register(SpringConfig.class);
		context.refresh();
		OwnerService ownerService = context.getBean("ownerServiceReal", OwnerService.class);
		System.out.println(ownerService.findOwner());
		context.close();
	}
}
