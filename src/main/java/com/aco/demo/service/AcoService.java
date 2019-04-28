package com.aco.demo.service;

import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;


public interface AcoService {

	public boolean insertAcoParticipant(AcoParticipant acoParticipant);
	
	public boolean insertByAcoDetails(AcoDetails acoDetails);
	
	public boolean insertByAcoAgreementDetails(AcoAgreementDetails acoAgreementDetails);
	
	public AcoParticipant findAcoParticipantsByAcoParticipantId(String acoParticipantId);
	
	public AcoDetails findAcoDetailsByAcoId(String acoId);
	
	public AcoAgreementDetails findAcoAgreementDetailsByAcoAgreementId(String acoAgreementId);
	
}
