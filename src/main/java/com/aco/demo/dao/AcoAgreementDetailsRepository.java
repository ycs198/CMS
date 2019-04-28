package com.aco.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcoAgreementDetailsRepository extends JpaRepository<AcoAgreementDetailsDao,String>{

	public AcoAgreementDetailsDao findByAcoAgreementId(String acoAgreementId);
}
