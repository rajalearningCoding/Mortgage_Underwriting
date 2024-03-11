package com.ibm.camunda.usecase.mortgage.underwriting.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("titleReports")
public class TitleReports implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(TitleReports.class.getName());
    @Override
    public void execute(DelegateExecution execution) throws Exception {

        var panNo = execution.getVariable("panNo");
        var caseNo = execution.getVariable("caseNo");
        System.out.println("titleReports initiated for Borrower case NO : "+caseNo +" PAN NO: "+panNo);



    }
}
