package com.prashant.service;

import com.prashant.exception.OwnerNotFoundException;

/**
 * @author abhishekvermaa10
 *
 */
public interface OwnerService {
	String findOwner() throws OwnerNotFoundException;

	void modifyOwnerId(int ownerId);
}