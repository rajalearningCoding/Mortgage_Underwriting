/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

//import jakarta.persistence.Embeddable;

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
//@Embeddable
@Entity
@Table(name = "ContactInfo")
public class ContactInfo {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ContactInfo_ID")
	private long id;
	public Address address;
	public long phoneNumber;
	public String email;

	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name="caseNo")
	private Borrower borrower;



}
