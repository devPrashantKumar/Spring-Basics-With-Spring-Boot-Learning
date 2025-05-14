package com.prashant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.prashant.repository.OwnerRepository;
import com.prashant.service.OwnerService;

@Service("commonService")
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl common bean created.");
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
