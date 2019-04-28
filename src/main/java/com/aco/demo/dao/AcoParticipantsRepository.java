package com.aco.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcoParticipantsRepository extends JpaRepository<AcoParticipantDao,String>{

	public AcoParticipantDao findByAcoParticipantId(String acoParticipanId);
	
}
