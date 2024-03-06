package com.ibm.camunda.usecase.mortgage.underwriting.def.services.implementation;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("checkDuplicateCase")
public class CheckDuplicateCase implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(CheckDuplicateCase.class.getName());

    public void execute(DelegateExecution execution) throws Exception {

        // We should invoke this service from duplicate service

        String panNo = (String) execution.getVariable("panNo");

        LOGGER.info("proUser final Amount Calculated"+panNo);

    }

}


