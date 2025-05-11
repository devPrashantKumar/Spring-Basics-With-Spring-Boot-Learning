package com.prashant.service;

import com.prashant.exception.OwnerNotFoundException;

public interface OwnerService {
	String findOwner() throws OwnerNotFoundException;

	void modifyOwnerId(int ownerId);
}