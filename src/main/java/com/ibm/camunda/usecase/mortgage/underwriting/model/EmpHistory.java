/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.model;

import java.util.Date;

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
@Table(name = "EmpHistory")
public class EmpHistory {

	/**
	 * 
	 */
	public String employerName;
	public Date empStartDate;
	public Date empEndDate;
	public long income;
    @Id
    public long id;
	public String pan;



}
