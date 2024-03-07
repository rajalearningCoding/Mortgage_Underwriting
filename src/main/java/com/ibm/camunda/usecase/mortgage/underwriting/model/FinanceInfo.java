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
@Table(name = "FinanceInfo")
public class FinanceInfo {

	/**
	 * 
	 */
	public String assets;
	public String liabilities;
	public long debts;
    @Id
    public long id;
	public String pan;


}
