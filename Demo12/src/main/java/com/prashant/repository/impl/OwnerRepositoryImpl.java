package com.prashant.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.prashant.exception.OwnerNotFoundException;
import com.prashant.repository.OwnerRepository;

@Profile("prod")
@Repository
public class OwnerRepositoryImpl implements OwnerRepository {
	@Value("${owner.found}")
	private String ownerFound;
	@Value("${owner.not.found}")
	private String ownerNotFound;

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created.");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException {
		if (ownerId % 2 == 0) {
			return String.format(ownerFound, ownerId);
		} else {
			throw new OwnerNotFoundException(String.format(ownerNotFound, ownerId));
		}
	}
}
