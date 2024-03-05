/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//import jakarta.persistence.*;
/**
 *
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Borrower")
public class Borrower {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer caseNo;
	public String borrowerType;
	public String name;
	public Date dob;
	public String panNo;
	//@Embedded
	public ContactInfo contDetails;
	//@Embedded
	public EmpHistory empHist;
	//@Embedded
	public FinanceInfo finDet;
	//@Embedded
	public CreditHistory credDet;

	// relationship

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "Borrower")
	@JsonIgnore
	private Set<CreditHistory> creditHistories = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "Borrower")
	@JsonIgnore
	private Set<EmpHistory> empHistories = new HashSet<>();
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "Borrower")
	@JsonIgnore
	private Set<FinanceInfo> financeInfos = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "Borrower")
	@JsonIgnore
	private Set<ContactInfo> contactInfos = new HashSet<>();*/



}
