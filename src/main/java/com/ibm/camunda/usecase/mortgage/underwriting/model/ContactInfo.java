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
public class ContactInfo {

	/**
	 * 
	 */
	public Address address;
	public long phoneNumber;
	public String email;	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 * @param phoneNumber
	 * @param email
	 */
	public ContactInfo(Address address, long phoneNumber, String email) {
		super();
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public ContactInfo() {
		// TODO Auto-generated constructor stub
	}

}
