/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import java.util.Date;

//import jakarta.persistence.*;
/**
 * @author LIYAJERARD
 *
 */
//@Entity
public class Personal {

	/**
	 * 
	 */
	//@Id
	//@GeneratedValue
	public Integer caseNo;
	public String borrowerType;
	public String name;
	public Date dob;
	public String pan;
	//@Embedded
	public ContactInfo contDetails;
	//@Embedded
	public EmpHistory empHist;
	//@Embedded
	public FinanceInfo finDet;
	//@Embedded
	public CredHistory credDet;
	
	
	/**
	 * @param caseNo
	 * @param borrowerType
	 * @param name
	 * @param dob
	 * @param pan
	 * @param contDetails
	 * @param empHist
	 * @param finDet
	 * @param credDet
	 */
	public Personal(Integer caseNo, String borrowerType, String name, Date dob, String pan, ContactInfo contDetails,
			EmpHistory empHist, FinanceInfo finDet, CredHistory credDet) {
		super();
		this.caseNo = caseNo;
		this.borrowerType = borrowerType;
		this.name = name;
		this.dob = dob;
		this.pan = pan;
		this.contDetails = contDetails;
		this.empHist = empHist;
		this.finDet = finDet;
		this.credDet = credDet;
	}


	/**
	 * @return the caseNo
	 */
	public Integer getCaseNo() {
		return caseNo;
	}


	/**
	 * @param caseNo the caseNo to set
	 */
	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}


	/**
	 * @return the borrowerType
	 */
	public String getBorrowerType() {
		return borrowerType;
	}


	/**
	 * @param borrowerType the borrowerType to set
	 */
	public void setBorrowerType(String borrowerType) {
		this.borrowerType = borrowerType;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}


	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}


	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}


	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}


	/**
	 * @return the contDetails
	 */
	public ContactInfo getContDetails() {
		return contDetails;
	}


	/**
	 * @param contDetails the contDetails to set
	 */
	public void setContDetails(ContactInfo contDetails) {
		this.contDetails = contDetails;
	}


	/**
	 * @return the empHist
	 */
	public EmpHistory getEmpHist() {
		return empHist;
	}


	/**
	 * @param empHist the empHist to set
	 */
	public void setEmpHist(EmpHistory empHist) {
		this.empHist = empHist;
	}


	/**
	 * @return the finDet
	 */
	public FinanceInfo getFinDet() {
		return finDet;
	}


	/**
	 * @param finDet the finDet to set
	 */
	public void setFinDet(FinanceInfo finDet) {
		this.finDet = finDet;
	}


	/**
	 * @return the credDet
	 */
	public CredHistory getCredDet() {
		return credDet;
	}


	/**
	 * @param credDet the credDet to set
	 */
	public void setCredDet(CredHistory credDet) {
		this.credDet = credDet;
	}


	public Personal() {
		// TODO Auto-generated constructor stub

	}

}
