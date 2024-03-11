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
		    Borrower user = this.borrowerRepository.findByPanNo(panNo);

		        if(user!=null)
		        {
		        	user.setCaseStatus(caseStatus);
		        	user.setCancelReason(cancelReason);
		        	user.setCaseModifiedDate(caseModifiedDate);
		        	this.borrowerRepository.save(user);
		        	
		        	System.out.println("Request has been cancelled ");
					
		        }
		        else 
		        {	        	
		        	  System.out.println("Request Cancellation Not Request Got Cancelled");
		        }
	       

		
		
		
		}	
		
		
}



