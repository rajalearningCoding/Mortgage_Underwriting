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
public class FinanceInfo {

	/**
	 * 
	 */
	public String assets;
	public String liabilities;
	public long debts;
	//public String pan;
	/**
	 * @param assets
	 * @param liabilities
	 * @param debts
	 * @param pan
	 */
	/*public FinanceInfo(String assets, String liabilities, long debts, String pan) {
		super();
		this.assets = assets;
		this.liabilities = liabilities;
		this.debts = debts;
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
	 * @param assets
	 * @param liabilities
	 * @param debts
	 */
	public FinanceInfo(String assets, String liabilities, long debts) {
		super();
		this.assets = assets;
		this.liabilities = liabilities;
		this.debts = debts;
	}
	/**
	 * @return the assets
	 */
	public String getAssets() {
		return assets;
	}
	/**
	 * @param assets the assets to set
	 */
	public void setAssets(String assets) {
		this.assets = assets;
	}
	/**
	 * @return the liabilities
	 */
	public String getLiabilities() {
		return liabilities;
	}
	/**
	 * @param liabilities the liabilities to set
	 */
	public void setLiabilities(String liabilities) {
		this.liabilities = liabilities;
	}
	/**
	 * @return the debts
	 */
	public long getDebts() {
		return debts;
	}
	/**
	 * @param debts the debts to set
	 */
	public void setDebts(long debts) {
		this.debts = debts;
	}
	public FinanceInfo() {
		// TODO Auto-generated constructor stub
	}

}
