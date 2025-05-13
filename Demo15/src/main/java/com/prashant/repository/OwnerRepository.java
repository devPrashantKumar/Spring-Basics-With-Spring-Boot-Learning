package com.prashant.repository;

import com.prashant.exception.OwnerNotFoundException;

/**
 * @author abhishekvermaa10
 *
 */
public interface OwnerRepository {
	String findOwner(int ownerId) throws OwnerNotFoundException;
}
