package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import camundajar.impl.fastparse.internal.Logger;


@Component("creditReport")
public class CreditReport implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception
    {
        var panNo = execution.getVariable("panNo");
        var caseNo = execution.getVariable("caseNo");
        System.out.println("creditReport initiated for Borrower case NO: "+caseNo +" PAN NO: "+panNo);


    }


}