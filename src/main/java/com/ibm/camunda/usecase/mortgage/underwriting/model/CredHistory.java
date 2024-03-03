/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

//import jakarta.persistence.Embeddable;

/**
 * @author LIYAJERARD
 *
 */
//@Embeddable
public class CredHistory {

	/**
	 * 
	 */
	public long credScore;
	public String credReport;
	//public String pan;
	/**
	 * @param credScore
	 * @param credReport
	 * @param pan
	 */
	/*public CredHistory(long credScore, String credReport, String pan) {
		super();
		this.credScore = credScore;
		this.credReport = credReport;
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
	}
	/**
	 * @param credScore
	 * @param credReport
	 */
	public CredHistory(long credScore, String credReport) {
		super();
		this.credScore = credScore;
		this.credReport = credReport;
	}
	/**
	 * @return the credScore
	 */
	public long getCredScore() {
		return credScore;
	}
	/**
	 * @param credScore the credScore to set
	 */
	public void setCredScore(long credScore) {
		this.credScore = credScore;
	}
	/**
	 * @return the credReport
	 */
	public String getCredReport() {
		return credReport;
	}
	/**
	 * @param credReport the credReport to set
	 */
	public void setCredReport(String credReport) {
		this.credReport = credReport;
	}
	public CredHistory() {
		// TODO Auto-generated constructor stub
	}

}
