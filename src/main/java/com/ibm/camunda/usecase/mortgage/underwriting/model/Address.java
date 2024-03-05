/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "Address")
public class Address {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Address_ID")
	private long id;
	private String address1;
	private String address2;
	private String country;
	private String state;
	private String city;
	private int pin;
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="ContactInfo_ID")
	private Borrower borrower;
		

}
