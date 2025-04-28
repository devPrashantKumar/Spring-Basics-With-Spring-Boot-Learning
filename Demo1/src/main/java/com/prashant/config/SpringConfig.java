package com.prashant.config;

import com.prashant.repository.OwnerRepository;
import com.prashant.repository.impl.OwnerRepositoryImpl;
import com.prashant.service.OwnerService;
import com.prashant.service.impl.OwnerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public OwnerService ownerService() {
		return new com.prashant.service.mock.impl.OwnerServiceImpl(10);
	}
	
	@Bean("ownerServiceReal")
	public OwnerService ownerService2() {
		return new OwnerServiceImpl(ownerRepository(), 10);
	}
	
	@Bean
	public OwnerRepository ownerRepository() {
		return new OwnerRepositoryImpl();
	}
}
