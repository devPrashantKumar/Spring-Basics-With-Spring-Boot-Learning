package com.prashant.repository.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.prashant.repository.OwnerRepository;

@Primary
@Repository("commonRepository")
public class OwnerRepositoryImpl implements OwnerRepository {
	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl common bean created.");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Found owner with ownerId %s from common repository", ownerId);
	}
}
