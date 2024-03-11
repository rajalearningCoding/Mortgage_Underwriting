package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
@Component("propertyAppraisalReport")
public class PropertyAppraisalReport  implements JavaDelegate{
    @Override
    public void execute(DelegateExecution execution) throws Exception
    {
       var panNo = execution.getVariable("panNo");
        var caseNo = execution.getVariable("caseNo");
        System.out.println("propertyAppraisalReport initiated for Borrower case NO : "+caseNo +" PAN NO: "+panNo);

    }
}