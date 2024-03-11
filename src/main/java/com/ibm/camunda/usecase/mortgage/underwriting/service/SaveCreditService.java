package com.ibm.camunda.usecase.mortgage.underwriting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;

@Service
public class SaveCreditService {
	@Autowired
	BorrowerRepository borrowerRepository;
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

}
