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
@Table(name = "Loan")
public class Loan {
	@Id
	public long id;
	public long loanAmount;
	public String loanTerm;
	public String intRate;
	public String loanPurp;
	public long dpAmount;
	public String loanPrg;
	public String pan;

}
