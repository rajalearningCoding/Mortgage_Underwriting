/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.service;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;

/**
 * @author LIYAJERARD
 *
 */
public interface SaveBorrowerServiceInt {
	
	void saveBorrower(Borrower b) throws Exception;

}
