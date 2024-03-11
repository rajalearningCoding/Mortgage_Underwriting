package com.ibm.camunda.usecase.mortgage.underwriting.delegate;






import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.repository.BorrowerRepository;



@Component("cancelRequest")
public class CancelRequest implements JavaDelegate {

	
	 @Autowired
	    private BorrowerRepository borrowerRepository;
	
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		
		    String caseStatus=(String) execution.getVariable("caseStatus");
		    String cancelReason=(String) execution.getVariable("cancelReason");
		    Date caseModifiedDate=new Date();
		   
	       	System.out.println("Cancel Request");
		    String panNo = (String) execution.getVariable("panNo");
		    System.out.println(panNo);//Printing panNo Value
		    Borrower panNo1 = this.borrowerRepository.findByPanNo(panNo);

		        if(panNo1!=null)
		        {
		        	panNo1.setCaseStatus(caseStatus);
		        	panNo1.setCancelReason(cancelReason);
		        	panNo1.setCaseModifiedDate(caseModifiedDate);
		        	this.borrowerRepository.save(panNo1);
		        	
		        	System.out.println("Request has been cancelled ");
					
		        }
		        else 
		        {	        	
		        	  System.out.println("Request Cancellation Not Request Got Cancelled");
		        }
	       

		
		
		
		}	
		
		
}



