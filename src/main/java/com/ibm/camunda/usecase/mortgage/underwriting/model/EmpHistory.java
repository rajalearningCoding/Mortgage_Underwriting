/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

//import jakarta.persistence.Embeddable;

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

@Table(name= "EmpHistory")
public class EmpHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmpHistory_ID")
	private long id;
	public String employerName;
	public Date empStartDate;
	public Date empEndDate;
	public long income;
	//@ManyToOne(fetch = FetchType.EAGER )
	//@JoinColumn(name="caseNo")
	//private Borrower borrower;

}
