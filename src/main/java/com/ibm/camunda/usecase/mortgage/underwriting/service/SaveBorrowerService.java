/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.service;
import org.springframework.stereotype.Service;
import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;

/**

 *
 */
@Service
public interface SaveBorrowerService {
	//private final Logger LOGGER = Logger.getLogger(SaveBorrowerService.class.getName());
	public void saveBorrower(Borrower b) throws Exception ;
	void saveCredit(Borrower b);
	void saveUWAction(Borrower b,String actionType);
}
