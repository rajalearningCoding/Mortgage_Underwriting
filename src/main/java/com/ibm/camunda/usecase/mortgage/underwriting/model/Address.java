/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

/**
 * @author LIYAJERARD
 *
 */
public class Address {

	/**
	 * 
	 */
	private String address2;
	private String country;
	private String state;
	private String city;
	private int pin;
	private String address1;
	/**
	 * @param address2
	 * @param country
	 * @param state
	 * @param city
	 * @param pin
	 * @param address1
	 */
	public Address(String address2, String country, String state, String city, int pin, String address1) {
		super();
		this.address2 = address2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.address1 = address1;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
		

}
