/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author LIYAJERARD
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ContactInfo")
public class ContactInfo {

	/**
	 * 
	 */
	//public Address address;

	public String country;
	public String state;
	public String city;
	public int pin;
	public String address1;
	public String address2;
	public long phoneNumber;
	public String email;
	public String panNo;
    @Id
	public long contactId;


}
