package com.prashant;

import com.prashant.config.SpringConfig;
import com.prashant.service.OwnerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		OwnerService ownerService = (OwnerService)context.getBean("ownerService2");
		System.out.println(ownerService.findOwner());
		((AnnotationConfigApplicationContext)context).close();
	}
}
