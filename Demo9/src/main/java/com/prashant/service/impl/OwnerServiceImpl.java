package com.prashant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.prashant.repository.OwnerRepository;
import com.prashant.service.OwnerService;

/**
 * @author abhishekvermaa10
 *
 */
@Scope("prototype")
@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl bean created.");
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}

	@Override
	public void modifyOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
}
