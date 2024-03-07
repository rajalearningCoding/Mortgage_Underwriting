/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.service;


import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;

/**
 * @author LIYAJERARD
 *
 */
public class SaveBorrowerService {
	private final Logger LOGGER = Logger.getLogger(SaveBorrowerService.class.getName());
    @Autowired
    private BorrowerRepository borrowerRepository;		
	public void saveBorrower(Borrower b) throws Exception {
		// TODO Auto-generated method stub
		


		if(this.borrowerRepository.findByPanNo(b.getPanNo()) != null) {
			System.out.println("User Exist");
			LOGGER.info("Data Retirved from DB - "+b.getName());
            throw new BpmnError("UE-001", "User already Exist");
		}
		else {
			this.borrowerRepository.save(b);
			System.out.println("User Saved");
		}
		
	}
}
