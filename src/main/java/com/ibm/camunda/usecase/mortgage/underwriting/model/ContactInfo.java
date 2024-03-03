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
	
	/**
	 * @param address2
	 * @param country
	 * @param state
	 * @param city
	 * @param pin
	 * @param address1
	 * @param phoneNumber
	 * @param email
	 * @param pan
	 */
	/*public ContactInfo(String address2, String country, String state, String city, int pin, String address1,
			long phoneNumber, String email, String pan) {
		super();
		this.address2 = address2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.address1 = address1;
		this.phoneNumber = phoneNumber;
		this.email = email;
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

	/*private String country;
	private String state;
	private String city;
	private int pin;
	private String address1;
	private String address2;*/
	public long phoneNumber;
	public String email;
	//public String pan;
	
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
	 * @param address2
	 * @param country
	 * @param state
	 * @param city
	 * @param pin
	 * @param address1
	 * @param phoneNumber
	 * @param email
	 */
	/*public ContactInfo(String address2, String country, String state, String city, int pin, String address1,
			long phoneNumber, String email) {
		super();
		this.address2 = address2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.address1 = address1;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}*/
	/**
	 * @return the address2
	 */
	/*public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	/*public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the country
	 */
	/*public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	/*public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the state
	 */
	/*public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	/*public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the city
	 */
	/*public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	/*public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pin
	 */
	/*public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	/*public void setPin(int pin) {
		this.pin = pin;
	}

	/**
	 * @return the address1
	 */
	/*public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	/*public void setAddress1(String address1) {
		this.address1 = address1;
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
