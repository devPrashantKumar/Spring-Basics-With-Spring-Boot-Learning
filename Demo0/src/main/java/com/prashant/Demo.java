package com.prashant;

import com.prashant.repository.OwnerRepository;
import com.prashant.repository.impl.OwnerRepositoryImpl;
import com.prashant.service.OwnerService;
import com.prashant.service.impl.OwnerServiceImpl;

public class Demo {
	public static void main(String[] args) {
		OwnerRepository ownerRepository = new OwnerRepositoryImpl();
		OwnerService ownerService = new OwnerServiceImpl(ownerRepository, 10);
		System.out.println(ownerService.findOwner());
	}
}
