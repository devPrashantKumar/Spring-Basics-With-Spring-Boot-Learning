package com.prashant.repository.impl;

import org.springframework.stereotype.Repository;

import com.prashant.repository.OwnerRepository;

@Repository("specialRepository")
public class OwnerRepositoryImpl2 implements OwnerRepository {
	public OwnerRepositoryImpl2() {
		System.out.println("OwnerRepositoryImpl special bean created.");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Found owner with ownerId %s from special repository", ownerId);
	}
}
