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

        System.out.println("Call from Title Report ");
        execution.setVariable("propertytaxes",0);

        //propertytaxes



    }
}