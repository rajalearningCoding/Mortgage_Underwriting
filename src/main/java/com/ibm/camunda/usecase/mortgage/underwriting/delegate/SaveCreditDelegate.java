package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.camunda.usecase.mortgage.underwriting.model.Borrower;
import com.ibm.camunda.usecase.mortgage.underwriting.service.SaveBorrowerServiceImpl;

@Component("saveCredit")
public class SaveCreditDelegate implements JavaDelegate{
	@Autowired
	SaveBorrowerServiceImpl sb;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Borrower b = new Borrower();
		String credReport,propAppraisal,panNo;
		long mortgageLiens=0,propTaxes=0,creditScore=0;
		System.out.println("save credit delegate called");
		if(execution.getVariable("creditScore")!=null && execution.getVariable("creditScore")!="") {
			creditScore = (long)execution.getVariable("creditScore");
			b.setCreditScore(creditScore);
		}
		if(execution.getVariable("propTaxes")!=null && execution.getVariable("propTaxes")!="") {
			propTaxes = (long)execution.getVariable("propTaxes");
			b.setPropTaxes(propTaxes);
		}
		if(execution.getVariable("mortgageLiens")!=null && execution.getVariable("mortgageLiens")!="") {
			mortgageLiens = (long)execution.getVariable("mortgageLiens");
			b.setMortgageLiens(mortgageLiens);
		}
		if(execution.getVariable("credReport")!=null && execution.getVariable("credReport")!="") {
			credReport = (String)execution.getVariable("credReport");
			b.setCredReport(credReport);
		}
		if(execution.getVariable("propAppraisal")!=null && execution.getVariable("propAppraisal")!="") {
			propAppraisal = (String)execution.getVariable("propAppraisal");
			b.setPropAppraisal(propAppraisal);
		}
		if(execution.getVariable("panNo")!=null && execution.getVariable("panNo")!="") {
			panNo = (String)execution.getVariable("panNo");
			b.setPanNo(panNo);
		}
		System.out.println("cred Info taken from execution state");
		this.sb.saveCredit(b);
		System.out.println("cred Info saved in db");

		
	}
	

}
