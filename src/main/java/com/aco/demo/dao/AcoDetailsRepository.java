package com.aco.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcoDetailsRepository extends JpaRepository<AcoDetailsDao,String>{

	public AcoDetailsDao findByAcoId(String acoId);
}
