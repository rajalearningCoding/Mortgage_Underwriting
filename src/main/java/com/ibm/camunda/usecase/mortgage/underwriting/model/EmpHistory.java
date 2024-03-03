/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import java.util.Date;

//import jakarta.persistence.Embeddable;

/**
 * @author LIYAJERARD
 *
 */
//@Embeddable
public class EmpHistory {

	/**
	 * 
	 */
	public String employerName;
	/**
	 * @param employerName
	 * @param empStartDate
	 * @param empEndDate
	 * @param income
	 */
	public EmpHistory(String employerName, Date empStartDate, Date empEndDate, long income) {
		super();
		this.employerName = employerName;
		this.empStartDate = empStartDate;
		this.empEndDate = empEndDate;
		this.income = income;
	}
	/**
	 * @return the employerName
	 */
	public String getEmployerName() {
		return employerName;
	}
	/**
	 * @param employerName the employerName to set
	 */
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	/**
	 * @return the empStartDate
	 */
	public Date getEmpStartDate() {
		return empStartDate;
	}
	/**
	 * @param empStartDate the empStartDate to set
	 */
	public void setEmpStartDate(Date empStartDate) {
		this.empStartDate = empStartDate;
	}
	/**
	 * @return the empEndDate
	 */
	public Date getEmpEndDate() {
		return empEndDate;
	}
	/**
	 * @param empEndDate the empEndDate to set
	 */
	public void setEmpEndDate(Date empEndDate) {
		this.empEndDate = empEndDate;
	}
	/**
	 * @return the income
	 */
	public long getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(long income) {
		this.income = income;
	}
	public Date empStartDate;
	public Date empEndDate;
	public long income;
	//public String pan;
	/**
	 * @param employerName
	 * @param empStartDate
	 * @param empEndDate
	 * @param income
	 * @param pan
	 */
	/*public EmpHistory(String employerName, Date empStartDate, Date empEndDate, long income, String pan) {
		super();
		this.employerName = employerName;
		this.empStartDate = empStartDate;
		this.empEndDate = empEndDate;
		this.income = income;
		this.pan = pan;
	}
	/**
	 * @return the pan
	 */
	/*public String getPan() {
		return pan;
	}
	/**
	 * @param pan the pan to set
	 */
	/*public void setPan(String pan) {
		this.pan = pan;
	}*/
	public EmpHistory() {
		// TODO Auto-generated constructor stub
	}

}
