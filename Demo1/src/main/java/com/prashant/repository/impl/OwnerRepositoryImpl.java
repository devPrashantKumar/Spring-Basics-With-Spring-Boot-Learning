package com.prashant.repository.impl;

import com.prashant.repository.OwnerRepository;

public class OwnerRepositoryImpl implements OwnerRepository {
	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created.");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Found owner from repository with ownerId %s", ownerId);
	}
}
