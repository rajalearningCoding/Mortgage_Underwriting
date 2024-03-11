/**
 * 
 */
package com.ibm.camunda.usecase.mortgage.underwriting.service;


import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;

/**
 * @author LIYAJERARD
 *
 */
@Service
public class SaveBorrowerServiceImpl implements  SaveBorrowerService{
	private final Logger LOGGER = Logger.getLogger(SaveBorrowerServiceImpl.class.getName());
	@Autowired
	private BorrowerRepository borrowerRepository; 
	@Override
	public void saveBorrower(Borrower b) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Repo:"+this.borrowerRepository);
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
	public void saveCredit(Borrower b) {
		Borrower borrower = new Borrower();
		try {
			if( this.borrowerRepository.findByPanNo(b.getPanNo())!=null ) {
				borrower = this.borrowerRepository.findByPanNo(b.getPanNo());
				if(b.getCreditScore()!=0) {
					borrower.setCreditScore(b.getCreditScore());
				}
				if(b.getPropTaxes()!=0) {
					borrower.setPropTaxes(b.getPropTaxes());
				}
				if(b.getMortgageLiens()!=0) {
					borrower.setMortgageLiens(b.getMortgageLiens());
				}
				if(b.getCredReport()!=null) {
					borrower.setCredReport(b.getCredReport());
				}
				if(b.getPropAppraisal()!=null) {
					borrower.setPropAppraisal(b.getPropAppraisal());
				}
				this.borrowerRepository.save(borrower);
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured while saving credit details"+e);
		}
	}
	
	public void saveUWAction(Borrower b,String actionType) {
		
		if(actionType == "saveUW1") {
			Borrower borrower = new Borrower();
			System.out.println("Inside save details for uW1");
			try {
				if( this.borrowerRepository.findByPanNo(b.getPanNo())!=null ) {
					borrower = this.borrowerRepository.findByPanNo(b.getPanNo());
					if(b.getUw1Action()!=null && b.getUw1Action()!="") {
						System.out.println("inside if"+b.getUw1Action());
						borrower.setUw1Action(b.getUw1Action());
					}
					if(b.getUw1Comment()!=null && b.getUw1Comment()!="") {
						borrower.setUw1Comment(b.getUw1Comment());
					}
					if(b.getUw1ActionDate()!=null) {
						borrower.setUw1ActionDate(b.getUw1ActionDate());
					}
					if(b.getUw1Name()!=null && b.getUw1Name()!="") {
						borrower.setUw1Name(b.getUw1Name());
					}

					this.borrowerRepository.save(borrower);
				}
			}
			catch(Exception e) {
				System.out.println("Exception occured while saving UW1 details"+e);
			}
		}
		if(actionType == "saveUW2") {
			Borrower borrower = new Borrower();
			System.out.println("Inside save details for uW2");
			try {
				if( this.borrowerRepository.findByPanNo(b.getPanNo())!=null ) {
					borrower = this.borrowerRepository.findByPanNo(b.getPanNo());
					if(b.getUw2Action()!=null && b.getUw2Action()!="") {
						System.out.println("inside if"+b.getUw2Action());
						borrower.setUw2Action(b.getUw2Action());
					}
					if(b.getUw2Comment()!=null && b.getUw2Comment()!="") {
						borrower.setUw2Comment(b.getUw2Comment());
					}
					if(b.getUw2ActionDate()!=null) {
						borrower.setUw2ActionDate(b.getUw2ActionDate());
					}
					if(b.getUw2Name()!=null && b.getUw2Name()!="") {
						borrower.setUw2Name(b.getUw2Name());
					}

					this.borrowerRepository.save(borrower);
				}
			}
			catch(Exception e) {
				System.out.println("Exception occured while saving UW2 details"+e);
			}
		}
		
		
	}
}
