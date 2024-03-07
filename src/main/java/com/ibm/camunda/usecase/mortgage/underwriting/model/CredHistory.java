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
@Table(name = "CredHistory")
public class CredHistory {

	/**
	 * 
	 */
	public long credScore;
	public String credReport;
    @Id
    public long id;
	public String pan;
	public String empStability;
	public String payHistory;
	public int dti;
	public int ltv;

}
