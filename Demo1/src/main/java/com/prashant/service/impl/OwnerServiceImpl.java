package com.prashant.service.impl;

import com.prashant.repository.OwnerRepository;
import com.prashant.service.OwnerService;


public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;  
	private int ownerId;

	public OwnerServiceImpl(OwnerRepository ownerRepository, int ownerId) {
		this.ownerRepository = ownerRepository;
		this.ownerId = ownerId;
		System.out.println("OwnerServiceImpl bean created.");
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
