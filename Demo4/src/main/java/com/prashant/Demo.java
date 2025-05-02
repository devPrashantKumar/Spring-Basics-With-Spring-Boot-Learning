package com.prashant;

import com.prashant.config.SpringConfig;
import com.prashant.repository.OwnerRepository;
import com.prashant.service.OwnerService;
import com.prashant.service.impl.OwnerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		OwnerRepository ownerRepository = context.getBean("ownerRepositoryImpl", OwnerRepository.class);
		OwnerService ownerService = context.getBean("ownerServiceImpl", OwnerService.class);

		((OwnerServiceImpl)ownerService).setOwnerRepository(ownerRepository);
		((OwnerServiceImpl)ownerService).setOwnerId(10);

		System.out.println(ownerService.findOwner());
		((AnnotationConfigApplicationContext)context).close();
	}
}
