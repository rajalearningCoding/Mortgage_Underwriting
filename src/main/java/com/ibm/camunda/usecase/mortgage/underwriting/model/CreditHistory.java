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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Embeddable
@Table(name= "CreditHistory")
public class CreditHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CreditHistory_ID")
	private long id;
	public long credScore;
	public String credReport;
	//	@ManyToOne(fetch = FetchType.EAGER )
	//@JoinColumn(name="caseNo")
	//	private Borrower borrower;


}
