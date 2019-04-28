package com.aco.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aco.demo.dao.AcoAgreementDetailsDao;
import com.aco.demo.dao.AcoAgreementDetailsRepository;
import com.aco.demo.dao.AcoDetailsDao;
import com.aco.demo.dao.AcoDetailsRepository;
import com.aco.demo.dao.AcoParticipantDao;
import com.aco.demo.dao.AcoParticipantsRepository;
import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;

@Service
public class AcoServiceImpl implements AcoService {
	
	@Autowired
	AcoParticipantsRepository acoParticipantsRepository;
	
	@Autowired
	AcoDetailsRepository acoDetailsRepository;
	
	@Autowired
	AcoAgreementDetailsRepository acoAgreementDetailsRepository;

	@Override
	public boolean insertAcoParticipant(AcoParticipant acoParticipant) {
		acoParticipant.setTimestamp(new Date());
		AcoParticipantDao acoParticipantDao = new AcoParticipantDao(acoParticipant);
		if(acoParticipantsRepository.save(acoParticipantDao) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertByAcoDetails(AcoDetails acoDetails) {
		acoDetails.setTimestamp(new Date());
		AcoDetailsDao acoDetailsDao = new AcoDetailsDao(acoDetails);
		if(acoDetailsRepository.save(acoDetailsDao) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertByAcoAgreementDetails(AcoAgreementDetails acoAgreementDetails) {
		acoAgreementDetails.setTimestamp(new Date());
		AcoAgreementDetailsDao acoAgreementDetailsDao = new AcoAgreementDetailsDao(acoAgreementDetails);
		if(acoAgreementDetailsRepository.save(acoAgreementDetailsDao) != null) {
			return true;
		}
		return false;
	}

	@Override
	public AcoParticipant findAcoParticipantsByAcoParticipantId(String acoParticipantId) {
		AcoParticipantDao acoParticipantDao = acoParticipantsRepository.findByAcoParticipantId(acoParticipantId);
		AcoParticipant acoParticipant = new AcoParticipant(acoParticipantDao);
		return acoParticipant;
	}

	@Override
	public AcoDetails findAcoDetailsByAcoId(String acoId) {
		AcoDetailsDao acoDetailsDao = acoDetailsRepository.findByAcoId(acoId);
		AcoDetails acoDetails = new AcoDetails(acoDetailsDao);
		return acoDetails;
	}

	@Override
	public AcoAgreementDetails findAcoAgreementDetailsByAcoAgreementId(String acoAgreementId) {
		AcoAgreementDetailsDao acoAgreementDetailsDao = acoAgreementDetailsRepository.findByAcoAgreementId(acoAgreementId);
		AcoAgreementDetails acoAgreementDetails = new AcoAgreementDetails(acoAgreementDetailsDao);
		return acoAgreementDetails;
	}

}
