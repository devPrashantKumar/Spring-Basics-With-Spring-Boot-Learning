package com.prashant.repository.mock.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.prashant.exception.OwnerNotFoundException;
import com.prashant.repository.OwnerRepository;

@Profile("local")
@Repository
public class OwnerRepositoryImpl implements OwnerRepository {
	@Value("${owner.found}")
	private String ownerFound;

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl mock bean created.");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException {
		return String.format(ownerFound, ownerId);
	}
}
