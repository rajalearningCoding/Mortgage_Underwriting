/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.service;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;

/**
 * @author LIYAJERARD
 *
 */
public interface SaveBorrowerService {
	
	void saveBorrower(Borrower b) throws Exception;

}
