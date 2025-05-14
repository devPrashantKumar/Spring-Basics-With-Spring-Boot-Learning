package com.prashant.repository.impl;

import org.springframework.stereotype.Repository;

import com.prashant.exception.OwnerNotFoundException;
import com.prashant.repository.OwnerRepository;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {
	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created.");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException {
		if (ownerId % 2 == 0) {
			return String.format("Found owner with ownerId %s", ownerId);
		} else {
			throw new OwnerNotFoundException(String.format("Can't find owner with ownerId %s", ownerId));
		}
	}
}
