package com.prashant.repository;

import com.prashant.exception.OwnerNotFoundException;

public interface OwnerRepository {
	String findOwner(int ownerId) throws OwnerNotFoundException;
}
