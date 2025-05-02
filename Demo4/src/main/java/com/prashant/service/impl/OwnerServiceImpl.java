package com.prashant.service.impl;

import com.prashant.repository.OwnerRepository;
import com.prashant.service.OwnerService;
import org.springframework.stereotype.Component;

@Component
public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;  
	private int ownerId;

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl bean created using 0 arg constructor.");
	}

	public OwnerServiceImpl(OwnerRepository ownerRepository, int ownerId) {
		this.ownerRepository = ownerRepository;
		this.ownerId = ownerId;
		System.out.println("OwnerServiceImpl bean created.");
	}

	public OwnerRepository getOwnerRepository() {
		return ownerRepository;
	}

	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
