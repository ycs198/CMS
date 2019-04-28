package com.aco.demo.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.aco.demo.domain.AcoDetails;

@Entity
@Table(name="ACO_Details")
public class AcoDetailsDao {

	@Id
	@NotNull
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2",strategy="uuid2")
	@Column(name="ACO_ID")
	private String acoId;

	@NotNull
	@Column(name="ACO_Name")
	private String acoName;
	
	@Column(name="Program_Year")
	private int programYear;
	
	@Column(name="ACO_TIN")
	private String acoTin;
	
	@Column(name="Track")
	private String track;
	
	@Column(name="Agreement_Status")
	private boolean agreementStatus;
	
	@Column(name="Start_Date")
	private Date startDate;
	
	@Column(name="Agreement_Period")
	private int agreementPeriod;
	
	@Column(name="Performance_Year")
	private int performanceYear;
	
	@Column(name="ACO_Executive_Name")
	private String acoExecutiveName;
	
	@Column(name="ACO_Contact_Phone_Number")
	private int acoContactPhoneNumber;
	
	@Column(name="ACO_Contact_Email")
	private String acoContactEmail;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="Timestamp",nullable=false)
	private Date timestamp;
	
	public AcoDetailsDao() {
		super();
	}

	public AcoDetailsDao(AcoDetails acoDetails) {
		this.setAcoContactEmail(acoDetails.getAcoContactEmail());
		this.setAcoContactPhoneNumber(acoDetails.getAcoContactPhoneNumber());
		this.setAcoExecutiveName(acoDetails.getAcoExecutiveName());
		this.setAcoName(acoDetails.getAcoName());
		this.setAcoTin(acoDetails.getAcoTin());
		this.setAgreementPeriod(acoDetails.getAgreementPeriod());
		this.setAgreementStatus(acoDetails.isAgreementStatus());
		this.setPerformanceYear(acoDetails.getPerformanceYear());
		this.setProgramYear(acoDetails.getProgramYear());
		this.setStartDate(acoDetails.getStartDate());
		this.setTimestamp(acoDetails.getTimestamp());
		this.setTrack(acoDetails.getTrack());
		this.setUserName(acoDetails.getUserName());
	}

	public String getAcoId() {
		return acoId;
	}

	public void setAcoId(String acoId) {
		this.acoId = acoId;
	}

	public String getAcoName() {
		return acoName;
	}

	public void setAcoName(String acoName) {
		this.acoName = acoName;
	}

	public int getProgramYear() {
		return programYear;
	}

	public void setProgramYear(int programYear) {
		this.programYear = programYear;
	}

	public String getAcoTin() {
		return acoTin;
	}

	public void setAcoTin(String acoTin) {
		this.acoTin = acoTin;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public boolean isAgreementStatus() {
		return agreementStatus;
	}

	public void setAgreementStatus(boolean agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getAgreementPeriod() {
		return agreementPeriod;
	}

	public void setAgreementPeriod(int agreementPeriod) {
		this.agreementPeriod = agreementPeriod;
	}

	public int getPerformanceYear() {
		return performanceYear;
	}

	public void setPerformanceYear(int performanceYear) {
		this.performanceYear = performanceYear;
	}

	public String getAcoExecutiveName() {
		return acoExecutiveName;
	}

	public void setAcoExecutiveName(String acoExecutiveName) {
		this.acoExecutiveName = acoExecutiveName;
	}

	public int getAcoContactPhoneNumber() {
		return acoContactPhoneNumber;
	}

	public void setAcoContactPhoneNumber(int acoContactPhoneNumber) {
		this.acoContactPhoneNumber = acoContactPhoneNumber;
	}

	public String getAcoContactEmail() {
		return acoContactEmail;
	}

	public void setAcoContactEmail(String acoContactEmail) {
		this.acoContactEmail = acoContactEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "AcoDetails [acoId=" + acoId + ", acoName=" + acoName + ", programYear=" + programYear + ", acoTin="
				+ acoTin + ", track=" + track + ", agreementStatus=" + agreementStatus + ", startDate=" + startDate
				+ ", agreementPeriod=" + agreementPeriod + ", performanceYear=" + performanceYear
				+ ", acoExecutiveName=" + acoExecutiveName + ", acoContactPhoneNumber=" + acoContactPhoneNumber
				+ ", acoContactEmail=" + acoContactEmail + ", userName=" + userName + ", timestamp=" + timestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acoContactEmail == null) ? 0 : acoContactEmail.hashCode());
		result = prime * result + (int) (acoContactPhoneNumber ^ (acoContactPhoneNumber >>> 32));
		result = prime * result + ((acoExecutiveName == null) ? 0 : acoExecutiveName.hashCode());
		result = prime * result + ((acoId == null) ? 0 : acoId.hashCode());
		result = prime * result + ((acoName == null) ? 0 : acoName.hashCode());
		result = prime * result + ((acoTin == null) ? 0 : acoTin.hashCode());
		result = prime * result + agreementPeriod;
		result = prime * result + (agreementStatus ? 1231 : 1237);
		result = prime * result + performanceYear;
		result = prime * result + programYear;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((track == null) ? 0 : track.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcoDetailsDao other = (AcoDetailsDao) obj;
		if (acoContactEmail == null) {
			if (other.acoContactEmail != null)
				return false;
		} else if (!acoContactEmail.equals(other.acoContactEmail))
			return false;
		if (acoContactPhoneNumber != other.acoContactPhoneNumber)
			return false;
		if (acoExecutiveName == null) {
			if (other.acoExecutiveName != null)
				return false;
		} else if (!acoExecutiveName.equals(other.acoExecutiveName))
			return false;
		if (acoId == null) {
			if (other.acoId != null)
				return false;
		} else if (!acoId.equals(other.acoId))
			return false;
		if (acoName == null) {
			if (other.acoName != null)
				return false;
		} else if (!acoName.equals(other.acoName))
			return false;
		if (acoTin == null) {
			if (other.acoTin != null)
				return false;
		} else if (!acoTin.equals(other.acoTin))
			return false;
		if (agreementPeriod != other.agreementPeriod)
			return false;
		if (agreementStatus != other.agreementStatus)
			return false;
		if (performanceYear != other.performanceYear)
			return false;
		if (programYear != other.programYear)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (track == null) {
			if (other.track != null)
				return false;
		} else if (!track.equals(other.track))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
}
