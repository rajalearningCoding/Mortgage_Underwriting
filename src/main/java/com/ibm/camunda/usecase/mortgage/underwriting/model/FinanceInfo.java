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
@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name= "FinanceInfo")
public class FinanceInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Finance_ID")
	private long id;
	public String assets;
	public String liabilities;
	public long debts;
	//@ManyToOne(fetch = FetchType.EAGER )
	//@JoinColumn(name="caseNo")
//	private Borrower borrower;


}
