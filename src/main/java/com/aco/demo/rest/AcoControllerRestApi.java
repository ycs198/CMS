package com.aco.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;

public interface AcoControllerRestApi {

	@RequestMapping(value="/test")
	public String testMethod();
	
	@PutMapping(value="/insertAcoParticipant",
			produces = { "application/json"},
			consumes = {"application/json"} )
	public ResponseEntity<Object> insertAcoParticipant(@RequestBody AcoParticipant acoParticipant);
	
	@PutMapping(value="/insertAcoDetails",
			produces = { "application/json"},
			consumes = {"application/json"})
	public ResponseEntity<Object> insertAcoDetails(@RequestBody AcoDetails acoDetails);
	
	@PutMapping(value="/insertAgreementDetails,\r\n" + 
			"			produces = { \"application/json\"},\r\n" + 
			"			consumes = {\"application/json\"}")
	public ResponseEntity<Object> insertAcoAgreementDetails(@RequestBody AcoAgreementDetails acoAgreementDetails);
	
	@GetMapping(value="/getAcoParticipant/{acoParticipantId}")
	public ResponseEntity<Object> getAcoParticipant(@PathVariable("acoParticipantId") String acoParticipantId);

	@GetMapping(value="/getAcoDetails/{acoId}")
	public ResponseEntity<Object> getAcoDetails(@PathVariable("acoId") String acoId);
	
	@GetMapping(value="/getAgreementDetails/{acoAgreementId}")
	public ResponseEntity<Object> getAgreementDetails(@PathVariable("acoAgreementId") String acoAgreementId);
}
