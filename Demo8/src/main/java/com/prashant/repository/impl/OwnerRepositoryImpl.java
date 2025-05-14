package com.prashant.repository.impl;

import org.springframework.stereotype.Repository;

import com.prashant.repository.OwnerRepository;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {
	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created.");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Found owner with ownerId %s", ownerId);
	}
}
