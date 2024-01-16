package com.meommu.meommuapi.core.kindergarten.repository;

public interface EmailCodeRepository {

	void save(String email, String code, Long milliseconds);

	String findByEmail(String email);

	boolean deleteByEmail(String email);
}
